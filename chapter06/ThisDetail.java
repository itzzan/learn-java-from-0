
public class ThisDetail {
	//��дһ��main����
	public static void main(String[] args) {
		// T t1 = new T();
		// t1.f2();
		T t2 = new T();
		t2.f3();
	}
}

class T {

	String name = "jack";
	int age = 100;

	//ϸ��;���ʹ������﷨��this(�����б�); 
	//ע��ֻ���ڹ�������ʹ��(��ֻ���ڹ������з�������һ��������, ������ڵ�һ�����)
	public T() {
		this("jack", 100);
		System.out.println("T() ������");
		//ϣ����������ʵ�T(String name, int age)������
		
	}

	public T(String name, int age) {
		System.out.println("T(String name, int age) ������");
	}	

	//ϸ�ڣ�ͨ��this�ؼ��ֿ����������ʱ��������
	public void f3() {
		String name = "smith";
		//��ͳ����
		System.out.println("name=" + name + " age=" + age);//smith�ͽ�ԭ��
		//Ҳ����ʹ��this��������
		System.out.println("name=" + this.name + " age=" + this.age);//jack
		
	}

	//ϸ�ڣ����ʳ�Ա�������﷨��this.������(�����б�)
	public void f1() {
		System.out.println("f1() ����..");
	}

	public void f2() {
		System.out.println("f2() ����..");
		//���ñ����f1
		//��һ�ַ�ʽ
		f1();
		//�ڶ��ַ�ʽ
		this.f1();
	}
}