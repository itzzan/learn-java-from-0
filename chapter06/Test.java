
public class Test { //������
	int count = 9;//����
	public void count1() {// Test��ĳ�Ա����
		count = 10;//����
		System.out.println("count1=" + count);//10
	}
	public void count2() {// Test��ĳ�Ա����
		System.out.println("count1=" + count++);
	}

	//��дһ��main����
	public static void main(String[] args) {
		//���
		//1. new Test() �� �������� - Ҳ�ڶ����棬��ֻ����һ��
		//2. new Test().count1() ��������������󣬾͵���count1();
		new Test().count1();

		Test t1 = new Test();
		t1.count2();//9
		t1.count2();//10

	}
}

