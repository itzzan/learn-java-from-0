//do while 循环的练习
import java.util.Scanner;

public class DoWhileExercise02 {
	//编写一个main函数
	public static void main(String[] args) {
		//如果李三不还钱，则老韩将一直使出五连鞭，直到李三说还钱为止 
		//[System.out.println("老韩问：还钱吗？y/n")]
		//
		//化繁为简
		//（1）不停的问：还钱吗？
		//（2）使用char answer 接受 - 定义一个Scanner对象
		//（3）在do-while 种 判断，如果y则不再循环
		Scanner myScanner = new Scanner(System.in);
		char answer = ' ';
		do {
			System.out.println("五连鞭");
			System.out.println("还钱吗? y/n");
			answer = myScanner.next().charAt(0);
			System.out.println("他的回答是" + answer);
			if (answer == 'n') {
			}
		} while (answer != 'y');//判断条件狠关键
		System.out.println("李三还钱了");
	}
}