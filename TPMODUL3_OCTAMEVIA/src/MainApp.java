import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Restaurant food = new Restaurant();
        int customerID, orderQty;
        try {

            System.out.print("Enter Customer ID: ");
            customerID = input.nextInt();

            System.out.print("Enter how much food to made: ");
            orderQty = input.nextInt();

            Thread t1 = new Thread(food);
            Waiters waiters = new Waiters(customerID, orderQty);
            Thread t2 = new Thread(waiters);

            t1.start();
            t2.start();
            t1.join();
            t2.join();

        } catch (Exception e) {
            System.out.println("tolong ya, inputannya bertipe integer");
        }
        
        input.close();

    }
}
