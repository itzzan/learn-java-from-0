import java.util.Scanner;
public class MulForExercise {
	//编写一个main函数
	public static void main(String[] args) {
		//1) 统计 3 个班成绩情况，每个班有 5 名同学，求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。 
		//思路分析
		//化繁为简
		//（1）先计算一个班，5个学生的成绩
		//1.1 创建 Scanner 对象然后接受用户输入
		//1.2 得到该班级的平均分，定义一个double sum ，把该班级5个学生的成绩累计
		
		//（2）统计3个班（每个班5个学生）平均分
		//（3）所有班级的平均分
		//3.1 定义一个变量，double totalScore 累计所有学生的成绩
		//3.2 多重循环结束后，totalScore / (3 * 5)
		
		//4) 统计三个班及格人数，每个班有 5 名同学。
		//4.1 定义变量 int passNum = 0; 当有一个学生成绩>=60 passNum++
		//4.2 如果>=60 passNum++
		//（5）另外的优化【效率、可读性、结构】
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);
		double totalScore = 0;//累计所有学生的成绩
		int passNum = 0;//累积及格的人数
		int classNum = 3;
		int stuNum = 5;
		for (int i = 1; i <= classNum; i++) {

			double sum = 0; //一个班级的总分
			for (int j = 1; j <= stuNum; j++) {
				System.out.println("请输入第" + i + "个班的第" + j + "个学生的成绩");
				double score = myScanner.nextDouble();
				//当有一个学生成绩>=60 passNum++
				if (score >= 60) {
					passNum++;
				}
				sum += score;
				System.out.println("成绩为" + score);
			}
			System.out.println("平均分为" + (sum / stuNum));
			//把sum累积到totalScore
			totalScore += sum;
		}
		System.out.println("三个班总分=" + totalScore + " 平均分为" + (totalScore / (classNum*stuNum)));
		System.out.println("累计及格的人数=" + passNum);

		

	}
}