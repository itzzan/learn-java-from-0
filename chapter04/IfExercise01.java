//单双分支的练习
import java.util.Scanner;//导入包

public class IfExercise01 {
	public static void main(String[] args) {

		//1）编写程序，声明 2 个 double 型变量并赋值。判断第一个数大于 10.0，且第 2 个数小于 20.0，打印两数之和。 
		
		double d1 = 12.1;
		double d2 = 2.2;
		if (d1 > 10.0 && d2 < 20.0) {
			System.out.println(d1 + d2);
		}

		//2) 【课后自己练】定义两个变量 int，判断二者的和，是否能被 3 又能被 5 整除，打印提示信息 
		
		int a = 10;
		int b = 5;
		int sum = a + b;
		if (sum % 3 == 0 && sum % 5 == 0) {
			System.out.println("能整除");
		} else {
			System.out.println("不能整除");
		}

		//3) 判断一个年份是否是闰年，闰年的条件是符合下面二者之一：(1)年份能被 4 整除，但不能被 100 整除；(2)能被 400 整除
		
		Scanner y = new Scanner(System.in);
		int year = y.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "是闰年");
		} else {
			System.out.println(year + "不是闰年");
		}

	}
}