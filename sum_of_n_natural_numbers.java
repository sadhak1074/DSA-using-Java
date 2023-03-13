import java.util.Scanner;
public class sum_of_n_natural_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        for(int i=0;i<=n; i++){
            System.out.println(i);
        }
    }
}
