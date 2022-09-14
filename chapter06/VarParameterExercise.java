
public class VarParameterExercise {
	//编写一个main方法
	public static void main(String[] args) {
		HspMethod h = new HspMethod();
		System.out.println(h.showScore("小米", 90.1, 80.0));
		System.out.println(h.showScore("terry", 90.1, 80.0, 10, 30.5, 20));
	}
}

class HspMethod {
	//有三个方法，分别实现返回姓名和两门课成绩(总分)， 
	//返回姓名和三门课成绩(总分)，
	//返回姓名和五门课成绩（总分）。 
	//封装成一个可变参数的方法
	//分析
	//1. 方法名 showScore
	//2. 形参（String，double...）
	//3. 返回String
	public String showScore(String str, double... scores) {
		double totalScore = 0;
		for (int i = 0; i < scores.length; i++) {
			totalScore += scores[i];
		}
		return str + "有" + scores.length + "这么多门课的成绩总分为=" + totalScore;
	}

}
