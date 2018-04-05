package com.naukri.executionEngine.collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Map_interface {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> map=new HashMap<Integer,String>();
		
		//Map<Integer,String> map1=new HashMap<Integer,String>();
		
		map.put(100,"Balaji");
		map.put(100,"Balaji1");
		map.put(101,"Saanvi");
		map.put(102,null);
		map.put(103,"Xyz");
		map.put(100,null);
		map.put(null,"Selenium");
		map.put(null,"Java");
		
		//map1.put(201, "Saanu");
		//map1.put(201,"SAAA");
		map.putAll(map);
		for(Map.Entry m:map.entrySet())
		{
			System.out.println("Key is:"+m.getKey()+"Value is:"+m.getValue());
			
		}
		
	}
}

