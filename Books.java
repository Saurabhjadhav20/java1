
public class Books {
    private String title;
    private String author;
    private double price;
    private int stock;

    public Books(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price:" + price);
        System.out.println("Stock: " + stock);
    }

    public void applyDiscount() {
        if (stock > 100) {
            price *= 0.9; 
            System.out.println("Discount applied!");
        }
    }

    public static void main(String[] args) {
        Books book1 = new Books("The Lord", "aaaa", 29.99, 150);
        Books book2 = new Books(" the god", "asdf", 14.99, 80);

        book1.displayDetails();
        book1.applyDiscount();
        book1.displayDetails();

        System.out.println();

        book2.displayDetails();
        book2.applyDiscount();
        book2.displayDetails();
    }
}