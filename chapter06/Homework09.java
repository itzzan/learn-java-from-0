
public class Homework09 {
	//编写一个main方法
	public static void main(String[] args) {
		music mu = new music("笑傲江湖", 300);
		mu.play();
		System.out.println(mu.getInfo());	
		
	}
}

//定义music类，里面有音乐名name、音乐时长times属性
//并有播放play功能和返回本身属性信息的功能方法getInfo
class music {
	String name;
	int times;
	public music(String name, int times) {
		this.name = name;
		this.times = times;
	}

	public void play() {
		System.out.println("正在播放歌曲" + this.name);
		System.out.println("时间=" + this.times);
	}

	public String getInfo() {
		return "音乐 " + name + " 播放时间为" + times;
	}

}
