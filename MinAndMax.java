import java.util.Scanner;
class Main {
  public static void main(String[] args) 
  {
    System.out.println("Please enter five integers:");
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    Scanner scan= new Scanner (System.in);
    for(int i=0; i<5; i++)
    {
      int temp=scan.nextInt();
      if (temp>max)
      {
        max=temp;
      }
      if (temp<min)
      {
        min=temp;
      }
    }
    System.out.println("minimum: "+min);
    System.out.println("maximum: "+max);
  }
}