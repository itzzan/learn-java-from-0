
public class MethodExercise01 {
	//��дһ��main����
	public static void main(String[] args) {
		//1) ��д�� AA ����һ���������ж�һ���������� odd ����ż��, ���� boolean 
		AA a = new AA();
		// boolean judgeParity = a.parity(10);
		// if (judgeParity) {
		// 	System.out.println("������");
		// } else {
		// 	System.out.println("��ż��");
		// }
		
		//2) �����С��С��ַ���ӡ ��Ӧ�������������ַ���
		//���磺�У�4���У�4���ַ�#,���ӡ��Ӧ��Ч��
		
		a.f1(30, 30, '0');



	}
}

class AA {
	//˼·
	//1. �����ķ������� - boolean
	//2. ���������� - parity
	//3. �������β� - (int n)
	//4. ������ - �ж�
	public boolean parity(int n) {
		if (n % 2 == 1) {
			return true;
		} else {
			return false;
		}
		//��Ԫ�����
		// return n % 2 == 1 ? true: false;
	}

	//˼·��
	//1. �����ķ������� - void
	//2. ���������� - f1
	//3. �������β� - (int row, int col, char c)
	//4. ������ - xunhuan1
	public void f1(int row, int col, char c) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
}
