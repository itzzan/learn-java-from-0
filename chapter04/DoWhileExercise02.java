//do while ѭ������ϰ
import java.util.Scanner;

public class DoWhileExercise02 {
	//��дһ��main����
	public static void main(String[] args) {
		//�����������Ǯ�����Ϻ���һֱʹ�������ޣ�ֱ������˵��ǮΪֹ 
		//[System.out.println("�Ϻ��ʣ���Ǯ��y/n")]
		//
		//����Ϊ��
		//��1����ͣ���ʣ���Ǯ��
		//��2��ʹ��char answer ���� - ����һ��Scanner����
		//��3����do-while �� �жϣ����y����ѭ��
		Scanner myScanner = new Scanner(System.in);
		char answer = ' ';
		do {
			System.out.println("������");
			System.out.println("��Ǯ��? y/n");
			answer = myScanner.next().charAt(0);
			System.out.println("���Ļش���" + answer);
			if (answer == 'n') {
			}
		} while (answer != 'y');//�ж������ݹؼ�
		System.out.println("������Ǯ��");
	}
}