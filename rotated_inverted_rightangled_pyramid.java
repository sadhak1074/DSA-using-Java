import java.util.*;
public class rotated_inverted_rightangled_pyramid {
public static void main(String args[]) {
    int n = 5;
    for (int i = n; i<=1; i--){
        for (int j=1; j<=i; j++){
            System.out.println(" ");
        }
        for (int k = 1; k<=i; k++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}
    

