//�κ���ҵ

public class Homework01 {

	//��дһ��main����
	public static void main(String[] args) {	

		System.out.println(10 / 3);//3
		System.out.println(10 / 5);//2
		System.out.println(10 % 2);//0
		//a % b �� a ��С��ʱ����ʽΪ = a - (int)a / b * b;
		//							-10.5 - (-10) / 3 * 3 == -10.5 - (-9) == -10.5 + 9 == -1.5
		System.out.println(-10.5 % 3);//-1.5
		
		int i = 66;
		System.out.println(++i+i);// i = i + 1 ==> i = 67 ==> 134
		
	}

}