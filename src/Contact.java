import java.util.List;

public class Contact {
    private String name;
    private int phone;
    private String email;

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

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void viewAllContact(List<Contact> contacts) {
        int i = 1;
        for (Contact contact : contacts) {
            System.out.println("#" + i + " Contact information: ");
            System.out.println("Name: " + contact.name);
            System.out.println("Phone #: " + contact.phone);
            System.out.println("Email: " + contact.email);
            System.out.println();
            i++;
        }
    }

    public void addContact() {
    }

    public void editContact() {
    }

    public void deleteContsct() {
    }

    public void searchContact() {
    }

    public void sortContact() {
    }

}
