
public class PropertiesDetail {
	//��дһ��main����
	public static void main(String[] args) {
		//����Person����
		//p1 - ���������������ã�
		//new Person() �����Ķ���ռ䣨���ݣ� ���������Ķ���
		Person p1 = new Person();//p1ֻ��ָ��������������Ķ����ǿ��ٳ�����

		//���������Ĭ��ֵ�������������
		System.out.println("��ǰ����˵���Ϣ");
		System.out.println("age=" + p1.age);
		System.out.println("name=" + p1.name);
		System.out.println("sal=" + p1.sal);
		System.out.println("isPass=" + p1.isPass);
	}
}

class Person {
	int age;
	String name;
	double sal;
	boolean isPass;
}