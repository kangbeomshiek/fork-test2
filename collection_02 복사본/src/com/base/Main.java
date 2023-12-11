package com.base;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
							
						
					//Map
		
		HashMap<String, String> hashMap =new HashMap<String, String>();
		hashMap.put("Apple", "사과");
		hashMap.put("Banana", "바나나");									
							
		System.out.println(hashMap);
		
		System.out.println(hashMap.get("Apple"));
		
		
		hashMap.put("Apple" , "Apple");				//있는 키에 데이터를 집어 넣으면 수정이 된다
		System.out.println(hashMap);
		
		hashMap.remove("Apple");					//삭제
		System.out.println(hashMap);
		hashMap.clear();
		System.out.println(hashMap);
							
						
			
						
					
	}

}
