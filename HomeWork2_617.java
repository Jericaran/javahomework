import java.util.Scanner;
public class HomeWork2_617 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = input.nextInt();

        printMatrix(n);
    }

    public static void printMatrix(int n){

        for(int i = 0; i < n; ++i){

            for(int j = 0; j < n; ++j){

                System.out.print((System.currentTimeMillis()/(j+i+1))%2 + " ");

            }

            System.out.println();

        }

    }


}
