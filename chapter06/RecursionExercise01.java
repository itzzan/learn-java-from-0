
public class RecursionExercise01 {
	//编写一个main方法
	public static void main(String[] args) {
		T t1 = new T();
		int n = 7;
		int res = t1.Fibonacci(n);
		if (res != -1) {
			System.out.println("当n= " + n + "对应的斐波那契数=" + res);
		}
	}
}

class T {
	//请使用递归的方式求出斐波那契数1，1，2，3，5，8，13
	//给一个整数n，求出值
	//思路
	//1. 当n = 1 ，值为1
	//2. 当n = 2 ，值为1
	//3. 当n >= 3, 值为前两个数之和
	//递归的思路
	public int Fibonacci(int n) {
		if (n >= 1) {
			if (n == 1 || n == 2) {
				return 1;
			} else {
				return Fibonacci(n - 1) + Fibonacci(n - 2);
			}
		} else {
			System.out.println("要求输入的n>=1的整数");
			return -1;
		}
	}
}
