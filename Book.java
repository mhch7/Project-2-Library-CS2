public class Book {
  private String author;
  private String title;
  private int year;

  public Book(String title, String author, int year) {
    this.author = author;
    this.title = title;
    this.year = year;
  }

public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }

  public int getYear() {
    return year;
  }
  
    public String toString(){
      return author + " " + title + " " + "("+year+ ")";
    }
}

