import java.util.Scanner;
public class GitHubTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] shu = new int[5];
        System.out.print("输入数字：");
        for(int i = 0; i < shu.length; i++) {
            int n = input.nextInt();
            shu[i] = n;
        }
        System.out.println("显示数组：");
        for(int i = 0; i < shu.length; i++) {
            System.out.print(shu[i] + " ");
        }

        for(int i = 0; i < shu.length; i++) {
            for(int j = 0; j<shu.length - 1 - i; j++) {
                if(shu[j] > shu[j+1]) {
                    int num = shu[j];
                    shu[j] = shu[j+1];
                    shu[j+1] = num;
                }
            }
        }
        System.out.println("显示排序后数组：");
        for(int i = 0; i < shu.length; i++) {
            System.out.print(shu[i] + " ");
        }

    }
}
