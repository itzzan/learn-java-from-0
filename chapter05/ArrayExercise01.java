
public class ArrayExercise01 {
	//��дһ��main����
	public static void main(String[] args) {
		//1. ����һ��char���͵�26��Ԫ�ص����飬�ֱ����'A'-'Z'
		//ʹ��forѭ����������Ԫ�ز���ӡ����
		//��ʾ��char������������ 'A' + 1 -> 'B'
		//
		//˼·����
		//1. ����һ�� ���� char[] chars = new char[26];
		//2. ��Ϊ'A' + 1 = 'B' ���ƣ�����ʹ��for����ֵ
		//3. ʹ��forѭ����������Ԫ��
		char chars[] = new char[26];
		for (int i = 0; i < chars.length; i++) {//ѭ��26��
			chars[i] = (char)('A' + i);//���ڵõ�����int���ͣ������Ҫǿת��char����
			System.out.print(chars[i] + " ");
		}
		
		

	}
}