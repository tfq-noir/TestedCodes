package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexUrlChecking {
    // write your code here



    public static void main(String[] args) {
        List<String> myUrl = new ArrayList<String>();
        myUrl.add("http://www.betradar.com/index.php?id=13&lang=en");
        myUrl.add("https://betradar.com/index.php?lang=no&id=25:");

        String regex = "^(https?|ftp|file)://[a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|:]$";


//initialize the Pattern object
        Pattern pattern = Pattern.compile(regex);
        //searching for occurrences of regex
        for (String value : myUrl) {
            Matcher matcher = pattern.matcher(value);
            System.out.print("The address " + value + " is " + (matcher.matches() ? "valid" : "invalid"));
// ID extraction
            Pattern p = Pattern.compile("id=\\d+");
            Matcher m = p.matcher(value);
            while(m.find()) {
                System.out.println( " and " + m.group());
           }

        }
    }
}
