
import java.util.Scanner;
public class HomeWork2_77 {
        public static void main(String[] args) {

            int[]counts = new int[10];
            for (int i =0; i<100; i++){
                counts[(int)(Math.random()*10)]++;
            }
            for (int i =0; i<10;i++){
                System.out.println(i+"  "+counts[i]);
            }
        }
}
