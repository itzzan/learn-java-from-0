
public class BreakExercise {
	//��дһ��main����
	public static void main(String[] args) {
		//1) 1-100 ���ڵ�����ͣ���� ���� ��һ�δ��� 20 �ĵ�ǰ�� ��for + break��
		//˼·����
		//1. ѭ��1-100�����sum
		//2. ��sum > 20 ʱ����¼�µ�ǰ����Ȼ��break��
		int sum = 0;//�ۻ���

		//ע��i�����÷�Χ��forѭ������ 
		for (int i = 0; i <= 100; i++) {
			sum += i;
			if (sum > 20) {
				System.out.println(i);
				break;
			}
		}
	}
}