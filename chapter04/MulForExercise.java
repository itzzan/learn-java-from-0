import java.util.Scanner;
public class MulForExercise {
	//��дһ��main����
	public static void main(String[] args) {
		//1) ͳ�� 3 ����ɼ������ÿ������ 5 ��ͬѧ������������ƽ���ֺ����а༶��ƽ����[ѧ���ĳɼ��Ӽ�������]�� 
		//˼·����
		//����Ϊ��
		//��1���ȼ���һ���࣬5��ѧ���ĳɼ�
		//1.1 ���� Scanner ����Ȼ������û�����
		//1.2 �õ��ð༶��ƽ���֣�����һ��double sum ���Ѹð༶5��ѧ���ĳɼ��ۼ�
		
		//��2��ͳ��3���ࣨÿ����5��ѧ����ƽ����
		//��3�����а༶��ƽ����
		//3.1 ����һ��������double totalScore �ۼ�����ѧ���ĳɼ�
		//3.2 ����ѭ��������totalScore / (3 * 5)
		
		//4) ͳ�������༰��������ÿ������ 5 ��ͬѧ��
		//4.1 ������� int passNum = 0; ����һ��ѧ���ɼ�>=60 passNum++
		//4.2 ���>=60 passNum++
		//��5��������Ż���Ч�ʡ��ɶ��ԡ��ṹ��
		
		//���� Scanner ����
		Scanner myScanner = new Scanner(System.in);
		double totalScore = 0;//�ۼ�����ѧ���ĳɼ�
		int passNum = 0;//�ۻ����������
		int classNum = 3;
		int stuNum = 5;
		for (int i = 1; i <= classNum; i++) {

			double sum = 0; //һ���༶���ܷ�
			for (int j = 1; j <= stuNum; j++) {
				System.out.println("�������" + i + "����ĵ�" + j + "��ѧ���ĳɼ�");
				double score = myScanner.nextDouble();
				//����һ��ѧ���ɼ�>=60 passNum++
				if (score >= 60) {
					passNum++;
				}
				sum += score;
				System.out.println("�ɼ�Ϊ" + score);
			}
			System.out.println("ƽ����Ϊ" + (sum / stuNum));
			//��sum�ۻ���totalScore
			totalScore += sum;
		}
		System.out.println("�������ܷ�=" + totalScore + " ƽ����Ϊ" + (totalScore / (classNum*stuNum)));
		System.out.println("�ۼƼ��������=" + passNum);

		

	}
}