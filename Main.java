import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter your current age");
    int ageNow = scan.nextInt();
    int univAge = 18;

    System.out.println(yearsLeft(univAge,ageNow));
  }
    static String yearsLeft(int univAge, int ageNow)
    {
      int yearsLeft = univAge - ageNow;
      String years = "You have " + yearsLeft + "years left until college";
      return years; 
    }
  }
}