
public class Homework06 {
	//��дһ��main����
	public static void main(String[] args) {
		//��� 1-100 ֮��Ĳ��ܱ�5����������ÿ5��һ��
		//1. �����1-100
		//2. �жϲ��ܱ�5��������
		//3. ��ӡ - ÿ5��һ��
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