public class Code7 {
    String title;
    String author;
    boolean isOpen;
    String status;

    Code7(String t, String a, boolean o) {
        title = t;
        author = a;
        isOpen = o;
    }

    void displayStatus() {
        
                                            //*void displayStatus() {
                                            // String status = isOpen ? "Open" : "Closed";
                                            // System.out.println(title + " by " + author + " is " + status);
                                            // }/
       if (isOpen) { 
        status = "Open";
        } else {
            status = "Closed";
        }
        System.out.println(title + " by " + author + " is " + status);
    }

    public static void main(String[] args) {
        Code7 book1 = new Code7("abc", "def", true);
        Code7 book2 = new Code7("xyz", "ghi", false);

        book1.displayStatus();
        book2.displayStatus();
    }
}
