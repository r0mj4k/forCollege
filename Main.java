import java.util.*;
class Main {
  public static void main(String[] args) {

    // for(int i=0; i<256;i++){
    //   System.out.println(i + " - " + (char)i);
    // }
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj tekst: ");
    String text = scanner.nextLine();

    // char[] chars = text.toCharArray();
    // System.out.println(text.charAt(3));

    System.out.println("Co zrobić z tekstem: ");
    System.out.println("1 - Duże litery");
    System.out.println("2 - Małe litery");
    System.out.println("3 - Zamienić duże litery na małe a małe na duże");

    int choice = scanner.nextInt();

    switch(choice) {
      case 1 -> System.out.println(text.toUpperCase());
      case 2 -> System.out.println(text.toLowerCase());
      case 3 -> {
        // for(int i=0;i<text.length();i++){
        // if(text.charAt(i) > 64 && text.charAt(i) < 91){
        //   text.charAt(i) +=32;
        // }
        //   else if (text.charAt(i)>96 && text.charAt(i) < 123){
        //     text.charAt(i)-=32;
        // }
        String changedText = "";
        
        for(int i=0;i<text.length();i++){
          if(Character.isUpperCase(text.charAt(i))){
            changedText += Character.toLowerCase(text.charAt(i));
          }
          else if(Character.isLowerCase(text.charAt(i))){
            changedText += Character.toUpperCase(text.charAt(i));
          }
          else {
            changedText += text.charAt(i);
          }
        }
         System.out.println(changedText); 
      }
    }
  }
}
