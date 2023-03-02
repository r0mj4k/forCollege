import java.util.*;

class Main {
  public static void main(String[] args) {
    // 1 – dla sumy, 2 – dla różnicy, 3 – dla iloczynu, 4 – dla ilorazu
    Scanner scanner = new Scanner(System.in);
    while(true) {
      System.out.println("Podaj 2 liczby: ");
      float a = scanner.nextFloat();
      float b = scanner.nextFloat();
      
      System.out.println("1 – suma");
      System.out.println("2 – różnica");
      System.out.println("3 – iloczyn");
      System.out.println("4 – iloraz");
      
      int choice = scanner.nextInt();
      switch(choice) {
          case 1 -> System.out.println(a+b);
          case 2 -> System.out.println(a-b);
          case 3 -> System.out.println(a*b);
          case 4 -> {
            if(b == 0)
              System.out.println("Nie można dzielić przez 0!");
            else
              System.out.println(a/b);
                    }
      }
    }
  }
}
