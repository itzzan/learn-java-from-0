
public class Homework13 { 
	//��дһ��main����
	public static void main(String[] args) {
		Circle c = new Circle();
		PassObject po = new PassObject();
		po.printAreas(c, 5);

	}
}

//1. ����һ��Circle�࣬����һ��double�͵�radius���Դ���Բ�İ뾶��findArea()��������Բ�����
//2. ����һ����PassObject�������ж���һ������printAreas()���÷����Ķ������£�
//public void printAreas(Circle c, int times) //����ǩ��/����
//3. ��printAreas�����д�ӡ���1��times֮���ÿ�������뾶ֵ���Լ���Ӧ�����
//���磺timesΪ5��������뾶1��2��3��4��5.�Լ���Ӧ��Բ���
//4. ��main�����е���printAreas()������������Ϻ������ǰ�뾶ֵ

class Circle {
	double radius;
	public Circle() {
		//�޲ι�����
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double findArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	//��ӷ���setRedius �޸Ķ���İ뾶ֵ
	public void setRedius(double radius) {
		this.radius = radius;
	}

}

class PassObject {
	public void printAreas(Circle c, int times) {
		System.out.println("Radius\t" + "Area");
		for (int i = 1; i <= times; i++) {
			c.setRedius(i);
			System.out.println(i + "\t" + c.findArea());
		}
	}
}
