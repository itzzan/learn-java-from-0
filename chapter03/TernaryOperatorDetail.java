//��Ԫ�������ϸ��

public class TernaryOperatorDetail {

	//��дһ��main����
	public static void main(String[] args) {

		//1. ���ʽ1�ͱ��ʽ2ҪΪ���Ը������ܱ��������ͣ�������Զ�ת����
		int a = 3;
		int b = 8;
		//int c = a > b ? a : b;
		//int c = a > b ? 1.1 : 3.1;//error
		int c = a > b ? (int)1.1 : (int)3.1;//ok
		double d = a > b ? a : b + 3;//ok - ����int -> double

		//2. ��Ԫ���������תΪif--else���
		int res = a > b ? a++ : --b;
		if (a > b) {
			res = a++;
		} else {
			res = --b;
		}
		


	}

}