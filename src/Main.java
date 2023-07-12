//class LibraryItem {
//    int id ;
//    private String title ;
//    int year ;
//    public LibraryItem(int id, String title ,int year) {
//        this.id = id ;
//        this.year = year ;
//        this.title = title ;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String Title) {
//        this.title = title;
//    }
//}
//class Book extends LibraryItem {
//    String author ;
//
//    public Book(int id, String title ,int year, String author) {
//        super(id, title ,year);
//        this.author = author ;
//    }
//}
//
//class Magazine extends LibraryItem {
//    private int issue ;
//    public Magazine(int id, String title, int year, int issue) {
//        super(id, title, year) ;
//        this.issue = issue ;
//    }
//    public int getIssue() {
//        return issue ;
//    }
//    public void setIssue(int issue) {
//        this.issue = issue ;
//    }
//}
//
//public class Main{
//    public static void main(String[] args) {
//        Book book = new Book(1,"Harry Potter and the Philosopher's Stone" ,2002,"J.K Rowling") ;
//        System.out.println("ID : "+book.id+"\n"+"Title : "+book.getTitle()+"\n"+"Year : " + book.year +"\n" + "Author : " + book.author);
//
//
//
//        Magazine magazine = new Magazine(2,"Harry Potter and the Chamber of Secrets",2005, 7) ;
//        System.out.println("ID : "+magazine.id+"\n"+"Title : "+magazine.getTitle()+"\n"+"Year : " + magazine.year +"\n" + "Issue : " +magazine.getIssue());
//        magazine.setIssue(6);
//        System.out.println("Issue is  "+magazine.getIssue()+ " set for "+magazine.getTitle());
//    }
//}

class LibraryItem {
    private int id ;    // can't be accessed outside of the class so the getters and setters are defined here itself.
    String title ;
    int year ;
    public int getId() {           // Encapsulation for security purposes
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
class Book extends LibraryItem {
    String author ;
    public void printBook(int id, String title, int year, String author) {           // Function name should be in camel case
        System.out.println(id +" "+ title +" "+ year +" "+ author) ;
    }
}

class Magazine extends LibraryItem {
    int issue ;
    public void printMagazine (int id, String title, int year, int issue) {
        System.out.println(id+" "+title+" "+year+" "+issue) ;
    }
}

public class Main {
    public static void main(String[] args) {
        Book alchemist = new Book() ;
        alchemist.setId(28874) ;
        alchemist.title = "The Alchemist" ;
        alchemist.year = 1920 ;
        alchemist.author = "Paulo Coelho" ;
        alchemist.printBook(alchemist.getId(), alchemist.title, alchemist.year, alchemist.author) ;

        Magazine fortNight = new Magazine() ;
        fortNight.setId(875) ;
        fortNight.title = "The Fort Night" ;
        fortNight.year = 1963 ;
        fortNight.issue = 6 ;
        fortNight.printMagazine(fortNight.getId(), fortNight.title, fortNight.year, fortNight.issue) ;

    }
}