package test.java;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.codehaus.jackson.map.ObjectMapper;

public class JsonObjectTest {
	public static void main(String[] args) {
		ObjectMapper objectMapper = new ObjectMapper();
		Map<String,Map<String,List<String>>> pros=null;
		try {
			pros=objectMapper.readValue(AreaData.GetData(), Map.class);
			for (Entry<String, Map<String,List<String>>> entry : pros.entrySet()) {  
				
			    //System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
			    System.out.println(entry.getKey());
			    for (String ee : entry.getValue().keySet()) {  
			    	
			    	System.out.println(ee);
			    	//System.out.println(entry.getValue().get(ee));
			    	for (int a = 0; a < entry.getValue().get(ee).size(); a++) {
			    		System.out.println(entry.getValue().get(ee).get(a));
					}
			    }
				/*Map<String,Map<String,Object>> citys=null;
				citys=objectMapper.readValue(entry.getValue().toString(), Map.class);
				for (Entry<String, Map<String,Object>> city : pros.entrySet()) {  
					System.out.println("城市 = " + city.getKey() + ", 区域 = " + city.getValue());  
				    
				  
				}  */
			  
			}  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//maps = objectMapper.readValue("",List.class);
	}

}
