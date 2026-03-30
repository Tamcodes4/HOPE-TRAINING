package DAY_7.task;

class Library {
    int id = 986;
    String name = "anna library";

    void showLibrary() {
        System.out.println(id + " " + name);
    }
}

class Book extends Library {
    int id = 789;
    String name = "harry potters";

    void showBook() {
        showLibrary();
        System.out.println(id + " " + name);
    }
}

class Member extends Library {
    int id = 456;

    void showMember() {
        showLibrary();
        System.out.println(id);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Book b = new Book();
        b.showBook();

        Member m = new Member();
        m.showMember();
    }
}