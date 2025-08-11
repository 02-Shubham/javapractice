import java.util.Scanner;

public class shoppingcart {
    public static void main(String[] args) {
        System.out.println("Shopping cart");

        Scanner sc = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency='R';
        double total;

        System.out.print("Enter what item you want to buy?:");
        item= sc.nextLine();
        System.out.println("what is price for one "+item+"?");
        price= sc.nextDouble();
        System.out.println("How many "+item+" do you want to buy?");
        quantity=sc.nextInt();

        total = price*quantity;

        System.out.println( "your total is "+currency+total);
        sc.close();


        
    }
}
