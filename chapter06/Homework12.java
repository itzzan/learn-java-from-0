
public class Homework12 { 
	//��дһ��main����
	public static void main(String[] args) {
		

	}
}

//����һ��Employee�࣬������(���֣��Ա����䣬ְλ��нˮ)
//�ṩ3�����췽�������Գ�ʼ��
//��1�����֣��Ա����䣬ְλ��нˮ
//��2�����֣��Ա�����
//��3��ְλ��нˮ
//Ҫ���ָ��ù�����

class Employee {
	String name;
	char gender;
	int age;
	String job;
	double sal;
	public Employee(String job, double sal) {
		this.job = job;
		this.sal = sal;
	}

	public Employee(String name, char gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public Employee(String name, char gender, int age, String job, double sal) {
		// this.name = name;
		// this.gender = gender;
		// this.age = age;
		
		this(name, gender, age);//���ù�����
		// this(job, sal);
		this.job = job;
		this.sal = sal;
	}

}