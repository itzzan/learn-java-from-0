import java.util.Scanner;
public class Homework03 {
	//��дһ��main����
	public static void main(String[] args) {
		//�ж�һ������Ƿ�Ϊ����
		//�����жϣ�
		//�ܱ�4���������ܱ�100����
		//�ܱ�400����
		Scanner myScanner = new Scanner(System.in);
		int year = myScanner.nextInt(); 
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + "������");
		} else {
			System.out.println(year + "��������");
		}

	}
}