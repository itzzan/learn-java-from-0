
public class RecursionExercise02 {
	//��дһ��main����
	public static void main(String[] args) {
		T t1 = new T();
		int day = 8;
		int res = t1.peach(day);
		if (res != -1) {
			System.out.println("��" + day + "������Ӹ���=" + res);
		} 
	}
}

class T {
	//���ӳ��������⣺��һ�����ӣ����ӵ�һ��������е�һ�룬���ٶ����һ����
	//�Ժ�ÿ����Ӷ������е�һ�룬Ȼ���ٶ��һ��
	//������10��ʱ�����ٳ�ʱ������û�ԣ�������ֻ��1������
	//�ʣ�����ж��ٸ�����
	//˼·
	//1. ÿ�춼��һ�룬�����һ��
	//2. ���Ե���10���ʱ��û�ԣ�������ֻ��1��������
	//����
	//day = 10 ʱ���� 1 ������
	//day = 9  ʱ���� 4 ������ = (day10 + 1) * 2
	//day = 8  ʱ���� 10������ = (day9 + 1) * 2
	//���ɾ���  ǰһ������� = ����һ��������� + 1��* 2
	
	public int peach(int day) {
		if (day == 10) {//��10�� - ֻ��һ����
			return 1;
		} else if (day >= 1 && day <= 9) {
			return (peach(day + 1) + 1) * 2;
		} else {
			System.out.println("day��1-10");
			return -1;
		}
		
	}


}
