//while ѭ������ϰ
//
public class WhileExercise {
	//��дһ��main����
	public static void main(String[] args) {
		//1) ��ӡ 1��100 ֮�������ܱ� 3 �������� [ʹ�� while, ��ʦ���� ] 
		
		int i = 1;
		while (i <= 100) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
			i++;
		}

		//2) ��ӡ 40��200 ֮�����е�ż�� [ʹ�� while, �κ���ϰ]
		
		int j = 40;
		while (j <= 200) {
			if (j % 2 == 0) {
				System.out.println(j);
			}
			j++;
		}

	}
}