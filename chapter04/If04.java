//应用案例2
//导输入包
import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		
		//出票系统：根据淡旺季的月份和年龄，打印票价
		//4 - 10 旺季
		//		成人（18-60）：60
		//		儿童（< 18）：半价
		//		老人（> 60）：1 / 3
		
		//1 - 3 和 11 - 12淡季
		//		成人：40
		//		其他：20
		
		//定义money变量接受钱
		int money = 0;
		//创建对象Scanner
		Scanner myScanner = new Scanner(System.in);
		//接受数据
		//提示信息
		System.out.println("请输入当前月份");
		int month = myScanner.nextInt();
		System.out.println("请输入年龄");
		int people_age = myScanner.nextInt();
		//if-else 判断 为 淡季还是旺季
		if (month >= 4 && month <= 10) {//旺季
			if (people_age >= 18 && people_age <= 60) {
				money = 60;
			} else if (people_age >= 0 && people_age < 18) {
				money = 30;
			} else if (people_age > 60) {
				money = 20;
			} else {
				System.out.println("你输入的年龄有误，请重新输入");
			}
		} else if ((month >= 1 && month <= 3) || (month >= 11 && month <= 12)) {//淡季
			if (people_age >= 18 && people_age <= 60) {
				money = 40;
			} else {
				money = 20;
			}
		} else {
			System.out.println("你输入的月份有误，请重新输入");
		}

		System.out.println("票价为 " + money);
		
	}
}