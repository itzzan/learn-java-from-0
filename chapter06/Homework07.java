
public class Homework07 {
	//��дһ��main����
	public static void main(String[] args) {
		Dog dog1 = new Dog("tom", "��ɫ", 2);
		dog1.show();

	}
}

//���һ��Dog�࣬�����֡���ɫ���������ԣ������������show()��ʾ����Ϣ
//���������󣬽��в��ԣ���ʾ��this.���ԣ�
class Dog {
	String name;
	String color;
	int age;
	public Dog(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public void show() {
		System.out.println("��Ϣ���£�");
		System.out.println("����=" + this.name);
		System.out.println("��ɫ=" + this.color);
		System.out.println("����=" + this.age);
	}

}