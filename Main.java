import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while(true){
      System.out.println("\n\nax^2 + bx + c = 0");
      System.out.println("Podaj współczynniki a, b, c: ");
      double a = scanner.nextDouble();
      double b = scanner.nextDouble();
      double c = scanner.nextDouble();
  
      double delta = Math.pow(b,2) - 4*a*c;
  
      if(a == 0 && b != 0){
        double x = -c/b;
        System.out.println("x = " + x);
      }
      else if(b == 0 && c !=0)
        System.out.println("Nie ma rozwiązania");
      else if(c == 0)
        System.out.println("Nieskończenie wiele rozwiązań");
      
      else if(delta > 0){
        double x1 = (-b - Math.sqrt(delta))/(2*a), x2 = (-b + Math.sqrt(delta))/(2*a);
        System.out.print("x1 = " + x1 + "\nx2 = " + x2);
      }
      else if(delta < 0){
       double x_re = -b/(2*a), x1_im = -Math.sqrt(-delta)/(2*a), x2_im = Math.sqrt(-delta)/(2*a);
        if(x1_im < 0)
          System.out.println("x1 = " + x_re + " - i" + Math.abs(x1_im));
        else
          System.out.println("x1 = " + x_re + " + i" + Math.abs(x1_im));
        if(x2_im < 0)
          System.out.println("x1 = " + x_re + " - i" + Math.abs(x2_im));
        else
          System.out.println("x1 = " + x_re + " + i" + Math.abs(x2_im)); 
      }
      else {
        double x0 = -b/(2*a);
        System.out.println("x0 = " + x0);
      }
    }  
  }
}