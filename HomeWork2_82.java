import java.util.Scanner;
public class HomeWork2_82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row");
        double [][]numbers = new double[4][4];
        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                numbers[i][j]=sc.nextDouble();
            }
        }
        double sum = sumMajorDiagonal(numbers);
        System.out.println("Sum of the elements in the major diagonal is "+sum);
    }
    public static double sumMajorDiagonal(double[][] m){
        double sum =0;
        for (int i=0;i<4;i++){
            sum += m[i][i];
        }
        return sum;
    }
}
