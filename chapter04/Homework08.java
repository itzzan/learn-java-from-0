
public class Homework08 {
	//��дһ��main����
	public static void main(String[] args) {
		//���1-1/2+1/3-1/4......1/100�ĺ�
		//����ӵ� 1 + 1/3 + 1/5 +....+ 1/99
		//������� -1/2 - 1/4 - ...... - 1/100
		
		double sum = 0;
		for (int i = 1; i <= 100; i+=2) {
			sum = sum + 1.0 / i;
		}
		for (int i = 2; i <= 100; i+=2) {
			sum = sum - 1.0 / i;
		}
		System.out.println(sum);

	}
}