
public class This01 {
	//��дһ��main����
	public static void main(String[] args) {
		Dog dog1 = new Dog("��׳", 3);
		System.out.println("dog1��hashCode=" + dog1.hashCode());
		//dog1 ������ info() ����
		dog1.info();
		System.out.println("====================");
		Dog dog2 = new Dog("���", 2);
		System.out.println("dog2��hashCode=" + dog2.hashCode());
		dog2.info();
	}
}

class Dog {//��

	String name;
	int age;
	// public Dog(String dName, int dAge) {//������
	// 	name = dName;
	// 	age = dAge;
	// }
	//������ǵĹ��������βΣ��ܹ�ֱ��д�����������͸�����
	//��������˸����⣬���ݱ�����������ԭ�򣬹�������name ���� �ֲ������ˣ�������������
	//									   ��������age ���� �ֲ������ˣ�������������
	//==> ���� this �ؼ���
	public Dog(String name, int age) {//������
		//this.name ���ǵ�ǰ���������
		this.name = name;
		//this.age ���ǵ�ǰ���������
		this.age = age;
		System.out.println("��ǰ�����hashCode=" + this.hashCode());
	}

	public void info() {//��Ա���� - ��������������Ϣ
		System.out.println(name + "\t" + age + "\t" + "��ǰ�����hashCode=" + this.hashCode());
	}

}