package main.java;

import java.util.List;

public class Application {

	public static void main(String[] args) {

/*				Rule rule = new Rule("http://news.baidu.com/ns",  
			            new String[] { "word" }, new String[] { "支付宝" },  
			            null, -1, Rule.GET);  
			    List<LinkTypeData> extracts = ExtractService.extract(rule);  
			    printf(extracts); */
			    
		 /*Rule rule2 = new Rule(  
	                "http://www1.sxcredit.gov.cn/public/infocomquery.do?method=publicIndexQuery",  
	        new String[] { "query.enterprisename","query.registationnumber" }, new String[] { "兴网","" },  
	                "cont_right", Rule.CLASS, Rule.POST);  
	        List<LinkTypeData> extracts2 = ExtractService.extract(rule2);  
	        printf(extracts2);  */
		
		Rule rule = new Rule("http://jingyan.baidu.com",  
	            new String[] {}, new String[] {},  
	            null, -1, Rule.GET);  
	    List<LinkTypeData> extracts = ExtractService.extract(rule);  
	    printf(extracts); 
    }  

    public void getDatasByCssQuery()  
    {  
        Rule rule = new Rule("http://www.11315.com/search",  
                new String[] { "name" }, new String[] { "兴网" },  
                "div.g-mn div.con-model", Rule.SELECTION, Rule.GET);  
        List<LinkTypeData> extracts = ExtractService.extract(rule);  
        printf(extracts);  
    }  
	  
	   
		


public static void printf(List<LinkTypeData> datas)  
{  
    for (LinkTypeData data : datas)  
    {  
        System.out.println(data.getLinkText());  
        System.out.println(data.getLinkHref());  
        System.out.println("***********************************");  
    }  

}  

}
