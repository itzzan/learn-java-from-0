import java.util.Scanner;
public class Homework03 {
	//编写一个main函数
	public static void main(String[] args) {
		//判断一个年份是否为闰年
		//闰年判断：
		//能被4整除但不能被100整除
		//能被400整除
		Scanner myScanner = new Scanner(System.in);
		int year = myScanner.nextInt(); 
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + "是闰年");
		} else {
			System.out.println(year + "不是闰年");
		}

	}
}