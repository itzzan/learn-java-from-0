
//�����������
import java.util.Scanner;//��ʾ��java.util�µ�Scanner�ർ�뵽���ļ���

public class Input {

	//��дһ��main����
	public static void main(String[] args) {	
		//��ʾ�����û�������
		//����
		//Scanner�� ��ʾ ���ı�ɨ��������java.util����
		//1. ����/���� Scanner�����ڵİ�
		//2. ���� Scanner ���� ��new ����һ��
		//myScanner ���� Scanner��Ķ���
		
		Scanner myScanner = new Scanner(System.in);
		//3. �����û����� - ʹ�� ��صķ���
		System.out.println("����������");

		//������ִ�е� next ����ʱ����ȴ��û����룬���û������룬��һֱͣ������
		String name = myScanner.next();// ��ʾ�����û������ַ���
		System.out.println("����������");
		int age = myScanner.nextInt();// ��ʾ�����û�����int
		System.out.println("������нˮ");
		double sal = myScanner.nextDouble();// ��ʾ�����û�����double

		System.out.println("�˵���Ϣ���£�");
		System.out.println("����=" + name + " ����=" + age + " нˮ=" + sal);
		
		
	}

}