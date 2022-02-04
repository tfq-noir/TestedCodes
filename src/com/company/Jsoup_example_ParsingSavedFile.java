package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
//https://dumbitdude.com/how-to-read-xml-file-in-java-using-jsoup/

public class Jsoup_example_ParsingSavedFile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\TFQ\\IdeaProjects\\RegexNumberExtraction\\src\\com\\company\\xml_Jsoup.XML");
        FileInputStream fis = new FileInputStream(file);
        Document doc = Jsoup.parse(fis, null, "", Parser.xmlParser());

        Elements rep = doc.select("Period");
        for (Element e : rep) {
            System.out.println(e.attr("value"));
        }

    }
}
