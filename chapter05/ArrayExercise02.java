
public class ArrayExercise02 {
	//��дһ��main����
	public static void main(String[] args) {
		//2. �����һ������int[]�����ֵ {4, -1, 9, 10, 23} ���õ���Ӧ���±�
		//˼·����
		//1. �ȶ���һ��int����
		//2. �ٶ�һ�����ֵΪmax = arr[0]
		//3. Ȼ������Ƚ�
		
		int arr[] = {4, -1, 9, 10, 23, 888, 80, 90};
		int max = arr[0];
		int maxIndex = 0;//�õ���Ӧ�±꣬����洢�±�
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println("���ֵ=" + max);
		System.out.println("��Ӧ���±�=" + maxIndex);
		
	}
}