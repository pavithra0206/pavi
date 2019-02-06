import java.util.Scanner;
class PosNegzero {
   public static void main(String args[]){
      int num;
      Scanner sc = new Scanner(System.in);
      num = sc.nextInt();

      if (num > 0){
         System.out.println("Positive");
      } else if(num < 0){
         System.out.println("Negative");
      } else {
         System.out.println("Zero");
      }
   }
 }
