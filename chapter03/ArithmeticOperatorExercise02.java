//课堂练习
//
public class ArithmeticOperatorExercise02 {

	//编写一个main方法
	public static void main(String[] args) {
		//1. 例如还有59天房价，问：合xx个星期零xx天
		//思路分析：
		//a）使用int 保存变量 ，i保存天数
		//b）一个星期是7天 星期数：i / 7， 零xx天：i % 7
		int i = 59;
		int weeks = i / 7;
		int days = i % 7;
		System.out.println("合" + weeks + "个星期零" + days + "天");

		//2. 定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：5 / 9 * (华氏温度 - 100)
		//请求出华氏温度对应的摄氏温度（234.5）
		//思路分析：
		//a）使用double变量 F保存华氏温度
		//b）根据给出的公式，进行计算即可
		//	 考虑数学公式和java语言的特性
		double F = 234.5;
		double C = 5.0 / 9.0 * (F - 100);
		System.out.println("华氏温度为" + F);
		System.out.println("摄氏温度为" + C);

	}
}