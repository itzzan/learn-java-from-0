
public class Homework05 {
	//��дһ��main����
	public static void main(String[] args) {
		Circle yuan = new Circle(3);
		System.out.println("���=" + yuan.C_s());
		System.out.println("�ܳ�=" + yuan.C_l());
	}
}

//����һ��Բ��Circle���������ԣ��뾶���ṩ��ʽԲ�ܳ����ܵķ���
//�ṩ��ʽԲ����ķ���
class Circle {
	double r;
	public Circle(double r) {
		this.r = r;
	}

	public double C_l() {
		return Math.PI*2*r;
	}

	public double C_s() {
		return Math.PI*Math.pow(r, 2);
	}
}