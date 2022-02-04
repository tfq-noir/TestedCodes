package com.company;
/** follow the link: https://aboullaite.me/jsoup-html-parser-tutorial-examples/
  */

import java.io.IOException;
        import org.jsoup.Jsoup;
        import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;


public class Jsoup_ReadingHTMLEx {

    public static void main(String[] args) throws IOException {
        // Reading the title
//        String url = "https://aboullaite.me/jsoup-html-parser-tutorial-examples/";
//        Document doc = Jsoup.connect(url).get();
//        String title = doc.title();
//        System.out.println(title);

        //Reading HTML source
//        String webPage = "https://aboullaite.me/jsoup-html-parser-tutorial-examples/";
//        String html = Jsoup.connect(webPage).get().html();
//        System.out.println(html);

        //Getting meta information
//        String weblink = "http://www.jsoup.org";
//        Document document = Jsoup.connect(weblink).get();
//        String description = document.select("meta[name=description]").first().attr("content");
//        System.out.println("Description : " + description);
//
//        String keywords = document.select("meta[name=keywords]").first().attr("content");
//        System.out.println("Keywords : " + keywords);

        //Parsing links
//        String urlLink = "http://jsoup.org";
//
//        Document documentA = Jsoup.connect(urlLink).get();
//        Elements links = documentA.select("a[href]");
//
//        for (Element link : links) {
//
//            System.out.println("link : " + link.attr("href"));
//            System.out.println("text : " + link.text());
//        }
        // Getting attributes in html page
        String xml = Jsoup.connect("https://simplesolution.dev/java-jsoup-get-html-elements-by-attribute-value/")
                .get().toString();

        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        Elements rep = doc.select("nav");
        for (Element e : rep) {
            System.out.println(e.attr("class"));
        }
    }
}