package test;

import java.util.Arrays;
import java.util.Scanner;

public class learning {
    public static void main(String[] args){
        int x = 1;
        //System.out.println(x);
        x = 2;
        //System.out.println(x);
        //jisuan(100);
        //strings();
        //arrays();
        //scanners();

        testClass plans = new testClass();
        testClass.plans();
        plans.tests();
    }

    public static void jisuan(int num){
        int i = (1+num)*(num/2);
        System.out.println(i);
    }

    public static void strings(){
        String s = "hello";
        String t = s;
        s = "world";
        System.out.println(t);
    }

    public static void arrays(){
        //int[] ns = new int[5];
        //int[] ns = { 68, 79, 91, 85, 62 };
        //System.out.println(ns.length); // 5
        //System.out.println(ns[1]); // 5
        //System.out.println(Arrays.toString(ns)); // 5
//        for(int i = 0 ; i < ns.length ; i++){
//            System.out.println(ns[i]);
//        }

//        for (int n : ns) {
//            System.out.print(n + ", ");
//        }

        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        Arrays.sort(ns);
        System.out.println(Arrays.toString(ns));
    }

    public static void scanners(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = scanner.nextLine(); // 读取一行输入并获取字符串
        System.out.print("Input your age: "); // 打印提示
        int age = scanner.nextInt(); // 读取一行输入并获取整数
        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出
    }
}


class testClass{
    public static void plans(){
        System.out.println("plans");
    }

    public void tests(){
        System.out.println("test");
    }
}