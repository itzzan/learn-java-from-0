//if-else �Ŀ�������
import java.util.Scanner;//�����

public class If02 {
	public static void main(String[] args) {

		//���󣺱�дһ������,���������˵�����,�����ͬ־��������� 18 ��, 
		////����� "��������� 18,Ҫ���Լ�����Ϊ����, �������"��
		///���� ,���"������䲻����ηŹ�����""
		
		//˼·����
		//1. ������������䣬Ӧ�ö���һ��Scanner�Ķ���
		//2. �����䱣�浽һ������ int age
		//3. if �жϣ����������Ϣ
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������");
		int age = scanner.nextInt();
		if (age > 18) {
			System.out.println("��������� 18,Ҫ���Լ�����Ϊ����,�������");
		} else {//˫��֧
			System.out.println("������䲻����ηŹ�����");
		}

		System.out.println("�������....");
		
	}
}