import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Please enter a four-digit number:");
    Scanner scan= new Scanner (System.in);
    int num=scan.nextInt();
    int a= num%10;
    num/=10;
    int b= num%10;
    num/=10;
    int c= num%10;
    num/=10;
    int d=num;
    System.out.println("Sum of digits: "+(a+b+c+d));
    System.out.println("Product of digits "+ a*b*c*d);

  }
}