package test.java;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import main.java.ExtractService;


public class DocumentTest {

	public static void main(String[] args) {
		/*String html = "<a =empty />";
        Element el = Jsoup.parse(html).getElementsByTag("a").get(0);
        el.getElementById("");*/
		Document page=ExtractService.getDocument("http://localhost:8080/page/u/order/orderList");
		Elements elements = page.getAllElements();
		System.out.println(elements);
		for (Element element : elements)  
        {  
            /*Elements links = element.getElementsByTag("link");   
            for (Element link : links)  
            {  
                //必要的筛选  
                String linkHref = link.attr("href");  
                String linkText = link.text();  
                System.out.println(link);
                System.out.println(linkHref);
                System.out.println(linkText);
                
            }  */
			
			Elements textCenters=element.getElementsByClass("text-center");
			for(Element ele:textCenters){
				String text = ele.text();
				System.out.println(ele);
				System.out.println(text);
			}
        }  
	}

}
