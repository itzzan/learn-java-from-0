
public class ConstructDetail {
	//��дһ��main����
	public static void main(String[] args) {
		Person p1 = new Person("king", 40);
		Person p2 = new Person("tom");
		Dog dog1 = new Dog();//ʹ�õ���Ĭ�ϵ��޲ι������������Լ�������һ������������˱���
		
	}
}

class Dog {
	//�������Աû�ж��幹������ϵͳ���Զ���������һ��Ĭ���޲ι�������Ҳ��Ĭ�Ϲ�������
	//Ĭ�Ϲ�����
	//Dog() {
	//	
	//}
	
	//һ���������Լ��Ĺ�����,Ĭ�ϵĹ������͸����ˣ��Ͳ�����ʹ��Ĭ�ϵ��޲ι������� 
	///������ʽ�Ķ���һ��,��: Dog(){} д (������Ҫ)
	public Dog(String dName) {
		//...
	}
	Dog() {
		//��ʽ�Ķ���һ�� �޲ι�����
	}
	
}

class Person {
	String name;
	int age;
	//��һ��������
	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	}

	//�ڶ�����������ָֻ������������Ҫָ������
	public Person(String pName) {
		name = pName;
	}
}