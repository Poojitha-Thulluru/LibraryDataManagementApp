class LibraryItem {
    int id ;
    private String title ;
    int year ;
    public LibraryItem(int id, String title ,int year) {
        this.id = id ;
        this.year = year ;
        this.title = title ;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String Title) {
        this.title = title;
    }
}
class Book extends LibraryItem {
    String author ;

    public Book(int id, String title ,int year, String author) {
        super(id, title ,year);
        this.author = author ;
    }
}

class Magazine extends LibraryItem {
    private int issue ;
    public Magazine(int id, String title, int year, int issue) {
        super(id, title, year) ;
        this.issue = issue ;
    }
    public int getIssue() {
        return issue ;
    }
    public void setIssue(int issue) {
        this.issue = issue ;
    }
}

public class Main{
    public static void main(String[] args) {
        Book book = new Book(1,"Harry Potter and the Philosopher's Stone" ,2002,"J.K Rowling") ;
        System.out.println("ID : "+book.id+"\n"+"Title : "+book.getTitle()+"\n"+"Year : " + book.year +"\n" + "Author : " + book.author);



        Magazine magazine = new Magazine(2,"Harry Potter and the Chamber of Secrets",2005, 7) ;
        System.out.println("ID : "+magazine.id+"\n"+"Title : "+magazine.getTitle()+"\n"+"Year : " + magazine.year +"\n" + "Issue : " +magazine.getIssue());
        magazine.setIssue(6);
        System.out.println("Issue is  "+magazine.getIssue()+ " set for "+magazine.getTitle());
    }
}