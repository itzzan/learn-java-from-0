//do while ѭ������ϰ
//
public class DoWhileExercise01 {
	//��дһ��main����
	public static void main(String[] args) {
		//1) ��ӡ 1��100 [ѧ����] 
		// int i = 1;
		// do {
		// 	System.out.println(i);
		// 	i++;
		// } while (i <= 100);

		//2) ���� 1��100 �ĺ� [ѧ����] 
		
		// int j = 1;
		// int sum = 0;
		// do {
		// 	sum += j;
		// 	j++;
		// } while (j <= 100);
		// System.out.println(sum);
		
		//3) ͳ�� 1---200 ֮���ܱ� 5 ���������ܱ� 3 �����ĸ���
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