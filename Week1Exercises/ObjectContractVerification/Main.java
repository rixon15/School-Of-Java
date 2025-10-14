package ObjectContractVerification;

public class Main {

    static void main() {

        Book book1 = new Book("asd123", "Bilo", "Olib");
        Book book2 = new Book("asd123", "Olib", "Bilo");
        Book book3 = new Book("asd1235dsa", "Bilo", "Olib");

        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));


    }

}
