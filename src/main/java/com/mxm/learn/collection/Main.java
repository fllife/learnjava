package com.mxm.learn.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


/**
 * <p></p>
 * @author maxianming 2017年2月6日 下午3:51:46
 * @version V1.0
 */
public class Main {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("123", "abc");
		Set<Map.Entry<String, String>> keyValues = map.entrySet();
		for (Map.Entry<String, String> entry : keyValues) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		Map<String, String> coccurentHashMap = new ConcurrentHashMap<String, String>();
		coccurentHashMap.put("123", "abc");
		Iterator<String> iter = coccurentHashMap.keySet().iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		Queue<String> queue = new LinkedList<String>();
		List<String> list = new LinkedList<String>();
		Set<String> set = new HashSet<String>();
	}
}
