//Ӧ�ð���2
//�������
import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		
		//��Ʊϵͳ�����ݵ��������·ݺ����䣬��ӡƱ��
		//4 - 10 ����
		//		���ˣ�18-60����60
		//		��ͯ��< 18�������
		//		���ˣ�> 60����1 / 3
		
		//1 - 3 �� 11 - 12����
		//		���ˣ�40
		//		������20
		
		//����money��������Ǯ
		int money = 0;
		//��������Scanner
		Scanner myScanner = new Scanner(System.in);
		//��������
		//��ʾ��Ϣ
		System.out.println("�����뵱ǰ�·�");
		int month = myScanner.nextInt();
		System.out.println("����������");
		int people_age = myScanner.nextInt();
		//if-else �ж� Ϊ ������������
		if (month >= 4 && month <= 10) {//����
			if (people_age >= 18 && people_age <= 60) {
				money = 60;
			} else if (people_age >= 0 && people_age < 18) {
				money = 30;
			} else if (people_age > 60) {
				money = 20;
			} else {
				System.out.println("�������������������������");
			}
		} else if ((month >= 1 && month <= 3) || (month >= 11 && month <= 12)) {//����
			if (people_age >= 18 && people_age <= 60) {
				money = 40;
			} else {
				money = 20;
			}
		} else {
			System.out.println("��������·���������������");
		}

		System.out.println("Ʊ��Ϊ " + money);
		
	}
}