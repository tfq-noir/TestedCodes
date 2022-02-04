package com.company;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexNumberExtract {

    public static void main(String[] args) {

            {
                Pattern p = Pattern.compile("\\d+");
                Matcher m = p.matcher("string1234more567string890");
                while(m.find()) {
                    System.out.println(m.group());
                }
            }
        }

}
