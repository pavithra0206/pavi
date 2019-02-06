import java.util.Scanner;
class PosNegzero {
   public static void main(String args[]){
      int num;
      System.out.println("Enter a number ::");
      Scanner sc = new Scanner(System.in);
      num = sc.nextInt();

      if (num > 0){
         System.out.println("Given number is a positive integer");
      } else if(num < 0){
         System.out.println("Given number is a negative integer");
      } else {
         System.out.println("Given number is a nor negative integer");
      }
   }
 }
