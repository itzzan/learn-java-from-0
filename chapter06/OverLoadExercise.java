
public class OverLoadExercise {
	//��дһ��main����
	public static void main(String[] args) {
		Methods method = new Methods();
		method.m(10);
		method.m(10, 20);
		method.m("Zan");

		System.out.println(method.max(10, 24));
		System.out.println(method.max(10.0, 24.2));
		System.out.println(method.max(10.0, 24.2, 30));

	}
}


class Methods {
	//2. 
	//�����������ط��� max()��
	//��һ���������������� int ֵ�е����ֵ�� 
	//�ڶ����������������� double ֵ�е����ֵ��
	//�������������������� double ֵ�е����ֵ��
	//���ֱ������������
	
	//����
	//1. ������ max
	//2. �β� ��int int��
	//3. int
	public int max(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}

	public double max(double n1, double n2) {
		return n1 > n2 ? n1 : n2;
	}

	public double max(double n1, double n2, double n3) {
		//�����n1 �� n2 �����ֵ
		double max1 = n1 > n2 ? n1 : n2;
		return max1 > n3 ? max1 : n3; 
	}


	//1. 
	//��д������ Methods �ж����������ط��������á�������Ϊ m�� 
	//���������ֱ����һ�� int ���������� int ������һ���ַ���������
	//�ֱ�ִ��ƽ�����㲢�������� ��˲�������������ַ�����Ϣ��
	//������� main ()�����зֱ��ò������������������

	//����
	//������ m
	//�β� (int)
	//void
	public void m(int n) {
		System.out.println("ƽ��=" + (n * n));
	}

	public void m(int n1, int n2) {
		System.out.println("���=" + (n1 * n2));
	}

	public void m(String str) {
		System.out.println("�����str=" + str);
	}
}

 