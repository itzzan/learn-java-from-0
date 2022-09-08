import java.util.Scanner;
public class BreakExercise02 {
	//编写一个main函数
	public static void main(String[] args) {
		//实现登录验证，有 3 次机会，如果用户名为"丁真" ,密码"666"提示登录成功，否则提示还有几次机会，
		//请使用 for+break 完成 BreakExercise02.java
		
		//思路分析
		//1. 创建Scanner对象接受用户输入
		//2. 定义 String name；String passwd：保存用户名和密码
		//3. 最多循环3次[登录3次]，如果满足条件就提前退出
		//4. 定义一个变量 int chance 记录还有几次登录机会
		Scanner myScanner = new Scanner(System.in);
		int chance = 3;
		String name = "";
		String passwd = "";
		for (int i = 1; i <= 3; i++) {
			System.out.println("请输入名字");
			name = myScanner.next();
			System.out.println("请输入密码");
			passwd = myScanner.next();
			//比较输入的名字和密码是否正确
			//补充字符串的内容 比较 使用的方法 equals
			if ("丁真".equals(name) && "666".equals(passwd)) {
				System.out.println("恭喜你，登录成功~");
				break;
			}
			//登录的机会就减少一次
			chance--;
			System.out.println("你还有" + chance +"次登录机会");

		}

	}
}