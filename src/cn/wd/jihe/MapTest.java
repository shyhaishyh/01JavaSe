package cn.wd.jihe;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Set;
public class MapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
/*		Mappp map1 =new Mappp("CN","中国");
		Mappp map2 =new Mappp("RS","俄罗斯");
		Mappp map3 =new Mappp("US","美国");
		List<Map> list = new ArrayList<Map>();
		list.add(map1);
		list.add(map2);
		list.add(map3);
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入你要查找国家的英文简称：");
		String enName = sc.next();
		for (Mappp map : list) {
			if(map.getKey().equals(enName)){
				System.out.println("你要查找的国家是：" + map.getValue());
			}
		}	
		for (Mappp map : list) {
			System.out.println(map.getKey() + "->" + map.getValue());
		}*/
		
		//Map<key,value>里的key不会重复的，如果添加重复元素，会覆盖已有的。
		Map<String, String> maps = new HashMap<String, String>();
		maps.put("CN","中国");
		maps.put("RS","俄罗斯");
		maps.put("FR","法国");
		maps.put("US","美国");
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入你要查找国家的英文简称：");
		String enName = sc.next();
		System.out.println("你要查找的国家是：" + maps.get(enName));	
		
		Set<String> set = maps.keySet();
		for (String map : set) {
			System.out.println(map + "->" + maps.get(map));
		}
		
		for (Map.Entry<String, String> entry : maps.entrySet()) {
			System.out.println(entry.getKey() + "-->" + entry.getValue());
		}		
//		System.out.println("Map中共有" + maps.size() + "个数组");
//		
//		maps.remove("FR");
//		System.out.println("Map中包含CN的Key吗？" + maps.containsKey("CN"));
//		
//		System.out.println("显示Key键集：" + maps.keySet());
//		System.out.println("显示Value值集：" + maps.values());
//		System.out.println("显示键值对集：" + maps);
		
		
		}
	}

