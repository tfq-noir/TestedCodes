package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Jsoup_example_ParsingHtmlFile {

    public static void main(String[] args) throws IOException {

        String xml = Jsoup.connect("https://simplesolution.dev/java-jsoup-get-html-elements-by-attribute-value/")
                .get().toString();

        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        Elements rep = doc.select("nav");
        for (Element e : rep) {
            System.out.println(e.attr("class"));
        }
    }
}