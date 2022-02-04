package com.company;
/*
 a) Write ONE regular expression that matches ALL OF the following e-mail addresses:
t.johansen@betradar.com
o.norder@sportradar.com
T.testesen@sportradar.ag
*/
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexEmailChecking {
    public static void main(String[] args) {
        List<String> emails = new ArrayList<String>();
        emails.add("t.johansen@betradar.com");
        emails.add("T.testesen@sportradar.ag");
        emails.add("o.norder@sportradar.com");
        // Example of some invalid email addresses
        emails.add("bonny.example.com");
        emails.add("jenny@.example.com");
        emails.add("julia?@betradar.com");

        String regex = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+[.][a-zA-Z0-9]+[.a-zA-Z0-9]*$";

        Pattern pattern = Pattern.compile(regex);
        for(String email : emails){
            Matcher matcher = pattern.matcher(email);
            System.out.println(email +" : "+ matcher.matches());
        }
    }
}
