
public class MethodExercise02 {
	//��дһ��main����
	public static void main(String[] args) {
		//1) ��д�� MyTools �࣬��дһ���������Դ�ӡ��ά��������ݡ� 
		//2) ��дһ������ copyPerson�����Ը���һ�� Person ����
		//���ظ��ƵĶ��󡣿�¡���� 
		//ע��Ҫ��õ��¶����ԭ���� ���������������Ķ���ֻ�����ǵ�������ͬ
		Person p = new Person();
		p.name = "jack";
		p.age = 20;

		//����һ��Mytools����
		Mytools tools = new Mytools();
		Person p2 = tools.copyPerson(p);

		//p �� p2 �����������Ķ��󣬶���Person����������ͬ
		System.out.println("p������ age = " + p.age + " ���� = " + p.name);
		System.out.println("p2������ age = " + p2.age + " ���� = " + p2.name);

		//��ʾ������ͨ�� ����ȽϿ����Ƿ�Ϊͬһ������
		System.out.println(p == p2);//false
	}
}

class Person {
	String name;
	int age;
}

class Mytools {
	//��¡
	//��д������˼·
	//1. �����ķ������� Person
	//2. ������ copyPerson
	//3. �������β� (Person p)
	//4. ������ ������һ���¶��󲢸������ԣ����ؼ���
	public Person copyPerson(Person p) {
		//����һ���µĶ���
		Person p2 = new Person();
		//��������
		p2.name = p.name;
		p2.age = p.age;
		return p2;
	}
}