//��ϵ������İ�����ʾ
//
public class RelationalOperator {

	//��дһ��main����
	public static void main(String[] args) {
		
		int a = 9; //�Ϻ���ʾ: �����У�������ʹ�� a, b��a1��b1��Щ
		int b = 8; 
		System.out.println(a > b);//T
		System.out.println(a >= b);//T
		System.out.println(a <= b);//F
		System.out.println(a < b);//F
		System.out.println(a == b);//F
		System.out.println(a != b);//T
		boolean flag = a > b;//T
		System.out.println("flag=" + flag);//true


	}
}