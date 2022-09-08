//应用案例
import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		//参加歌手比赛，如果初赛成绩大于 8.0 进入决赛，否则提示淘汰。
		//并且根据性别提示进入男子组或女子组。
		//输入成绩和性别，进行判断和输出信息。
		//[NestedIf.java] 
		//提示: double score; char gender; 
		//接收字符: char gender = scanner.next().charAt(0)
		
		//思路分析
		//1. 创建Scanner对象，接受用户输入
		//2. 接受成绩保存到 double score中
		//3. 使用 if-else 判断如果初赛成绩大于8.0进入决赛，否则提示淘汰
		//4. 如果进入到 决赛，再接受一个char gender，再使用if-else 输出信息
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入该歌手的成绩");
		double score = scanner.nextDouble();
		if (score > 8.0) {
			System.out.println("请输入性别");
			char gender = scanner.next().charAt(0);
			if (gender == '男') {
				System.out.println("进入男子组决赛");
			} else if (gender == '女') {
				System.out.println("进入女子组决赛");
			} else {
				System.out.println("你的性别有误，不能参加决赛");
			}

		} else {
			System.out.println("Sorry，你被淘汰了");
		}







	}
}