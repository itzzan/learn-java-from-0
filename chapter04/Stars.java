
public class Stars {
	//��дһ��main����
	public static void main(String[] args) {
		//��ӡһ�����ĵĽ�����
		//����Ϊ��
		//1. �ȴ�ӡһ������
		//*****
		//*****
		//*****
		//*****
		//
		//2. ��ӡ���������
		//
		//3. ��ӡ����������
		//
		//4. ��ӡ���Ľ�����
		//�ο� - ��ǰ�еĵ�һ��λ����*�����һ��λ��Ҳ��*
		
		//�������
		//5. �������ɱ��� int totalLevel = 5;
		int totalLevel = 10;

		for (int i = 1; i <= totalLevel; i++) { //i ��ʾ����

			//��ӡ*֮ǰ��Ҫ�Ŀո� (�ܲ���-��ǰ����)
			for (int k = 1; k <= totalLevel - i; k++) {
				System.out.print(" ");
			}

			//���ƴ�ӡÿ���*����
			for (int j = 1; j <= 2 * i - 1; j++) {
				//��ǰ�еĵ�һ��λ����*�����һ��λ��Ҳ��*�����һ��ȫ������*
				if (j == 1 || j == 2 * i - 1 || i == totalLevel) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			//ÿ��ӡһ��*�󡣾ͻ��� println
			System.out.println("");
		}
		
	}
}