
public class MethodParameter01 {
	//��дһ��main����
	public static void main(String[] args) {
		//����AA����aa
		AA aa = new AA();
		int a = 10;
		int b = 20;
		aa.swap(a, b);
		System.out.println("a=" + a + " b=" + b);


	}
}

class AA {
	public void swap(int a, int b) {

		System.out.println("\na��b����ǰ��ֵ\na=" + a + " b=" + b);

		//���a��b�Ľ���
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("\na��b�������ֵ\na=" + a + " b=" + b);
	}
}