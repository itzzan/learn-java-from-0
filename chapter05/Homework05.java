
public class Homework05 {
	//��дһ��main����
	public static void main(String[] args) {
		//�������10��������1-100�ķ�Χ�����浽���飬�������ӡ�Լ���ƽ��ֵ
		//�����ֵ�����ֵ���±꣬�����������Ƿ���8
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		System.out.println("===�������===");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		//�����ӡ
		//��ƽ��ֵ
		double sum = 0;
		int max = 0;
		int index = -1;
		System.out.println("\n===�������===");
		for (int i = arr.length - 1; i >= 0; i--) {

			
			System.out.print(arr[i] + " ");
			sum += arr[i];
			if (arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println("\nƽ��ֵ=" + (sum / 10.0));
		System.out.println("���ֵ=" + max);
		System.out.println("���ֵ�±�=" + index);

		//�����������Ƿ���8
		int findNum = 8;
		int index2 = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == findNum) {
				index2 = i;
				System.out.println("�ҵ���" + findNum + " �±�=" + index2);
				
				break;
			}
		}

		if (index2 == -1) {
			System.out.println("û���ҵ���" + findNum);
		}
	}
} 