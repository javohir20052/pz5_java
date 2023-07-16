//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что
// 1 человек может иметь несколько телефонов.


public class Main {
    public static void main(String[] args){
        PhonBook phonBook = new PhonBook();
        phonBook.addBook("Иванов", "123456");
        phonBook.addBook("Василев", "654321");
        phonBook.addBook("Петров", "11223344");
        phonBook.addBook("Иванов", "55667788");
        phonBook.addBook("Иванов", "55667700");

        System.out.println(phonBook.printPhonBook("Иванов"));
    }
}
