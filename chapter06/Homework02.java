
public class Homework02 {
	//��дһ��main����
	public static void main(String[] args) {
		A02 a2 = new A02();
		String[] str = {"tom", "jack", "jim", "mark"};
		String str2 = "to";
		int res = a2.find(str, str2);
		if (res == -1) {
			System.out.println("û�ҵ�");
		} else {
			System.out.println("�ҵ��ˣ��±�=" + res);
		}
	}
}

//��д��A02�����巽��find��ʵ�ֲ���ĳ�ַ����Ƿ����ַ��������У�����������
//����Ҳ���������-1
//����
//1. ���� A02
//2. ������ find
//3. ����ֵ int
//4. �β� ��String��String[]��
class A02 {
	public int find(String[] str, String str2) {
		int index = -1;
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(str2)) {
				index = i;
			}
		}
		return index;
	}
}