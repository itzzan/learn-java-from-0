
public class TwoDimensionalArray03 {
	//��дһ��main����
	public static void main(String[] args) {
		
		//���󣺶�̬����һ����ά����
		//һ��������һά���飬ÿ��һά�����Ԫ���ǲ�һ����
		
		int arr[][] = new int[3][];//��ȷ�������Ͳ�д ������ ��ά���飬����ֻ��ȷ����һά����ĸ���
		//ÿ��һά���黹û�п����ݿռ�
		for (int i = 0; i < arr.length; i++) {//����arrÿ��һά����
			//��ÿ��һά���鿪�ռ� new
			//���û�и�һά���� new ����ôarr[i] ���� null
			arr[i] = new int[i + 1];

			//����һά���飬����һά�����ÿ��Ԫ�ظ�ֵ
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + 1;//��ֵ
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
} 