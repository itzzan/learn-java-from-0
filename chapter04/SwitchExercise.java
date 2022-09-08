
import java.util.Scanner;
public class SwitchExercise {
	//编写一个main方法
	public static void main(String[] args) {
		//1) 使用 switch 把小写类型的 char 型转为大写(键盘输入)。只转换 a, b, c, d, e. 其它的输出 "other"。 
		//定义对象myScanner
		Scanner myScanner = new Scanner(System.in);
		//接受数据
		// char c = myScanner.next().charAt(0);
		// switch (c) {
		// 	case 'a' :
		// 		System.out.println("A");
		// 		break;
		// 	case 'b' :
		// 		System.out.println("B");
		// 		break;
		// 	case 'c' :
		// 		System.out.println("C");
		// 		break;
		// 	case 'd' :
		// 		System.out.println("D");
		// 		break;
		// 	case 'e' :
		// 		System.out.println("E");
		// 		break;
		// 	default :
		// 		System.out.println("other");
		// }

		//2) 对学生成绩大于 60 分的，输出"合格"。低于 60 分的，输出"不合格"。
		//(注：输入的成绩不能大于 100), 提示 成绩/60 
		//思路分析
		//1. 这道题，可以使用 分支来完成， 但是要求使用 switch 
		//2. 这里我们需要进行一个转换, 编程思路 : 
		// 		如果成绩在 [60,100] , (int)(成绩/60) = 1 //
		// 		如果成绩在 [0,60) , (int)(成绩/60) = 0
		
		// int score = myScanner.nextInt();
		// switch (score / 10) {
		// 	case 10:
		// 	case 9:
		// 	case 8:
		// 	case 7:
		// 	case 6:
		// 		System.out.println("合格");
		// 		break;
		// 	case 5:
		// 	case 4:
		// 	case 3:
		// 	case 2:
		// 	case 1:
		// 	case 0;
		// 		System.out.println("不合格");
		
		// switch (score / 60) {
		// 	case 1:
		// 		System.out.println("合格");
		// 		break;
		// 	case 0:
		// 		System.out.println("不合格");
		// 		break;
		// 	default :
		// 		System.out.println("输入错误，请重新输入");
		// } 		
		

		//3) 根据用于指定月份，打印该月份所属的季节。3,4,5 春季 6,7,8 夏季 9,10,11 秋季 12, 1, 2 冬季 
		//[课堂练习, 提示 使用穿透 ]
		
		int month = myScanner.nextInt();
		switch (month) {
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("冬季");
				break;
			default :
				System.out.println("输入错误，请重新输入");
		}

	}
}