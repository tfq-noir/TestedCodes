package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;

public class Jsoup_example {
    public static void main(String[] args) {
        String xmlString = "<RESULT>\r\n" +
                "    <ITEM>\r\n" +
                "       <R1>\r\n" +
                "           <B DESC =\"\">\r\n" +
                "               <B1>B1<B1>\r\n" +
                "           </B>\r\n" +
                "           <C DESC =\"\">\r\n" +
                "               <CR1>\r\n" +
                "                   <C1>C1(from CR1)</C1>\r\n" +
                "               </CR1>\r\n" +
                "               <CR2>\r\n" +
                "                   <C1>C1(from CR2)</C1>\r\n" +
                "               </CR2>\r\n" +
                "               <CR3>\r\n" +
                "                   <C1>C1(from CR3)</C1>\r\n" +
                "               </CR3>\r\n" +
                "           </C>\r\n" +
                "       </R1>\r\n" +
                "   </ITEM>\r\n" +
                "</RESULT>";

        Document document = Jsoup.parse(xmlString);

        List<AbstractMap.SimpleEntry<String, String>> list = new ArrayList<>();

        Elements elements = document.select("ITEM");
        for (Element element : elements) {
            String medicationBasic = element.select("B1").text();
            element.select("C1").forEach(c1Element -> {
                String medicationOrigin = c1Element.text();
                list.add(new AbstractMap.SimpleEntry<String, String>(medicationBasic, medicationOrigin));

            });
        }

        System.out.println(list);
    }
}