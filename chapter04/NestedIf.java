//Ӧ�ð���
import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		//�μӸ��ֱ�������������ɼ����� 8.0 ���������������ʾ��̭��
		//���Ҹ����Ա���ʾ�����������Ů���顣
		//����ɼ����Ա𣬽����жϺ������Ϣ��
		//[NestedIf.java] 
		//��ʾ: double score; char gender; 
		//�����ַ�: char gender = scanner.next().charAt(0)
		
		//˼·����
		//1. ����Scanner���󣬽����û�����
		//2. ���ܳɼ����浽 double score��
		//3. ʹ�� if-else �ж���������ɼ�����8.0���������������ʾ��̭
		//4. ������뵽 �������ٽ���һ��char gender����ʹ��if-else �����Ϣ
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ø��ֵĳɼ�");
		double score = scanner.nextDouble();
		if (score > 8.0) {
			System.out.println("�������Ա�");
			char gender = scanner.next().charAt(0);
			if (gender == '��') {
				System.out.println("�������������");
			} else if (gender == 'Ů') {
				System.out.println("����Ů�������");
			} else {
				System.out.println("����Ա����󣬲��ܲμӾ���");
			}

		} else {
			System.out.println("Sorry���㱻��̭��");
		}







	}
}