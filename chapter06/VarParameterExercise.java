
public class VarParameterExercise {
	//��дһ��main����
	public static void main(String[] args) {
		HspMethod h = new HspMethod();
		System.out.println(h.showScore("С��", 90.1, 80.0));
		System.out.println(h.showScore("terry", 90.1, 80.0, 10, 30.5, 20));
	}
}

class HspMethod {
	//�������������ֱ�ʵ�ַ������������ſγɼ�(�ܷ�)�� 
	//�������������ſγɼ�(�ܷ�)��
	//�������������ſγɼ����ܷ֣��� 
	//��װ��һ���ɱ�����ķ���
	//����
	//1. ������ showScore
	//2. �βΣ�String��double...��
	//3. ����String
	public String showScore(String str, double... scores) {
		double totalScore = 0;
		for (int i = 0; i < scores.length; i++) {
			totalScore += scores[i];
		}
		return str + "��" + scores.length + "��ô���ſεĳɼ��ܷ�Ϊ=" + totalScore;
	}

}
