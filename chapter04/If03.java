//���֧�Ŀ�����ϰ

import java.util.Scanner;
public class If03 {
	public static void main(String[] args) {

		/*���뱣��ͬ־��֥�����÷֣� 
		����� 
		���÷�Ϊ 100 ��ʱ����� ���ü��ã� 
		���÷�Ϊ(80��99]ʱ����� �������㣻 
		���÷�Ϊ[60,80]ʱ����� ����һ�㣻 
		������� ����� ���� ������ 
		��Ӽ������뱣����֥�����÷֣��������ж� 
		�ٶ����÷���Ϊ int */

		Scanner myScanner = new Scanner(System.in);
		System.out.println("�����뱣��ͬ־��֥�����÷�(1-100)");
		int score = myScanner.nextInt();

		//�ȶ���������÷֣�����һ����Χ����Ч�ж� 1-100��������ʾ�������
		if (score >= 1 && score <= 100) {
			if (score == 100) {
				System.out.println("���ü���");
			} else if (score > 80 && score <= 99) {
				System.out.println("��������");
			} else if (score >= 60 && score <= 80) {
				System.out.println("����һ��");
			} else {
				System.out.println("���ò�����");
			}
		} else {
			System.out.println("���÷���Ҫ��1-100�����������룡");
		}

		


	}
}