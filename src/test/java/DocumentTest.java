package test.java;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

public class DocumentTest {

	public static void main(String[] args) {
		String html = "<a =empty />";
        Element el = Jsoup.parse(html).getElementsByTag("a").get(0);
        el.getElementById("");
	}

}
