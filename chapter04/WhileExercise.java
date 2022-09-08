//while 循环的练习
//
public class WhileExercise {
	//编写一个main函数
	public static void main(String[] args) {
		//1) 打印 1—100 之间所有能被 3 整除的数 [使用 while, 老师评讲 ] 
		
		int i = 1;
		while (i <= 100) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
			i++;
		}

		//2) 打印 40—200 之间所有的偶数 [使用 while, 课后练习]
		
		int j = 40;
		while (j <= 200) {
			if (j % 2 == 0) {
				System.out.println(j);
			}
			j++;
		}

	}
}