import java.util.Scanner;
public class Homework02 {
	//��дһ��main����
	public static void main(String[] args) {
		//ʵ���ж�һ�������������ĸ���Χ������0��С��0������0
		//˼·������int n = 22��ʹ��if -- else 
		Scanner myScanner = new Scanner(System.in);
		int n = myScanner.nextInt();
		if (n > 0) {
			System.out.println(n + "����0");
		} else if (n < 0) {
			System.out.println(n + "С��0");
		} else {
			System.out.println(n + "����0");
		}

		
	}
}