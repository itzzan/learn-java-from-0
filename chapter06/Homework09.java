
public class Homework09 {
	//��дһ��main����
	public static void main(String[] args) {
		music mu = new music("Ц������", 300);
		mu.play();
		System.out.println(mu.getInfo());	
		
	}
}

//����music�࣬������������name������ʱ��times����
//���в���play���ܺͷ��ر���������Ϣ�Ĺ��ܷ���getInfo
class music {
	String name;
	int times;
	public music(String name, int times) {
		this.name = name;
		this.times = times;
	}

	public void play() {
		System.out.println("���ڲ��Ÿ���" + this.name);
		System.out.println("ʱ��=" + this.times);
	}

	public String getInfo() {
		return "���� " + name + " ����ʱ��Ϊ" + times;
	}

}
