import java.util.Scanner;
public class HomeWork2_710 {
    public static void main(String[] args) {
        double[]numbers = new double[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入10个整数：");
        for (int i =0;i<10;i++){
            numbers[i]=sc.nextDouble();
        }
        int index = index0fSmallestElement(numbers);
        System.out.println(index);



    }
    public static int index0fSmallestElement(double[]array) {
        double min = array[0];
        int index0fMin = 0;
        for (int i =0; i<array.length;i++){
            if (array[i]<min){
                min=array[i];
                index0fMin=i;
            }
        }
        return index0fMin;
    }
}
