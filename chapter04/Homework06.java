
public class Homework06 {
	//编写一个main函数
	public static void main(String[] args) {
		//输出 1-100 之间的不能被5整除的数，每5个一行
		//1. 先输出1-100
		//2. 判断不能被5整除的数
		//3. 打印 - 每5个一行
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 5 != 0) {
				count++;
				System.out.print(i + " ");
			}
			if (count == 5) {
				count = 0;
				System.out.println("");
			}
		}		

		
	}
}