
public class VarParameter01 {
	//��дһ��main����
	public static void main(String[] args) {
		HspMethod m = new HspMethod();
		System.out.println(m.sum());
		System.out.println(m.sum(1, 5, 100));

	}
}

class HspMethod {
	//���Լ��� 2�����ĺͣ�3�����ĺͣ�4��5....
	//����ʹ�÷�������
	// public int sum(int n1, int n2) {
	// 	return n1 + n2;
	// }

	// public int sum(int n1, int n2, int n3) {
	// 	return n1 + n2 + n3;
	// }

	// public int sum(int n1, int n2, int n3, int n4) {
	// 	return n1 + n2 + n3 + n4;
	// }

	//�������������������ͬ��������ͬ������������ͬ --> ʹ�ÿɱ�����Ż�
	//1. int... ��ʾ���ܵ�ʱ�ɱ����������int�������Խ��ܶ��int(0-��)
	//2. ʹ�ÿɱ����ʱ�����Ե���������ʹ�� �� nums ���Ե�������
	//3. ����nums ��ͼ���
	public int sum(int... nums) {
		//System.out.println("���ܵĲ�������=" + nums.length);
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			res += nums[i];
		}
		return res;
	}
}



 