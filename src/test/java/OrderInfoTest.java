package test.java;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import main.java.ExtractService;

public class OrderInfoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="http://localhost:8080/page/u/order/orderDetail?orderNum=1511252106550001";
		Document page=ExtractService.getDocument(url);
		Elements elements = page.getAllElements();
		/*for(Element element:elements){
			Element r= element.getElementById("contactname");
			System.out.println(r);
		}*/
		System.out.println(page.getElementById("contactname"));
	}

}
