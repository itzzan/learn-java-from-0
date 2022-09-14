public class ArrayTest {
    public static void main(String[] args) {

        //快捷键自动分配变量名
        Mytools tools = new Mytools();
        int[] arr = {10, -1, 18, 8, 0};
        tools.bubble(arr);
        //输出排序后的arr，引用排序
        System.out.println("====排序后的arr====");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//查看类的继承关系
class Person {
    String name;
    int age;
    //构造器-快捷键
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}



//创建一个类Mytools，编写一个方法，可以完成对int数组冒泡排序的功能
//要求从小到大
class Mytools {
    //方法
    public void bubble(int[] arr) {
        //冒泡排序
        for (int i = 0; i < arr.length - 1; i++) { //外层循环次数 arr.length - 1
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
