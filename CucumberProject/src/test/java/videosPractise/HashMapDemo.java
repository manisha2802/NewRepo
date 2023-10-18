package videosPractise;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, String> hMap=new HashMap<String, String>();
		
		hMap.put("QA", "https://wwww.qa.com");   // Add data in HashMAp
		hMap.put("Production", "https://wwww.prod.com");
		hMap.put("Readiness", "https://wwww.Readiness.com");
		hMap.put("system", "https://wwww.system.com");
		System.out.println(hMap);
		
		for(String key : hMap.keySet()) {
			
			System.out.println("Key = "+key +" Value = "+hMap.get(key));
		}
		
		hMap.remove("QA");  //2 ways to remove data
		hMap.remove("Readiness", "https://wwww.Readiness.com");
		System.out.println(hMap);

	}

}
