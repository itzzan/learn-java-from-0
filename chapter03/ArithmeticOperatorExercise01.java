//���������������

public class ArithmeticOperatorExercise01 {

	//��дһ��main����
	public static void main(String[] args) {
		//1. 
		int i = 1;
		i = i++;//����ʹ��һ����ʱ������1��temp = i; ��2��i = i + 1; ��3��i = temp;
		System.out.println(i);//1

		//2. 
		int j = 1;
		j = ++j;//����ʹ��һ����ʱ������1��j = j + 1; ��2��tmep = j; ��3��j = temp;
		System.out.println(j);//2


		// ������� 
		int i1 = 10;
		int i2 = 20; 
		int i3 = i1++; 
		System.out.println("i3="+i3);//10
		System.out.println("i2="+i2); //20
		i3 = --i2;
		System.out.println("i3="+i3);//19
		System.out.println("i2="+i2);//19

	}
}