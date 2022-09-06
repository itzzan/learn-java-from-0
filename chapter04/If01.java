//if 的快速入门
import java.util.Scanner;//导入包

public class If01 {
	public static void main(String[] args) {

		//需求：编写一个程序,可以输入人的年龄,如果该同志的年龄大于 18 岁,
		//则输出 "你年龄大于 18,要对自己的行为负责,送入监狱"
		
		//思路分析
		//1. 接受输入的年龄，应该定义一个Scanner的对象
		//2. 把年龄保存到一个变量 int age
		//3. if 判断，输出对于信息
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年龄");
		int age = scanner.nextInt();
		if (age > 18) {
			System.out.println("你年龄大于 18,要对自己的行为负责,送入监狱");
		}

		System.out.println("程序继续....");
		
	}
}