package chap11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("�ٶ���");
		list.add("������");
		list.add("����");
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
		System.out.println();
		
		Collections.sort(list); //��ü���� ������ �޾ƿ��� ó���Ҷ� collection���
		
		//�߰��� ����ִ����� : ������ �� ����ؼ� �ȳ���
		while(iterator.hasNext()) {
			System.out.print(iterator.next() +",\t");
		}
		System.out.println();
		
		iterator = list.iterator(); //�ݺ��� ��Ʈ�� ��ü�� list���� �ٽ� ����
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+ "->\t");
		}
	}

}
