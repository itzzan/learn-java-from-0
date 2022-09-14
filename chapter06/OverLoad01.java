
public class OverLoad01 {
	//编写一个main方法
	public static void main(String[] args) {
		 
		 // System.out.println(100);
		 // System.out.println("Hello,world");
		 // System.out.println('h');
		 // System.out.println(1.1);
		 // System.out.println(true);

		MyCalculator mc = new MyCalculator();
		System.out.println(mc.calculate(1, 2));//会自动匹配calculate
		System.out.println(mc.calculate(1.1, 2));//
		System.out.println(mc.calculate(1, 2.1));//

	}
}

class MyCalculator {

	//下面的四个 calculate方法构成了重载

	public int calculate(int n1, int n2) {
		System.out.println("calculate(int n1, int n2) 被调用");
		return n1 + n2;
	}

	// public void calculate(int n1, int n2) {
	// 	System.out.println("calculate(int n1, int n2) 被调用");
	// 	return n1 + n2;
	// }

	public double calculate(int n1, double n2) {
		return n1 + n2;
	}

	public double calculate(double n1, int n2) {
		return n1 + n2;
	}

	public int calculate(int n1, int n2, int n3) {
		System.out.println("calculate(int n1, int n2, int n3) 被调用");
		return n1 + n2 + n3;
	}
}




