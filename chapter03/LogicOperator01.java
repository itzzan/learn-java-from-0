//��ʾ�߼��������ʹ��
//
public class LogicOperator01 {

	//��дһ��main����
	public static void main(String[] args) {
		
		//��·��&& ���߼���&
		//&& ʹ��
		int age = 50;
		if (age > 20 && age < 90) {
			System.out.println("ok100");
		} 

		//& ʹ��
		if (age > 20 & age < 90) {
			System.out.println("ok200");
		} 

		//&& �� & ������
		//����&&��·����ԣ������һ������Ϊ false ,��������������жϣ���ֱ���˳�������Ĳ���ִ��
		//����&�߼�����ԣ������һ������Ϊ false ,�����������Ȼ���ж�
		
		int a = 4;
		int b = 9;
		if (a < 1 && ++b < 50) {
			System.out.println("ok300");
		} 
		System.out.println("a = " + a + " b = " + b);//4 9
		
		if (a < 1 & ++b < 50) {
			System.out.println("ok400");
		} 
		System.out.println("a = " + a + " b = " + b);//4 10



	}
}