import java.util.*;
public class conditional_statements {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int age = sc.nextInt();
       if(age>18){
        System.out.println("You're eligible to vote");
       }
       else if(age<15){
        System.out.println("You're a kid");}
       else{
        System.out.println("You're not eligible to vote");
       }
       
    }
}
