import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Contact {
    private String name;
    private int phone;
    private String email;

    static final Scanner sc = new Scanner(System.in);

    public Contact() {
    }

    public Contact(String name, int phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void viewAllContact(List<Contact> contacts) {
        int i = 1;
        for (Contact contact : contacts) {
            System.out.println("Contact #" + i);
            contactInfo(contact);
            i++;
        }
    }

    public void addContact(List<Contact> contacts) {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter phone #: ");
        int phone = sc.nextInt();
        System.out.print("Enter email: ");
        sc.nextLine();
        String email = sc.nextLine();
        contacts.add(new Contact(name, phone, email));

    }

    public void editContact(List<Contact> contacts) {
        System.out.print("Enter the index of the contact to edit it: ");
        int index = sc.nextInt();
        contactInfo(contacts.get(index));
        System.out.print("What do you want to edit? (name/phone/email): ");

        String answer = sc.next();

        String newName;
        int newPhoneNum;
        String newEmail;
        if (answer.equals("name")) {
            System.out.print("Enter new name: ");
            sc.nextLine();
            newName = sc.nextLine();
            contacts.get(index).name = newName;
        }
        if (answer.equals("phone")) {
            System.out.print("Enter new phone #: ");
            newPhoneNum = sc.nextInt();
            sc.nextLine();
            contacts.get(index).phone = newPhoneNum;
        }
        if (answer.equals("email")) {
            System.out.print("Enter new email: ");
            sc.nextLine();
            newEmail = sc.nextLine();
            contacts.get(index).email = newEmail;
        }

        System.out.println("Contact has been edited succesfully!");
    }

    public void deleteContsct(List<Contact> contacts) {
        System.out.print("Enter the index of the contact to delete it: ");
        int index = sc.nextInt();
        contacts.remove(index - 1);
        System.out.println("Contact has been removed!");
    }

    public void searchContact(List<Contact> contacts) {
        System.out.print("How do you want to search by name or by phone # or by email? (name/phone/email): ");
        String searchOption = sc.next();

        String name;
        int phone;
        String email;
        if (searchOption.equals("name")) {
            System.out.print("Enter the name of the contact to find it: ");
            sc.nextLine();
            name = sc.nextLine();

            for (Contact contact : contacts) {
                if (contact.name.equals(name)) {
                    contactInfo(contact);
                }
            }
        }
        if (searchOption.equals("phone")) {
            System.out.print("Enter the phone number of the contact to find it: ");
            phone = sc.nextInt();
            sc.nextLine();

            for (Contact contact : contacts) {
                if (contact.phone == phone) {
                    contactInfo(contact);
                }
            }
        }
        if (searchOption.equals("email")) {
            System.out.print("Enter the email of the contact to find it: ");
            sc.nextLine();
            email = sc.nextLine();

            for (Contact contact : contacts) {
                if (contact.email.equals(email)) {
                    contactInfo(contact);
                }
            }
        }

    }

    public void sortContact(List<Contact> contacts) {
        System.out.print("Would you like to sort by name or by phone number or by email? (name/phone/email):  ");
        String option = sc.next();

        // Define a comparator based on the selected option
        Comparator<Contact> comparator;
        switch (option) {
            case "name" -> comparator = Comparator.comparing(Contact::getName);
            case "phone" -> comparator = Comparator.comparing(Contact::getPhone);
            case "email" -> comparator = Comparator.comparing(Contact::getEmail);
            default -> {
                System.out.println("Invalid option");
                return;
            }
        }

        // Sort the list using the selected comparator
        contacts.sort(comparator);
        System.out.println("Contacts sorted by " + option);
        viewAllContact(contacts);
    }

    public void contactInfo(Contact contact) {
        System.out.println();
        System.out.println("Contact information: ");
        System.out.println("Name: " + contact.name);
        System.out.println("Phone #: " + contact.phone);
        System.out.println("Email: " + contact.email);
        System.out.println();
    }

}
