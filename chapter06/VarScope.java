
public class VarScope {
	//��дһ��main����
	public static void main(String[] args) {
			
	}
}

class Cat {
	//ȫ�ֱ����� Ҳ�������ԣ�������Ϊ�������� Cat�ࣺcry eat �ȷ���ʹ������
	//�����ڶ���ʱ������ֱ�Ӹ�ֵ
	int age = 10;//ָ����ֵ�� 10

	//ȫ�ֱ��������ԣ����Բ���ֵ��ֱ��ʹ�ã���Ϊ��Ĭ��ֵ
	double weight;//Ĭ��ֵ��0.0

	//�ֲ��������븳ֵ�󣬲���ʹ�ã���Ϊû��Ĭ��ֵ
	public void hi() {
		int num = 1;
		String address;
		System.out.println(num);
		//System.out.println(address);
		System.out.println(weight);//
	}

	

	public void cry() {
		//1. �ֲ�����һ����ָ�ڳ�Ա�����ж���ı���
		//2. n �� name ���Ǿֲ�����
		//3. n �� name �������� �� cry ������
		int n = 10;
		String name = "jack";
		System.out.println("��cry��ʹ������ age=" + age);
	}

	public void eat() {
		System.out.println("��eat��ʹ������ age=" + age);

		//System.out.println("��eat��ʹ��cry�ı��� name=" + name);

	}
}