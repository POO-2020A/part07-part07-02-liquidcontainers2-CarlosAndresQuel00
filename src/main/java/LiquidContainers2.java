
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();
        
        System.out.println("First: " + container1);
        System.out.println("Second: " + container2);

        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (command.equals("add")) {
                container1.add(amount);
                System.out.println("First: " + container1);
                System.out.println("Second: " + container2);
            } else if (command.equals("move")) {
                if (amount > 0 && container1.contains() != 0) {
                    container1.setAmount(container1.contains() - amount);
                    if (container1.contains() < 0) {
                        container2.setAmount(amount + container1.contains());
                        container1.setAmount(0);
                        System.out.println("First: " + container1);
                        System.out.println("Second: " + container2);
                    } else {
                        System.out.println("First: " + container1);
                        container2.setAmount(container2.contains() + amount);
                        if (container2.contains() <= 100) {
                            System.out.println("Second: " + container2);
                        } else {
                            container2.setAmount(100);
                            System.out.println("Second: " + container2);
                        }
                    }
                } else {
                    System.out.println("First: " + container1);
                    System.out.println("Second: " + container2);
                }
            } else if (command.equals("remove")) {
                container2.remove(amount);
                System.out.println("First: " + container1);
                System.out.println("Second: " + container2);
            }
        }
    }

}
