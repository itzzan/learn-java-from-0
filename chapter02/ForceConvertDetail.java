
public class ForceConvertDetail {
	public static void main(String[] args) {
		//��ʾǿ������ת��
		
		//ǿת����ֻ�������Ĳ�������Ч��������ʹ��С�����������ȼ�
		//int x = (int)10*3.5+6*1.5;//error �������

		int x = (int)(10*3.5+6*1.5);//ok��44.0 -> 44
		System.out.println(x);

		char c1 = 100;//ok
		int m = 100;//ok
		//char c2 = m;//error
		char c3 = (char)m;//ok
		System.out.println(c3);//100���ڵ��ַ�
	}
}