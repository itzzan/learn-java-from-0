
public class Homework09 {
	//编写一个main函数
	public static void main(String[] args) {
		//求 1 + (1+2) + (1+2+3) + (1+2+3+4) + ... + (1+2+3+...+100)
		int sum = 0;
		int cet = 0;
		for (int i = 1; i <= 100; i++) {
			cet = cet + i;
			sum = sum + cet;
		}
		System.out.println(sum);
	}
}