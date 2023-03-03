import java.util.*;


class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while(true){
    System.out.println("Podaj dodatnią liczbą całkowitą: ");
    int n = scanner.nextInt();
      
    if(n == 0 || n==1)
      System.out.println("Ani liczba pierwsza ani złożona");
    else {
      boolean isPrimeNumber = true;
      
      for(int i=2;i<=Math.sqrt(n);i++) {
        if(n%i == 0)
          isPrimeNumber = false;
        if(!isPrimeNumber)
          break;
      }
  
      String string = isPrimeNumber ? "Liczba pierwsza" : "Liczba złożona";
      System.out.println(string);
    }
    }
  }
}