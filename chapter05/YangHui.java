
public class YangHui {
	//��дһ��main����
	public static void main(String[] args) {
		//ʹ�ö�ά�����ӡһ��10�е��������
		//����
		//1. ��һ���� 1 ��Ԫ��, �� n ���� n ��Ԫ�� 
		//2. ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض��� 1 
		//3. �ӵ����п�ʼ, ���ڷǵ�һ��Ԫ�غ����һ��Ԫ�ص�Ԫ�ص�ֵ. 
		//arr[i][j] arr[i][j] = arr[i-1][j] + arr[i-1][j-1]; //�����ҵ��������

		int arr[][] = new int[10][];
		for (int i = 0; i < arr.length; i++) {//����arr��ÿ��Ԫ��
			//��ÿ��һά���飨�У����ٿռ�
			arr[i] = new int[i + 1];
			//��ÿ��һά���鸳ֵ
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 0 || j == arr[i].length - 1) {
					arr[i][j] = 1;
				} else {//�м��Ԫ��
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
			}
		}
		//���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
} 