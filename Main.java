import java.util.*;
class Main{
  public static Scanner input= new Scanner(System.in);
  public static void main(String[] args){
    while(true){
      System.out.println("Would you like a show quote from:");
      System.out.println("1- Spongebob");
      System.out.println("2- The office");
      System.out.println("3- My fairly odd parents");
      int show= input.nextInt();
      switch(show){
        case 1:
          spongebob();
          break;
        case 2:
          dwight();
          break;
        case 3:
          timmy();
          break;
          default:
          System.out.println("Invalid choice");
          input.next();
      }
      }
    }

public static void spongebob(){
  System.out.println("Is mayonnaise an instrument?");
  input.nextLine();
  input.nextLine();
}
public static void dwight(){
  System.out.println("Would an idiot do that?");
  input.nextLine();
  input.nextLine();
}
public static void timmy(){
  System.out.println("This year, Timmy Turner is not going to take it!");
  input.nextLine();
  input.nextLine();
}}
