//�Զ�����ת��ϸ��

public class AutoConvertDetail {
	public static void main(String[] args) {
		//1. �ж������͵����ݻ������ʱ��ϵͳ�����Զ�����������ת�����������������������ͣ�Ȼ���ٽ��м���
		int n1 = 10;//ok
		//float d1 = n1 + 1.1;//error  n1 + 1.1 ���������double
		double d1 = n1 + 1.1;//ok
		float d2 = n1 + 1.1F;//ok

		//2. �����ǰѾ��ȴ���������͸�ֵ������С����������ʱ���ͻᱨ����֮�ͻ�����Զ�����ת��
		//int n2 = 1.1;//error
		//
		
		//3. (byte, short) �� char֮�䲻���໥ת��
		//���Ѿ������ݸ���byteʱ�����жϸ����Ƿ���byte��Χ�ڣ�����ǣ��Ϳ��ԣ������ж�����
		byte b1 = 10;//-128 ~ 127//ok
		// int n2 = 1;
		// byte b2 = n2;

		//char c1 = b1;//error��byte�����Զ�ת����char

		//4. byte��short��char ���߿��Լ��㣨�����ǵ������㣬���ǻ�����㣩���ڼ����ʱ������ת����int����
		byte b2 = 1;
		byte b3 = 2;
		short s1 = 1;
		//short s2 = b2 + s1;//error����Ϊb2 + s1 ��������int����
		int s2 = b2 + s1;//ok

		//byte b4 = b2 + b3;//error
		//
		int mm1 = b2 + b3;//ok
		int mm2 = b2 + s1;//ok

		//5. boolean������ת��
		boolean pass = true;
		//int num100 = pass;//boolean���������͵��Զ�ת��

		//6. �Զ�����ԭ�򣺱��ʽ����������Զ�����Ϊ����������������
		//��һ����
		byte b4 = 1;
		short s3 = 100;
		int num200 = 1;
		double num300 = 1.1;

		double num500 = b4 + s3 + num200 + num300;//��double����,ok
		float num600 = b4 + s3 + num200 + num300;//error
	}
}