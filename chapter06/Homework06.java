
public class Homework06 {
	//��дһ��main����
	public static void main(String[] args) {
		Cale cale = new Cale(2, 10);
		System.out.println("��=" + cale.sum());
		System.out.println("��=" + cale.minus());
		System.out.println("��=" + cale.mul());
		Double divRes = cale.div();
		if (divRes != null) {
			System.out.println("��=" + cale.div());
		}
	}
}

//��̴���һ��Cale�����࣬�����ж���2��������ʾ����������
//�����ĸ�����ʵ����͡���ˡ��̣�Ҫ�����Ϊ0�Ļ���Ҫ��ʾ��
//�������������󣬷ֱ����
class Cale {
	double n1;
	double n2;

	public Cale(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public double sum() {
		return n1 + n2;
	}

	public double minus() {
		return n1 - n2;
	}

	public double mul() {
		return n1 * n2;
	}

	public Double div() {
		if (n2 == 0) {
			System.out.println("����Ϊ0");
			return null;//���ڷ��ؿգ���˷�������ֻ����Double��
		}
		return n1 / n2;
	}
}