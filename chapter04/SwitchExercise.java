
import java.util.Scanner;
public class SwitchExercise {
	//��дһ��main����
	public static void main(String[] args) {
		//1) ʹ�� switch ��Сд���͵� char ��תΪ��д(��������)��ֻת�� a, b, c, d, e. ��������� "other"�� 
		//�������myScanner
		Scanner myScanner = new Scanner(System.in);
		//��������
		// char c = myScanner.next().charAt(0);
		// switch (c) {
		// 	case 'a' :
		// 		System.out.println("A");
		// 		break;
		// 	case 'b' :
		// 		System.out.println("B");
		// 		break;
		// 	case 'c' :
		// 		System.out.println("C");
		// 		break;
		// 	case 'd' :
		// 		System.out.println("D");
		// 		break;
		// 	case 'e' :
		// 		System.out.println("E");
		// 		break;
		// 	default :
		// 		System.out.println("other");
		// }

		//2) ��ѧ���ɼ����� 60 �ֵģ����"�ϸ�"������ 60 �ֵģ����"���ϸ�"��
		//(ע������ĳɼ����ܴ��� 100), ��ʾ �ɼ�/60 
		//˼·����
		//1. ����⣬����ʹ�� ��֧����ɣ� ����Ҫ��ʹ�� switch 
		//2. ����������Ҫ����һ��ת��, ���˼· : 
		// 		����ɼ��� [60,100] , (int)(�ɼ�/60) = 1 //
		// 		����ɼ��� [0,60) , (int)(�ɼ�/60) = 0
		
		// int score = myScanner.nextInt();
		// switch (score / 10) {
		// 	case 10:
		// 	case 9:
		// 	case 8:
		// 	case 7:
		// 	case 6:
		// 		System.out.println("�ϸ�");
		// 		break;
		// 	case 5:
		// 	case 4:
		// 	case 3:
		// 	case 2:
		// 	case 1:
		// 	case 0;
		// 		System.out.println("���ϸ�");
		
		// switch (score / 60) {
		// 	case 1:
		// 		System.out.println("�ϸ�");
		// 		break;
		// 	case 0:
		// 		System.out.println("���ϸ�");
		// 		break;
		// 	default :
		// 		System.out.println("�����������������");
		// } 		
		

		//3) ��������ָ���·ݣ���ӡ���·������ļ��ڡ�3,4,5 ���� 6,7,8 �ļ� 9,10,11 �＾ 12, 1, 2 ���� 
		//[������ϰ, ��ʾ ʹ�ô�͸ ]
		
		int month = myScanner.nextInt();
		switch (month) {
			case 3:
			case 4:
			case 5:
				System.out.println("����");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("�ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("�＾");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("����");
				break;
			default :
				System.out.println("�����������������");
		}

	}
}