//多分支的课堂练习

import java.util.Scanner;
public class If03 {
	public static void main(String[] args) {

		/*输入保国同志的芝麻信用分： 
		如果： 
		信用分为 100 分时，输出 信用极好； 
		信用分为(80，99]时，输出 信用优秀； 
		信用分为[60,80]时，输出 信用一般； 
		其它情况 ，输出 信用 不及格 
		请从键盘输入保国的芝麻信用分，并加以判断 
		假定信用分数为 int */

		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入保国同志的芝麻信用分(1-100)");
		int score = myScanner.nextInt();

		//先对输入的信用分，进行一个范围的有效判断 1-100，否则提示输入错误
		if (score >= 1 && score <= 100) {
			if (score == 100) {
				System.out.println("信用极好");
			} else if (score > 80 && score <= 99) {
				System.out.println("信用优秀");
			} else if (score >= 60 && score <= 80) {
				System.out.println("信用一般");
			} else {
				System.out.println("信用不及格");
			}
		} else {
			System.out.println("信用分需要在1-100，请重新输入！");
		}

		


	}
}