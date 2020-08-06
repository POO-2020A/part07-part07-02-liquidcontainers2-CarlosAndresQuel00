
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();

        while (true) {
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);
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
            } else if (command.equals("move")) {
                if (container1.contains() == 0) {
                    container2.add(0);
                } else if (container1.contains() - amount >= 0 && container2.contains() + amount <= 100) {
                    container1.remove(amount);
                    container2.add(amount);
                } else if (container1.contains() < amount) {
                    container2.add(container1.contains());
                    container1.add(0);
                } else {
                    container1.add(0);
                    container2.add(100);
                }
            } else if (command.equals("remove")) {
                if (container2.contains() < amount) {
                    container2.add(0);
                } else if (container2.contains() - amount >= 0) {
                    container2.remove(amount);
                }
            }
        }
    }

}
