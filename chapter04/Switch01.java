
import java.util.Scanner;
public class Switch01 {
	//��дһ��main����
	public static void main(String[] args) {
		//���дһ�����򣬸ó�����Խ���һ���ַ�������:a,b,c,d,e,f,g a ��ʾ����һ��b ��ʾ���ڶ�
		//�����û���������ʾ��Ӧ����Ϣ.Ҫ��ʹ�� switch ������
		
		//˼·����
		//1. ����һ���ַ�������Scanner����
		//2. ʹ��switch�����ƥ�䣬�������Ӧ��Ϣ
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������һ���ַ�(a-g)");
		char c1 = myScanner.next().charAt(0);
		switch (c1) {
			case 'a' :
				System.out.println("��������һ�����Ӵ�����");
				break;
			case 'b' : 
				System.out.println("�������ڶ�,���ӵ�С��"); 
				break; 
			case 'c' : 
				System.out.println("����������,������ѩɽ.."); 
				break; 
			case 'd' :
				System.out.println("����������");
				break;
			case 'e' :
				System.out.println("����������");
				break;
			case 'f' :
				System.out.println("����������");
				break;
			case 'g' :
				System.out.println("����������");
				break;
			default: 
				System.out.println("��������ַ�����ȷ��û��ƥ���");
		}
		
		System.out.println("�˳���switch������ִ�г���");

	}
}