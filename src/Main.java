import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = (int) (Math.random() * 1000);
        int i = 0;
        for (i = 0; i < 10; i++) {
            int a=sc.nextInt();
            if(a==x) {
                System.out.println("正确，游戏结束！");
                System.exit(0);
            }
            else if (a>x) {
                System.out.println("偏大");
            }
            else if (a<x) {
                System.out.println("偏小");
            }
        }System.out.println("很遗憾，您没有猜对，游戏结束！");
    }
}
