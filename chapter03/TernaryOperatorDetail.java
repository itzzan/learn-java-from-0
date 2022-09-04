//三元运算符的细节

public class TernaryOperatorDetail {

	//编写一个main方法
	public static void main(String[] args) {

		//1. 表达式1和表达式2要为可以赋给接受变量的类型（或可以自动转换）
		int a = 3;
		int b = 8;
		//int c = a > b ? a : b;
		//int c = a > b ? 1.1 : 3.1;//error
		int c = a > b ? (int)1.1 : (int)3.1;//ok
		double d = a > b ? a : b + 3;//ok - 满足int -> double

		//2. 三元运算符可以转为if--else语句
		int res = a > b ? a++ : --b;
		if (a > b) {
			res = a++;
		} else {
			res = --b;
		}
		


	}

}