import java.util.Scanner;
class Book{
   int bookid;
   double price;
   String author,title;
   static int totalBooks=0;
   Book(int bookid, String title, String author, double price) {
        this.bookid = bookid;
        this.title = title;
        this.author = author;
        this.price = price;
        totalBooks++;
      }  
      void display(){
      System.out.println("Book ID:"+bookid);
      System.out.println("Book Name:"+title);
      System.out.println("Book Author:"+author);
      System.out.println("Book Price:"+price);
      }
      void search(int id){
      if (bookid==id)
      System.out.println("Book found");
      }    
      void search(String bookTitle) {
      if (title.equalsIgnoreCase(bookTitle))
          display();
     }
      Book costlierBook(Book b) {
       if (this.price > b.price)
           return this;
       else
           return b;}
}
class BookInfo{
   public static void main(String args[]){
        Book b1 = new Book(101, "Harry Potter", "JK Rowling", 550);
        Book b2 = new Book(102, "ATME", "Khaled Husseni", 200);
        Book b3 = new Book(103, "Alchemist", "Paulo Cohelo", 250);
        Book B[]={b1,b2,b3};
        int i;
        System.out.println("BOOK DETAILS");
        b1.display();
        b2.display();
        b3.display();
        System.out.println("SEARCH BY BOOK ID");
        for(i=0;i<Book.totalBooks;i++){
         B[i].search(102);}
        System.out.println("SEARCH BY TITLE");
        for(i=0;i<Book.totalBooks;i++){
         B[i].search("ATME");
         B[i].search("Random");}
        System.out.println("COSTLIER BOOK");
        Book costlier = b1.costlierBook(b2);
        costlier.display();
        System.out.println("Total books created = " + Book.totalBooks);
        }
}

   