//自动类型转换细节

public class AutoConvertDetail {
	public static void main(String[] args) {
		//1. 有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的哪种数据类型，然后再进行计算
		int n1 = 10;//ok
		//float d1 = n1 + 1.1;//error  n1 + 1.1 结果类型是double
		double d1 = n1 + 1.1;//ok
		float d2 = n1 + 1.1F;//ok

		//2. 当我们把精度大的数据类型赋值给精度小的数据类型时，就会报错，反之就会进行自动类型转换
		//int n2 = 1.1;//error
		//
		
		//3. (byte, short) 和 char之间不会相互转换
		//当把具体数据赋给byte时，先判断该数是否在byte范围内，如果是，就可以，后再判断类型
		byte b1 = 10;//-128 ~ 127//ok
		// int n2 = 1;
		// byte b2 = n2;

		//char c1 = b1;//error，byte不能自动转换成char

		//4. byte，short，char 三者可以计算（不管是单独运算，还是混合运算），在计算的时候首先转换成int类型
		byte b2 = 1;
		byte b3 = 2;
		short s1 = 1;
		//short s2 = b2 + s1;//error，因为b2 + s1 会提升到int类型
		int s2 = b2 + s1;//ok

		//byte b4 = b2 + b3;//error
		//
		int mm1 = b2 + b3;//ok
		int mm2 = b2 + s1;//ok

		//5. boolean不参与转换
		boolean pass = true;
		//int num100 = pass;//boolean不参与类型的自动转换

		//6. 自动提升原则：表达式结果的类型自动提升为操作数中最大的类型
		//看一道题
		byte b4 = 1;
		short s3 = 100;
		int num200 = 1;
		double num300 = 1.1;

		double num500 = b4 + s3 + num200 + num300;//是double类型,ok
		float num600 = b4 + s3 + num200 + num300;//error
	}
}