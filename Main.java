import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Podaj liczbę: ");
    long n = scanner.nextInt();
    if(n == 0)
      System.out.println(n + "! = 1");
    else if(n < 0) 
      System.out.println("Liczba musi być większa bądź równa 0");
    else {
      long _n = n, __n = n;
      while(_n != 1){
        _n--;
        n *= (_n);
      }
      
      System.out.println(__n + "! = " + n);
    }
  }
}
