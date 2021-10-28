package interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;



public class Maps {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> hs = new HashMap<String,Integer>();
		hs.put("arun",100);
		hs.put("nivos",200);
		hs.put("praveen",300);
		hs.put("shivangi",400);
		
		
		Iterator<String> it = hs.keySet().iterator();
		while(it.hasNext()) {
		String key = it.next();
		int value =hs.get(key);
		System.out.println(key+" = "+value);
		}
		
		System.out.println("=====================================================");
		
		Map<String,String> map = new TreeMap<String,String>();
		map.put("arun","100");
		map.put("nivos","200");
		map.put("praveen","300");
		map.put("shivangi","400");
		
		Iterator<Entry<String,String>> it1 = map.entrySet().iterator();
		while(it1.hasNext()) {
			Entry<String, String> setValue = it1.next();
			
			System.out.println(setValue);
			}
	}

}
