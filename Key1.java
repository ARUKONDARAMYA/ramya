import java.util.Scanner;
public class Key1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
     String word;
     String word2;
     int no1;
     int no2;
     System.out.println("Give me a Word!");
     word=sc.next();
    System.out.println("Give me a Second word!");
     word2=sc.next();
     System.out.println("\nGreat,now your favourite number?");
     no1=sc.nextInt();
     System.out.println("And now your Second favourite number?");
    no2=sc.nextInt();
     System.out.println("\nWhew! wasn't that fun? ");
  }
}