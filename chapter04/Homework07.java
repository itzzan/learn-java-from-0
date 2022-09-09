
public class Homework07 {
	//编写一个main函数
	public static void main(String[] args) {
		//输出小写的a-z以及大写的Z-A
		char n = 'a';
		char n2 = 'A';
		for (int i = 0; i <= 25; i++) {
			System.out.print((char)(n + i) + " ");
		}	
		System.out.println("");
		for (int j = 0; j <= 25; j++) {
			System.out.print((char)(n2 + j) + " ");
		}

		
	}
}