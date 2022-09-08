//do while 循环的练习
//
public class DoWhileExercise01 {
	//编写一个main函数
	public static void main(String[] args) {
		//1) 打印 1—100 [学生做] 
		// int i = 1;
		// do {
		// 	System.out.println(i);
		// 	i++;
		// } while (i <= 100);

		//2) 计算 1—100 的和 [学生做] 
		
		// int j = 1;
		// int sum = 0;
		// do {
		// 	sum += j;
		// 	j++;
		// } while (j <= 100);
		// System.out.println(sum);
		
		//3) 统计 1---200 之间能被 5 整除但不能被 3 整除的个数
		int z = 1;
		int count = 0;
		do {
			if (z % 5 == 0 && z % 3 != 0) {
				count++;
				System.out.println(z);
			}
			z++;
		} while (z <= 200);
		System.out.println(count);
		
	}
}