
public class ArrayDetail {
	//��дһ��main����
	public static void main(String[] args) {
		
		//1. �����Ƕ����ͬ�������ݵ���ϣ�ʵ�ֶ���Щ���ݵ�ͳһ����
		//int arr1[] = {1, 2, 3, 60}//ok
		//int arr1[] = {1, 2, 3, 60, 1.1}//error double->int
		//int arr1[] = {1, 2, 3, 60, "hello"}//error Sring->int
		
		//double arr2[] = {1.1, 2.2, 3, 60};//ok
		double arr2[] = {1.1, 2.2, 3, 60.6, 100};//ok int -> double �Զ�ת��

		//2. �����е�Ԫ�ؿ����������������ͣ������������ͺ��������ͣ����ǲ��ܻ���
		String arr3[] = {"����", "jack", "milan"};//��������

		//3. ���鴴�������û�и�ֵ������Ĭ��ֵ
		//int 0��short 0��byte 0��long 0��float 0.0��double 0.0��char \u0000
		//boolean false��String null
		
		short arr4[] = new short[3];
		System.out.println("====����4====");
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}

		//4. ʹ������Ĳ���
		//��1���������ݲ����ٿռ�
		//��2�����������Ԫ�ظ�ֵ
		//��3��ʹ������
		
		//5. ������±��Ǵ� 0 ��ʼ��
		
		//6. �����±����ָ����Χ��ʹ�ã����򱨴��±�Խ���쳣
		//���磺int arr[] = new int[5]; ����Ч�±�Ϊ 0-4
		//��������±�/���� ��СΪ0 ���Ϊ���鳤��-1
		int arr5[] = new int[5];
		System.out.println(arr5[5]);//����Խ��

		//7. �������������ͣ������������Ƕ���(object)



	}
}