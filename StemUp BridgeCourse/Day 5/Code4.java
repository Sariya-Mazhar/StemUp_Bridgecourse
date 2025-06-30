public class Code4 {
    String title;
    String author;
    int numPages;
    boolean isOpen;

     public Code4(String title, String author, int numPages){
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        this.isOpen = true; 
    }
    public void closeBook() {
        isOpen = false;
        System.out.println("The book is now closed.");
    }
   
    public void openBook() {
        isOpen = true;
        System.out.println("The book is now open.");
    }
    public void Info() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + numPages);
    }
    
    public static void main(String[] args) {
        Code4 myBook = new Code4("Varity", "Colleen Hoover", 350);
        myBook.Info();

        myBook.openBook();
        myBook.Info();

        myBook.closeBook();
        myBook.Info();
    }
}
