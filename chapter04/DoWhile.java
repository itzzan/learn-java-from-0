//do while 循环的案例
//
public class DoWhile {
	//编写一个main函数
	public static void main(String[] args) {
		//输出10句，你好，Zan
		int i = 1;//循环变量初始化
		do {
			//循环执行语句
			System.out.println("你好，Zan" + i);
			//循环条件迭代
			i++;
		} while (i <= 10);

		System.out.println("退出do while");
	}
}