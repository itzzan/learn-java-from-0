//��ʾ��Ԫ�������ʹ��

public class TernaryOperator {

	//��дһ��main����
	public static void main(String[] args) {

		int a = 10;
		int b = 99;
		//���
		//1. a > b Ϊ false
		//2. ���� b--
		//3. �ȷ���b��ֵ����b��һ
		int result = a > b ? a++ : b--;//99
		System.out.println(result);
		
		


	}

}