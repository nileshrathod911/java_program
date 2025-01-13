  class bookLibrary {
    String author;
    String title;
    int isbn;
    static int totalNoOfBooks;
    boolean isBorrowed;

    static {
        totalNoOfBooks=0;
    }
      {
          totalNoOfBooks++;
      }
      bookLibrary(String author,String title,int isbn){
        this.author=author;
        this.isbn=isbn;
        this.title=title;
      }
      bookLibrary(int isbn){
        this("unknown","unknown",isbn);
        this.isbn=isbn;
      }

      public static int getTotalNoOfBooks() {
          return totalNoOfBooks;
      }

      void borrowBook(){
       if (isBorrowed){
           System.out.println("Book is already booked...");
       }else {
           this.isBorrowed=true;
           System.out.println("Enjoy the "+title+" Book");
       }
      }

      void returnBook(){
        if (isBorrowed){
            this.isBorrowed=false;
            System.out.println("Hope you enjoy the book please leave a review.");
        }else {
            System.out.println("this Book is already in the library");
        }
      }

      public static void main(String[] args) {
        bookLibrary gita=new bookLibrary(1);
        //bookLibrary mahabharat=new bookLibrary("AcharyaPrashant","mahaBharat",2);
        gita.borrowBook();
        gita.returnBook();

        gita.borrowBook();
        gita.borrowBook();
        gita.returnBook();
        gita.returnBook();

      }
}
