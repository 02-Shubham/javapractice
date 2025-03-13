import java.util.Scanner;

public class madlibgame {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String adjective1;
        String noun1;
        String verb1;
        String adjective3;
        System. out. print("Enter an adjective (description) :");
        adjective1 = scanner.nextLine();
        System. out. print("Enter a noun (animal or person):");
        noun1 = scanner.nextLine();
        System. out. print("Enter a verb end with -ing (action):");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective (description):");
        adjective3 = scanner.nextLine();

        System.out.println("Today I saw  a "+ adjective1+ noun1);
        System.out.println("That loves to "+ verb1 );
        System.out.println(noun1 +" was "+ verb1 + "and") ;
        System.out.println("I was most "+ adjective3 +"sight I've ever seen!");


        scanner.close();

    }    
}
