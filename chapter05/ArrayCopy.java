
public class ArrayCopy {
	//��дһ��main����
	public static void main(String[] args) {
		//��д���� ʵ�����鿽�������ݸ��ƣ�
		//��int arr1[] = {10, 20, 30};������ arr2����
		//Ҫ�����ݿռ��Ƕ�����
		//˼·��
		//����һ���µ�����arr2������һ���µ����ݿռ�
		//��С�� arr1.length ��ͬ
		
		int arr1[] = {10, 20, 30};
		int arr2[] = new int[arr1.length];
		//����arr1����ÿ��Ԫ�ؿ�����arr2��Ӧ��Ԫ��λ��
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		//���arr1
		System.out.println("===arr1��ֵ===");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		//�޸�arr2��ֵ
		arr2[0] = 100;
		System.out.println("===arr2��ֵ===");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
	}
}