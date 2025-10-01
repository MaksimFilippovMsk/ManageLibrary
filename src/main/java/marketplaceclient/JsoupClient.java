package marketplaceclient;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class JsoupClient {
    private Map<String,String> resultRequest = new HashMap<>();
    {
        resultRequest.put("market.yandex.ru","span.ds-text ds-text_weight_bold ds-text_color_price-term ds-text_typography_headline-3 ds-text_headline-3_tight ds-text_headline-3_bold");
    }
    public String createURLSuffix(String requestText) {
        return requestText.trim().replace(' ', '+');
    }

    public ArrayList<BookResult> getBookPrices(String requestText, String... websiteUrls) {
        ArrayList<BookResult> bookResults = new ArrayList<>();
        for (String url : websiteUrls) {
            bookResults.add(sendRequest(url, requestText));
        }
        return bookResults;
    }

    public String listToString(ArrayList<BookResult> bookResults) {
        StringBuilder sb = new StringBuilder();
        for (BookResult br : bookResults) {
            sb.append(br);
            sb.append('\n');
        }
        return sb.toString();
    }


    public static BookResult sendRequest(String websiteUrl, String bookTitle) {
        String finalURL = websiteUrl;   // + createURLSuffix(bookTitle);




        try {
            Document doc = Jsoup.connect(finalURL).get();
            Elements spans = doc.select("span.ds-text ds-text_weight_bold ds-text_color_price-term ds-text_typography_headline-3 ds-text_headline-3_tight ds-text_headline-3_bold".replace(" ","."));
            int price = Integer.parseInt(spans.get(0).text());
//            for (Element span : spans) {
//                price = Integer.parseInt(span.text());
//            }


            return null; // new BookResult(bookTitle, price, websiteUrl); fixme


//            String html = "<span class='example'>Simple text</span>";
//
//            Document doc = Jsoup.parse(html);
//            Elements spans = doc.select("span.example");
//
//            for (Element span : spans) {
//                String textContent = span.text();  // Gets visible text
//                System.out.println(textContent);  // Output: "Simple text"
//            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();   // fixme
        }
    }
}
