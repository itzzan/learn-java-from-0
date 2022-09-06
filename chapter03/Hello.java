//导入输入类
import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int F = scanner.nextInt();
		double C = (F - 32) * 5.0 / 9.0;
		System.out.println(C); 
	}
}