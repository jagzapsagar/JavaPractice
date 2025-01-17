package com.example.demo.video.collections.insta;

import java.util.IdentityHashMap;

public class IdentityhashMapEx {
public static void main(String[] args) {
IdentityHashMap<String, String> map = new IdentityHashMap<>();
		
      String key1 = new String("Sagar");
     // Another object with the same content
      String key2 = new String("Sagar");
        
      map.put(key1, "Value1");
      map.put(key2, "Value2");
        
      System.out.println("Size of map: "+map.size());
	  System.out.println(map);
	}

}
