import java.util.Scanner;
public class Array02 {
	//��дһ��main����
	public static void main(String[] args) {
		//��ʾ �������� ������[] = new ��������[��С]
		//Ҫ��ѭ������5���ɼ������浽double���飬�����
		//
		//����
		//1. ����һ�� double ���飬��СΪ5
		
		//��1����һ�ֶ�̬���䷽ʽ
		//double scores[] = new double[5];
		
		//��2���ڶ��ֶ�̬���䷽ʽ�����������ݣ��� new ����ռ�
		double scores[];//��������
		scores = new double[5];//�������ڴ�ռ䣬���Դ������

		//ѭ������
		//scores.length ��ʾ����Ĵ�С/����
		Scanner myScanner = new Scanner(System.in);
		for (int i = 0; i < scores.length; i++) {
			System.out.println("�������" + (i+1) + "��Ԫ�ص�ֵ");
			scores[i] = myScanner.nextDouble();
		}
		//�������������
		System.out.println("��ǰ�����Ԫ��/ֵ��������£�");
		for (int i = 0; i < scores.length; i++) {
			System.out.println("��" + (i+1) + "��Ԫ�ص�ֵ=" + scores[i]);
		}
	}
}