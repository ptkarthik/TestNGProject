package LibrarySystem;

import java.util.List;

public class Member {
    private String name;

    public Member(String name, List<Book> memberCheckout, String id) {
        this.name = name;
        this.memberCheckout = memberCheckout;
        this.id = id;
    }

    public List<Book> getMemberCheckout() {
        return memberCheckout;
    }

    public void setMemberCheckout(List<Book> memberCheckout) {
        this.memberCheckout = memberCheckout;
    }

    private List<Book> memberCheckout;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String id;
//    Private List<>
}
