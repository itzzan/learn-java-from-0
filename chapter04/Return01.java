
public class Return01 {
	//��дһ��main����
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {

			if (i == 3) {
				System.out.println("�Ϻ�����" + i);
				return;//��return���ڷ���ʱ����ʾ�����������������main���棬�����˳�main����
				//break;
			}
			System.out.println("Hello World!");
		}
		System.out.println("go on...");
		
	}
}