
public class Homework09 {
	//��дһ��main����
	public static void main(String[] args) {
		//�� 1 + (1+2) + (1+2+3) + (1+2+3+4) + ... + (1+2+3+...+100)
		int sum = 0;
		int cet = 0;
		for (int i = 1; i <= 100; i++) {
			cet = cet + i;
			sum = sum + cet;
		}
		System.out.println(sum);
	}
}