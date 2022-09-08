
public class BreakExercise {
	//编写一个main函数
	public static void main(String[] args) {
		//1) 1-100 以内的数求和，求出 当和 第一次大于 20 的当前数 【for + break】
		//思路分析
		//1. 循环1-100，求和sum
		//2. 当sum > 20 时，记录下当前数，然后break；
		int sum = 0;//累积和

		//注意i的作用范围在for循环里面 
		for (int i = 0; i <= 100; i++) {
			sum += i;
			if (sum > 20) {
				System.out.println(i);
				break;
			}
		}
	}
}