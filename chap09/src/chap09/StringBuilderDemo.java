package chap09;

public class StringBuilderDemo {
	public static void main(String[]args) {
		String s = new String("hi"); 
		System.out.println(s.hashCode()); //�ؽ��ڵ�: ��ü�� id������
		s = s+"!";
		//����� ���ڿ� s�� hashcode���
		System.out.println(s.hashCode()); //�� �߰��ϸ� �޸� �ּ� �����
		
		StringBuilder sb = new StringBuilder("hi");
		System.out.println(sb.hashCode()); //StringBuilderŸ���� ���ڿ� sb�� �ؽ��ڵ� ���
		sb = sb.append("!");
		System.out.println(sb.hashCode()); //�ؽ��ڵ� �״��(�����Ұ� ������ builder�����õ, �׳� string�ᵵ��)
		
		//������ sb = sb.replace(0,2,"Good bye");
		//sb = sb.insert(0,"Java,");
		System.out.println(sb.replace(0, 2, "Good bye").insert(0, "Java,"));
		System.out.println(sb.hashCode()); 
	}
}
