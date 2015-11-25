package test.java;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import main.java.ExtractService;

public class GrabNovelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i = 1; i < 10; i++) {
			String url="http://www.cnblogs.com/yexiaochai/default.html?page="+i;
			Document page=ExtractService.getDocument(url);
			Elements elements= page.getElementsByClass("forFlow").get(0).getElementsByClass("c_b_p_desc_readmore");
			for (Element element : elements)
	        {  
				System.out.println(element.attr("href"));
				Document docPage=ExtractService.getDocument(element.attr("href"));
				System.out.println(docPage.getElementById("cb_post_title_url").html());
				System.out.println(docPage.getElementById("cnblogs_post_body").text());
				
	        }
		}
		

	}

}
