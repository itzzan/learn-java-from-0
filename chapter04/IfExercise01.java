//��˫��֧����ϰ
import java.util.Scanner;//�����

public class IfExercise01 {
	public static void main(String[] args) {

		//1����д�������� 2 �� double �ͱ�������ֵ���жϵ�һ�������� 10.0���ҵ� 2 ����С�� 20.0����ӡ����֮�͡� 
		
		double d1 = 12.1;
		double d2 = 2.2;
		if (d1 > 10.0 && d2 < 20.0) {
			System.out.println(d1 + d2);
		}

		//2) ���κ��Լ����������������� int���ж϶��ߵĺͣ��Ƿ��ܱ� 3 ���ܱ� 5 ��������ӡ��ʾ��Ϣ 
		
		int a = 10;
		int b = 5;
		int sum = a + b;
		if (sum % 3 == 0 && sum % 5 == 0) {
			System.out.println("������");
		} else {
			System.out.println("��������");
		}

		//3) �ж�һ������Ƿ������꣬����������Ƿ����������֮һ��(1)����ܱ� 4 �����������ܱ� 100 ������(2)�ܱ� 400 ����
		
		Scanner y = new Scanner(System.in);
		int year = y.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "������");
		} else {
			System.out.println(year + "��������");
		}

	}
}