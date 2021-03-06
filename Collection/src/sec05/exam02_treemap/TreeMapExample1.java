package sec05.exam02_treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {
	public static void main(String[] args) {
		TreeMap<Integer,String> scores = new TreeMap<Integer,String>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이동순");
		scores.put(new Integer(75), "박길순");
		scores.put(new Integer(95), "�ſ��");
		scores.put(new Integer(80), "���ڹ�");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		System.out.println("���� ���� ����: " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.lastEntry();
		System.out.println("���� ���� ����: " + entry.getKey() + "-" + entry.getValue() + "\n");
		
		entry = scores.lowerEntry(new Integer(95));
		System.out.println("95점 위의 점수: " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.higherEntry(new Integer(95));
		System.out.println("95�� ���� ����: " + entry.getKey() + "-" + entry.getValue() + "\n");
		
		entry = scores.floorEntry(new Integer(95));
		System.out.println("95�� �̰ų� �ٷ� �Ʒ� ����: " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.ceilingEntry(new Integer(85));
		System.out.println("85�� �̰ų� �ٷ� ���� ����: " + entry.getKey() + "-" + entry.getValue() + "\n");
		
		while(!scores.isEmpty()) {
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey() + "-" + entry.getValue() + "(���� ��ü ��: " + scores.size() + ")");
		}
	}
}
