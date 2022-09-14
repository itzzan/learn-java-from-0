public class Homework04 {

	public static void main(String[] args) {
		
		//1. 用变量将姓名、年龄、成绩、性别、爱好存储
		//2. 使用+号
		//3. 添加适当的注释
		//4. 添加转义字符，使用一条语句输出
		
		String name = "老韩";
		int age = 18;
		float score = 99.9F;
		char gender = '男';
		String like = "唱跳rap";

		//输出信息，可以使用换行的方式
		System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n" 
			+ name + '\t' + age + '\t' + score + '\t' + gender + '\t' + like);

	}
}