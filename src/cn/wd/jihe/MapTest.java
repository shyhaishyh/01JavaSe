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
		
/*		Mappp map1 =new Mappp("CN","�й�");
		Mappp map2 =new Mappp("RS","����˹");
		Mappp map3 =new Mappp("US","����");
		List<Map> list = new ArrayList<Map>();
		list.add(map1);
		list.add(map2);
		list.add(map3);
		Scanner sc = new Scanner(System.in);
		System.out.print("��������Ҫ���ҹ��ҵ�Ӣ�ļ�ƣ�");
		String enName = sc.next();
		for (Mappp map : list) {
			if(map.getKey().equals(enName)){
				System.out.println("��Ҫ���ҵĹ����ǣ�" + map.getValue());
			}
		}	
		for (Mappp map : list) {
			System.out.println(map.getKey() + "->" + map.getValue());
		}*/
		
		//Map<key,value>���key�����ظ��ģ��������ظ�Ԫ�أ��Ḳ�����еġ�
		Map<String, String> maps = new HashMap<String, String>();
		maps.put("CN","�й�");
		maps.put("RS","����˹");
		maps.put("FR","����");
		maps.put("US","����");
		Scanner sc = new Scanner(System.in);
		System.out.print("��������Ҫ���ҹ��ҵ�Ӣ�ļ�ƣ�");
		String enName = sc.next();
		System.out.println("��Ҫ���ҵĹ����ǣ�" + maps.get(enName));	
		
		Set<String> set = maps.keySet();
		for (String map : set) {
			System.out.println(map + "->" + maps.get(map));
		}
		
		for (Map.Entry<String, String> entry : maps.entrySet()) {
			System.out.println(entry.getKey() + "-->" + entry.getValue());
		}		
//		System.out.println("Map�й���" + maps.size() + "������");
//		
//		maps.remove("FR");
//		System.out.println("Map�а���CN��Key��" + maps.containsKey("CN"));
//		
//		System.out.println("��ʾKey������" + maps.keySet());
//		System.out.println("��ʾValueֵ����" + maps.values());
//		System.out.println("��ʾ��ֵ�Լ���" + maps);
		
		
		}
	}

