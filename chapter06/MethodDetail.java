
public class MethodDetail {
	//��дһ��main����
	public static void main(String[] args) {
		//1. һ�����������һ������ֵ [˼������η��ض����� - �������� ]
		AA a = new AA();
		int[] res = a.getSumAndSub(1, 4);
		System.out.println("��=" + res[0]);
		System.out.println("��=" + res[1]);


		//ϸ�ڣ����ô������ķ���ʱ��һ����Ӧ�Ų����б�����ͬ���ͻ�������͵Ĳ���
		byte b1 = 1;
		byte b2 = 2;
		a.getSumAndSub(b1, b2);//byte -> int
		//a.getSumAndSub(1.1, 1.8);//error double -> int
		
		//ϸ�ڣ��βκ�ʵ�ε�����Ҫһ�»���ݡ�������˳�����һ��
		// a.getSumAndSub(100);//error
		//a.getSumAndSub(1.1, 1);//error ʵ�ʲ�������ʽ����˳��ͬ
	}
}

class AA {
	//ϸ�ڣ���������Ƕ�׶���
	// public void f4() {
	// 	public void f5() {
			
	// 	}
	// }


	//1. һ�����������һ������ֵ [˼������η��ض����� - �������� ]
	public int[] getSumAndSub(int n1, int n2) {

		int[] resArr = new int[2];//����һ������
		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2;
		return resArr;
	}

	//2) �������Ϳ���Ϊ�������ͣ������������ͻ���������(���飬����)
	//���忴getSumAndSub
	//
	//3) �������Ҫ���з����������ͣ��򷽷���������ִ��������Ϊ return ֵ; 
	//����Ҫ�󷵻�ֵ���ͱ���� return �� ֵ����һ�»����
	//
	public double f1() {
	//public int f1() {
		double d1 = 1.1 * 3;
		int n = 100;
		//return n; //ok int->double
		return d1;
	}

	//4) ��������� void���򷽷����п���û�� return ��䣬���� ֻд return ��ע�⣬����дֵ;
	public void f2() {
		System.out.println("Hello01");
		System.out.println("Hello01");
		System.out.println("Hello01");

		return;
	}

	//������ ��ѭ�շ�����������ü���֪�壬�����ù��ܵ���˼����, 
	//���� �õ��������ĺ� getSum, �����а��չ淶
	//����Ǽ���֮��

}