import java.util.Scanner;
public class Homework04 {
	//��дһ��main����
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int n = myScanner.nextInt();
		int a = n;
		int sum = 0;
		while (a > 0) {
			sum = sum + (int)Math.pow((a % 10), 3);
			a = a / 10;
		}
		if (sum == n) {
			System.out.println(n + "��ˮ�ɻ���");
		} else {
			System.out.println(n + "����ˮ�ɻ���");
		}
	}
}