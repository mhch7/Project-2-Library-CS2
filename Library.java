import java.util.ArrayList;

public class Library{
private ArrayList<Book> bookList;

public Library() {
  this.bookList = new ArrayList <Book>();
}

  public void add (Book book){
  bookList.add(book);
  System.out.println("Book has been added");
}
  
  public void listAllBooks () {
  for (int i = 0; i < bookList.size(); i++){
  System.out.println((i)+"."+" " +bookList.get(i).toString());
  }
  }
  
  public void findBookByTitle (String title) {
     for (int i = 0; i < bookList.size(); i++){
System.out.println(bookList.get(i).getAuthor()+"title");
     if (title.equalsIgnoreCase(bookList.get(i).getTitle())) {
     System.out.println((i)+"."+" "+bookList.get(i).toString());
     System.out.println("Book was found");
     return;
     }else{
       System.out.println("Book not found");
     }
     }
     } 
              
  public void findAllBooksByAuthor (String author) {
    boolean foundAuthor = false; 
    for (int i = 0; i < bookList.size(); i++){
    if (bookList.get(i).getAuthor().equalsIgnoreCase(author)) { 
    System.out.println((i)+"."+" " +bookList.get(i).toString());
    System.out.println("Author was found");
    foundAuthor = true;
    return;
    } 
    } 
    System.out.println("Author not found");
    }      
    }
    

  
