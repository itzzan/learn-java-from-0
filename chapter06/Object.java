
public class Object {
	//��дһ��main����
	public static void main(String[] args) {
		//����̫������ֻèè:һֻ���ֽ�С��,���� 3 ��,��ɫ��
		//����һֻ��С��,���� 100 ��,��ɫ�����дһ������
		//���û� ����Сè������ʱ������ʾ��è�����֣����䣬��ɫ��
		//����û������Сè����������ʾ ����̫û����ֻèè
		
		//1. ������������� - ���������ݵĸ�����
		//��һֻè
		// String cat1Name = "С��";
		// int cat1Age = 3;
		// String cat1Color = "��ɫ";

		// //�ڶ�ֻè
		// String cat2Name = "С��";
		// int cat2Age = 100;
		// String cat2Color = "��ɫ";

		// //���� - �����������ֲ�����
		// //		 ֻ��ͨ��[�±�]����ȡ��Ϣ����ɱ������ֺ����ݵĶ�Ӧ��ϵ����ȷ
		// //		 ��������è����Ϊ
		// String[] cat1 = {"С��", "3", "��ɫ"};
		// String[] cat2 = {"С��", "100", "��ɫ"};

		//ʹ��oop������������
		//ʵ����һֻè������һֻè����
		//new Cat() : ����һֻè
		//Cat cat1 = new Cat() ���Ѵ�����è����cat1
		//cat1 ����һ������
		Cat cat1 = new Cat();
		cat1.name = "С��";
		cat1.age = 3;
		cat1.color = "��ɫ";
		cat1.weight = 10;

		//�����˵ڶ�ֻè��������cat2
		Cat cat2 = new Cat();
		cat2.name = "С��";
		cat2.age = 100;
		cat2.color = "��ɫ";
		cat2.weight = 20;

		//��ôʹ�� - ��ô���ʶ��������
		System.out.println("��һֻè��Ϣ" + cat1.name + " " + cat1.age + " " + cat1.color + " " + cat1.weight);
		System.out.println("�ڶ�ֻè��Ϣ" + cat2.name + " " + cat2.age + " " + cat2.color + " " + cat2.weight);


	}
}


//ʹ���������ķ�ʽ�������è����
//
//����һ��è�� Cat - �Զ������������
class Cat {
	//����
	String name;//����
	int age;//����
	String color;//��ɫ
	double weight;//����
}