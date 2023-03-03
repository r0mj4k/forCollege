import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while(true){
    System.out.println("Podaj liczbe: ");
    int n = scanner.nextInt();

    boolean isPrimeNumber = true;
    
    for(int i=2;i<n;i++) {
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