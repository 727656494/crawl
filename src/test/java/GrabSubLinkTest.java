package test.java;

import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import main.java.ExtractService;
import main.java.LinkTypeData;
import main.java.Rule;

public class GrabSubLinkTest {

	public static void main(String[] args) {
		Rule rule = new Rule("http://www.baidu.com/",  
	            new String[] {}, new String[] {},  
	            null, -1, Rule.GET);  
	    List<LinkTypeData> links = ExtractService.extract(rule);  
	    for(LinkTypeData linkData:links){
	    	if(linkData.getLinkHref().startsWith("http://")||linkData.getLinkHref().startsWith("https://")){
	    		Document page=ExtractService.getDocument(linkData.getLinkHref());
				Elements elements = page.getElementsByTag("a");
				for(Element ele:elements){
					System.out.println(ele);
				}
	    	}else{
	    		System.out.println("无效的url：--------------------------------"+linkData.getLinkHref());
	    	}
	    	
	    }
	}

}
