import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj długość choinki: ");
    int l = scanner.nextInt();
    
    for(int i=0; i<l;i++){
      for(int j=0; j<l-i;j++)
        System.out.print(" ");
      for(int k=0; k<2*i+1;k++)
        System.out.print("*");
    System.out.println();
    }
  }
}