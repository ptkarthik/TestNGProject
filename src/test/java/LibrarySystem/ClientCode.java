package LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class ClientCode {
//    //
//    Model a library system, with classes for books, member, and checkouts.
//    The checkouts class should link a book and member together.
//    Book - title, author
//    Member - name, id, List checkout books
//    Checkout - book, member, checkoutDate, dueDate
//    Use streams to get max number of check out by each member

//    member can have multiple books and one checkout

//a checkout can have multiple books with it



    public static void main(String[] args) {

        Book book1 = new Book("Henry", "001");
        Book book2 = new Book("My Life", "002");
        Book book3 = new Book("Alpha", "003");

        Book book4 = new Book("Henry", "001");
        Book book5 = new Book("My Life", "002");

        List<Book> bks = new ArrayList<>();
        bks.add(book1);
        bks.add(book2);
        bks.add(book3);
        List<Book> bks2 = new ArrayList<>();
        bks2.add(book4);
        bks2.add(book5);



        Member member = new Member("Karthikeyan", bks, "654828");
        CheckOutClass checkOutClass = new CheckOutClass(bks,member,"10-03-2024","10-04-2024");
        CheckOutClass checkOutClass2 = new CheckOutClass(bks,member,"10-03-2024","10-04-2024");
        Member member2 = new Member("Pavithra", bks2, "654829");
        CheckOutClass checkOutClass3 = new CheckOutClass(bks,member2,"10-03-2024","10-04-2024");


        List<CheckOutClass> memberCheckout= new ArrayList<>();



    }

}
