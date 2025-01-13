package challange47;
public class LibraryItems {
    public int id;
    public String title;
    public String author;
    private boolean isCheckOut;

    LibraryItems(int id,String title,String author){
        this.id=id;
        this.title=title;
        this.author=author;
        isCheckOut=false;
    }

    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public void checkOut(){
        if (!isCheckOut){
            isCheckOut=true;
            System.out.println(title+" : has been checked out.");
        }else {
            System.out.println(title+" : is already checked out.");
        }
    }

    public void returnItem(){
        if (isCheckOut){
            isCheckOut=false;
            System.out.println(title+" : has been returned.");
        }else {
            System.out.println(title+" : its already returned.");
        }
    }
}
class Book extends LibraryItems{
    private String isbn;
    Book(int id, String title, String author,String isbn) {
        super(id, title, author);
        this.isbn=isbn;
    }
    public String getIsbn(){
        return isbn;
    }
    public void displayBookDetails(){
        System.out.println("Book Title : "+getTitle());
        System.out.println("Book Author : "+getAuthor());
        System.out.println("Book Id : "+getId());
        System.out.println("Book isbn : "+getIsbn());
    }

}

class magazine extends LibraryItems {
    private int issueNumber;
    magazine(int id, String title, String author,int issueNumber) {
        super(id, title, author);
        this.issueNumber=issueNumber;
    }
    public int getIssueNumber(){
        return issueNumber;
    }
    public void displayMagazineDetails(){
        System.out.println("Magazine Title : "+getTitle());
        System.out.println("Magazine Author : "+getAuthor());
        System.out.println("Magazine id : "+getId());
        System.out.println("Magazine issueNumber : "+getIssueNumber());
    }
        }

        class DVD extends LibraryItems {
             private int duration;
              DVD(int id, String title, String author,int duration) {
                super(id, title, author);
                this.duration=duration;
            }
            public int getDuration(){
                  return duration;
            }
            public void displayDVDDetails(){
                System.out.println("DVD Title : "+getTitle());
                System.out.println("DVD Author : "+getAuthor());
                System.out.println("DVD Id : "+getId());
                System.out.println("DVD Duration : "+getDuration());
            }
        }
