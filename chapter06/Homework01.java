
public class Homework01 {
	//��дһ��main����
	public static void main(String[] args) {
		A01 a1 = new A01();
		double[] d1 = {1, 2, 10, 5.5, 8.3};
		Double res = a1.max(d1);
		System.out.println(res);
	}
}

//��д��A01�����巽��max��ʵ����ĳ��double��������ֵ��������
//����
//1. ���� A01
//2. ������ max
//3. �β� (double[])
//4. ����ֵ double
class A01 {
	//��д��Double ���࣬ Сд��double �ǻ�������
	public Double max(double[] d1) {
		//��֤arr������һ��Ԫ��
		//���ж�arr�Ƿ�Ϊ�գ��ٿ��Ƿ����0
		if (d1 != null && d1.length > 0) {
			double max = d1[0];
			for (int i = 1; i < d1.length; i++) {
				if (max < d1[i]) {
					max = d1[i];
				}
			}
			return max;
		} else {
			return null;
		}
		
	}
}