public class FloatDetail {
	public static void main(String[] args) {
		//�������͵�ϸ��
		//Java �ĸ����ͳ���������ֵ��Ĭ��Ϊdouble�ͣ�����Ϊfloat�ͳ��������ӡ�f����F��
		//float num1 = 1.1;//error�������ݣ��ڴ���ʧ
		float num2 = 1.1F;//��
		double num3 = 1.1;//��

		double num4 = 1.1F;//С�������

		//ʮ��������ʽ����5.12   512.0f    .512 (0����ʡ�ԣ�������Ҫ��С����)
		double num5 = 0.123;
		double num6 = .123;//���ԣ��ȼ�num5
		System.out.println(num5);
		System.out.println(num6);

		//��ѧ��������ʽ���磺5.12e2[5.12*10��2�η�]   5.12E-2[5.12*10��-2�η�]
		System.out.println(5.12e2);//512.0
		System.out.println(5.12e-2);//0.0512

		//ͨ������£�Ӧ��ʹ�� double �ͣ���Ϊ���� float �͸���ȷ�� 
		////[����˵��]
		double num9 = 2.1234567851;
		float num10 = 2.1234567851F; 

		System.out.println(num9); 
		System.out.println(num10);

		//������ʹ������: 2.7 �� 8.1 / 3 �Ƚ� 
		//����һ�δ���
		double num11 = 2.7;
		double num12 = 8.1 / 3;//
		System.out.println(num11);//2.7
		System.out.println(num12);//�ӽ�2.7��һ��С��������2.7
		//�õ���һ����Ҫ��ʹ�õ㣺�����Ƕ���������С���Ľ�����ȱȽ��ж�ʱ����ҪС��
		//Ӧ�������������Ĳ�ֵ�ľ���ֵ����ĳ�����ȷ�Χ���ж�
		if (num11 == num12) {
			System.out.println("���");
		}

		// //��ȷ��д�� - ע�Ϳ�ݼ� ctrl + /���ٴ������ȡ��ע��
		if (Math.abs(num11 - num12) < 0.000001) {
			System.out.println("��ֵ�ǳ�С�����ҵĹ涨���ȣ���Ϊ���");
		}
		
		//����ͨ��java API ����
		System.out.println(Math.abs(num11 - num12));

		//ϸ�ڣ������ֱ�Ӳ�ѯ�õĵ�С������ֱ�Ӹ�ֵ��ֵ���ǿ���ֱ���ж����
		// ����
		double num13 = 2.7;//��ô�Ϳ���ֱ���ж����
		if (num11 == num13) {
			System.out.println("���");
		}

	}
}