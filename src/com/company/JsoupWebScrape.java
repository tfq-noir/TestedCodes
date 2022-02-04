package com.company;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class JsoupWebScrape {
    public static void main(String[] args) {
        final String url =
//                "https://www.nasdaq.com/market-activity/stocks";
                "https://web.archive.org/web/20190104110157/http://shares.telegraph.co.uk/indices/?index=MCX";

        try {
            final Document document = Jsoup.connect(url).get();

            for (Element row : document.select(
                    "table.tablesorter.full tr"))
//                    "table.mini-asset-class-tables__table tr"))

            {
                if
                (row.select("td:nth-of-type(1)").text().equals(""))
//                (row.select("th.mini-asset-class-tables__heading:nth-of-type(2)").text().equals(""))

                {
                    continue;
                }
                else {
                    final String ticker =
                            row.select("td:nth-of-type(1)").text();
//                    row.select("th.mini-asset-class-tables__heading:nth-of-type(2)").text();

                    final String name =
                            row.select("td:nth-of-type(2)").text();
                    final String tempPrice =
                            row.select("td:nth-of-type(3)").text();
                    final String tempPrice1 =
                            tempPrice.replace(",", "");
                  final double price = Double.parseDouble(tempPrice1);

                    System.out.println(ticker + " " + name + " " + price);
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
