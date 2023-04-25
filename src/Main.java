import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact();
        List<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact("John Doe", 7717085, "johnbdoe@gmail.com"));
        contacts.add(new Contact("Joe Black", 888934983, "joeblack@gmail.com"));
        contacts.add(new Contact("Susan Black", 34234324, "susanblack@gmail.com"));

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Welcome to Address Book App!");
            System.out.println();

            while (true) {
                System.out.println("""
                        MENU:
                        1. VIEW_ALL_CONTACT
                        2. ADD_CONTACT
                        3. EDIT_CONTACT
                        4. DELETE_CONTACT
                        5. SEARCH_CONTACT
                        6. SORT_CONTACT
                        7. EXIT
                        """);

                System.out.print("Option: ");
                String option = sc.nextLine();

                switch (option) {
                    case "1" -> contact.viewAllContact(contacts);
                    case "2" -> contact.addContact(contacts);
                    case "3" -> contact.editContact();
                    case "4" -> contact.deleteContsct();
                    case "5" -> contact.searchContact();
                    case "6" -> contact.sortContact();
                    case "7" -> System.exit(0);
                    default -> System.out.println("Invalid value is added. Please try again!");
                }
            }
        }

    }
}