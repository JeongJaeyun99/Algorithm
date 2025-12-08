package for_japan;

import java.util.*;

public class star5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int max = (2 * a) - 1;
        for(int i = 0;i < a;i++){
            for(int j = 0;j < i;j++){
                System.out.print(" ");
            }
            for(int j = max;j > 0;j--){
                System.out.print("*");
            }
            max -= 2;
            System.out.println();
        }
        max = 3;
        for(int i = 1;i < a;i++){
            for(int j = a;j > i+1;j--){
                System.out.print(" ");
            }
            for(int j = 1;j <= max;j++){
                System.out.print("*");
            }
            max += 2;
            System.out.println();
        }
    }
}
