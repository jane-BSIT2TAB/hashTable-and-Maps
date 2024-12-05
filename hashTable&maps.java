import java.util.HashMap;
import java.util.Scanner;

public class HashTableApp {

    public static void main(String[] args) {
        HashMap<String, Integer> hashTable = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add entry");
            System.out.println("2. Search entry");
            System.out.println("3. Delete entry");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter key: ");
                    String key = scanner.nextLine();
                    System.out.print("Enter value: ");
                    int value = scanner.nextInt();
                    hashTable.put(key, value);
                    System.out.println("Entry added.");
                    break;
                case 2:
                    System.out.print("Enter key to search: ");
                    String searchKey = scanner.nextLine();
                    if (hashTable.containsKey(searchKey)) {
                        System.out.println("Value: " + hashTable.get(searchKey));
                    } else {
                        System.out.println("Entry not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter key to delete: ");
                    String deleteKey = scanner.nextLine();
                    if (hashTable.containsKey(deleteKey)) {
                        hashTable.remove(deleteKey);
                        System.out.println("Entry deleted.");
                    } else {
                        System.out.println("Entry not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
