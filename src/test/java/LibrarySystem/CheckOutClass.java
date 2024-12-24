package LibrarySystem;

import java.util.List;

public class CheckOutClass {
    private List<Book> booksList;
    private Member member;

    public String getCheckoutDate() {
        return checkoutDate;
    }

    public CheckOutClass(List<Book> booksList, Member member, String checkoutDate, String dueData) {
        this.booksList = booksList;
        this.member = member;
        this.checkoutDate = checkoutDate;
        this.dueData = dueData;
    }

    public void setCheckoutDate(String checkoutDate) {
        this.checkoutDate = checkoutDate;
    }


    public List<Book> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Book> booksList) {
        this.booksList = booksList;
    }

    private String checkoutDate;

    public String getDueData() {
        return dueData;
    }

    public void setDueData(String dueData) {
        this.dueData = dueData;
    }

    private String dueData;

}
