import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Page {
    private String url;

    public Page(){
        System.out.println("HELLO");
    }

    public Page(String url) throws IOException {
        this.url = url;
        Document d = parse();

        if (d == null){

        }
    }

    /**
     * Read url from web and convert it to the object
     *
     * @param url url of the web page
     * @return web page as document
     */
    private Document parse() throws IOException {
        try {
            return Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
