import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Main{
    public static void main(String[] args) {
        String url ="https://www.ucv.ro/";
        try {
            Document doc = Jsoup.connect(url).get();
            System.out.println(doc.toString());


            Element div = doc.selectFirst("div.o_stire>p");

            if (div != null) {
                System.out.println("Prima stire: " + div.text());
            } else {
                System.out.println("Div not found!");
            }
        } catch (Exception e) {
            System.out.println("Error fetching text: " + e.getMessage());
        }
    }
}
