
public class MethodParameter02 {
	//��дһ��main����
	public static void main(String[] args) {
		
		//����
		B b = new B();
		// int[] arr = {1, 2, 3};
		// b.test100(arr);//���÷���

		// //��������
		// System.out.println("main��arr����");
		// for (int i = 0; i < arr.length; i++) {
		// 	System.out.print(arr[i] + " ");
		// }
		// System.out.println();

		//����
		Person p = new Person();
		p.name = "jack";
		p.age = 10;
		b.test200(p);
		//�����⣬���test200ִ�е���p = null ������Ľ���� 10;
		//�����⣬���test200ִ�е���p = new Person().... ������Ľ���� 10;
		
		System.out.println("main��p.age=" + p.age);
	}
}

class Person {
	String name;
	int age;
}

class B {
	//B ���б�дһ������ test200�����Խ���һ�� Person(age,sal)����
	//�ڷ������޸ĸö������ԣ�����ԭ���Ķ����Ƿ�仯��
	//��仯
	public void test200(Person p) {
		//p.age = 10000;//�޸Ķ�������
		
		//˼��
		//p = null;
		p = new Person();
		p.name = "tom";
		p.age = 99;
	}

	//B ���б�дһ������ test100�����Խ���һ�����飬
	//�ڷ������޸ĸ����飬����ԭ���������Ƿ�仯��
	//��仯
	public void test100(int[] arr) {
		arr[0] = 200;
		//��������
		System.out.println("test100��arr����");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	

}