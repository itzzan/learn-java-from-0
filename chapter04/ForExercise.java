//for ��ϰ
public class ForExercise {
	//��дһ��main����
	public static void main(String[] args) {
		//��ӡ1-100֮��������9�ı�����������ͳ�Ƹ������ۺ�[����Ϊ��]
		//1. ����Ϊ�򣺼������ӵ�������ɼ򵥵����������
		//2. �������ȿ��ǹ̶���ֵ��Ȼ��ת�ɿ������仯��ֵ
		
		//˼·����
		//��1����� ��� 1-100��ֵ
		//��2��������Ĺ����У����й��ȣ�ֻ���9�ı���
		//��3��ͳ�Ƹ��� ����һ��������int count = 0������������ʱ��count++
		//��4������ܺͣ�����һ������ int sum = 0������������ʱ sum += i;
		//
		//�������
		//��1��Ϊ����Ӧ���õ����󣬰ѷ�Χ�Ŀ�ʼ��ֵ�ͽ�����ֵ�����ɱ���
		//��2�������Ը���һ����9 ����Ҳ���ɱ��� int t = 9;
		
		int count = 0;//ͳ�Ƹ���
		int sum = 0;//��ʾ�ܺ�
		int start = 1;
		int end = 100;
		int t = 0;//����
		for (int i = start; i <= end; i++) {
			if (i % t == 0) {
				count++;
				sum += i;
				System.out.println(i);
			}
		}
		System.out.println("count = " + count);
		System.out.println("sum = " + sum);
		
		
	}
}