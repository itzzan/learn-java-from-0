import java.util.Scanner;
public class Homework02 {
	//编写一个main函数
	public static void main(String[] args) {
		//实现判断一个整数，属于哪个范围：大于0，小于0，等于0
		//思路：定义int n = 22；使用if -- else 
		Scanner myScanner = new Scanner(System.in);
		int n = myScanner.nextInt();
		if (n > 0) {
			System.out.println(n + "大于0");
		} else if (n < 0) {
			System.out.println(n + "小于0");
		} else {
			System.out.println(n + "等于0");
		}

		
	}
}