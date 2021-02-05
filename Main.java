import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter your current age");
    int ageNow = scan.nextInt();
    int univAge = 18;

    System.out.println("Are you going to college? T/F");
    boolean collegeDebt = scan.nextBoolean();

    System.out.println(yearsLeft(univAge,ageNow));
    System.out.println(money(collegeDebt));
  }
    static String yearsLeft(int univAge, int ageNow)
    {
      int yearsLeft = univAge - ageNow;
      String years = "You have " + yearsLeft + "years left until college";
      return years; 
    }
     static String money (boolean collegeDebt) {
       String money;
       if (collegeDebt) {

         money = "Oops sorry you're gonna be broke";

       } else {
         money = "Yay you'll have money!";
       }
       return money;
       }

     }