import java.util.Scanner;

public class HomeWork2_64 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个整数：");
            int number = sc.nextInt();
            reverse(number);

        }
        public static void reverse(int number){
            while(number > 0){
                System.out.print(number%10);
                number /= 10;

        }

        }
}
