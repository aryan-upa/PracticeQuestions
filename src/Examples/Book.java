package Examples;

public class Book {
    String name;
    double price;
    int qtyInStock;
    static String Author;

    static {
        Author = "Alfred Hitch";
    }

    public Book(String name, double price, int qtyInStock) {
        this.name = name;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public static String getAuthor() {
        return Author;
    }
}

class BookExecution{
    public static void main(String[] args) {
        Book no1 = new Book("The tale of 2 birds",140.75,5);
        Book no2 = new Book("Affairs of the heart",940.60,2);
        System.out.println("Book1 Details \n"+no1.getName() + "\nPrice : " + no1.getPrice()
                + "\nQuantity in Stock : " + no1.getQtyInStock() + "\nAuthor : " + Book.getAuthor());
        System.out.println();
        System.out.println("Book2 Details \n"+no2.getName() + "\nPrice : " + no2.getPrice()
                + "\nQuantity in Stock : " + no2.getQtyInStock() + "\nAuthor : " + Book.getAuthor());
    }
}