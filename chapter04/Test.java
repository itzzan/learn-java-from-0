
public class Test {
	//��дһ��main����
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i <= 10; i++) {
			int a = (int)(Math.random() * 100) + 1;
			count++;
			if (a == 97) {
				System.out.println(count);
				break;
			}
		}
	}
}