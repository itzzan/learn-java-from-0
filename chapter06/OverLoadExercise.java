
public class OverLoadExercise {
	//编写一个main方法
	public static void main(String[] args) {
		Methods method = new Methods();
		method.m(10);
		method.m(10, 20);
		method.m("Zan");

		System.out.println(method.max(10, 24));
		System.out.println(method.max(10.0, 24.2));
		System.out.println(method.max(10.0, 24.2, 30));

	}
}


class Methods {
	//2. 
	//定义三个重载方法 max()，
	//第一个方法，返回两个 int 值中的最大值， 
	//第二个方法，返回两个 double 值中的最大值，
	//第三个方法，返回三个 double 值中的最大值，
	//并分别调用三个方法
	
	//分析
	//1. 方法名 max
	//2. 形参 （int int）
	//3. int
	public int max(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}

	public double max(double n1, double n2) {
		return n1 > n2 ? n1 : n2;
	}

	public double max(double n1, double n2, double n3) {
		//先求出n1 和 n2 的最大值
		double max1 = n1 > n2 ? n1 : n2;
		return max1 > n3 ? max1 : n3; 
	}


	//1. 
	//编写程序，类 Methods 中定义三个重载方法并调用。方法名为 m。 
	//三个方法分别接收一个 int 参数、两个 int 参数、一个字符串参数。
	//分别执行平方运算并输出结果， 相乘并输出结果，输出字符串信息。
	//在主类的 main ()方法中分别用参数区别调用三个方法

	//分析
	//方法名 m
	//形参 (int)
	//void
	public void m(int n) {
		System.out.println("平方=" + (n * n));
	}

	public void m(int n1, int n2) {
		System.out.println("相乘=" + (n1 * n2));
	}

	public void m(String str) {
		System.out.println("传入的str=" + str);
	}
}

 