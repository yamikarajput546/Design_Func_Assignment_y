import java.util.Scanner;

public class Application {
    public static void main(String[] args)
    {
        System.out.println("Enter a string :");
        int cont=1;
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        //StringFunctions sf = new StringFunctions();
        do{
            System.out.println("\npress 1 for Reverse of String\npress 2 for Length of String\npress 0 for Exit");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:System.out.print("Reverse of string : ");
                    StringFunctions.reverseString(str);
                    break;
                case 2:System.out.print("Length of string : ");
                    StringFunctions.lengthOfString(str);
                    break;
                case 0:cont = 0;
                    break;
                default:
                    System.out.println("Wrong choice entered:");

            }
        }while(cont == 1);

    }
}
