package by.class3;

public class Book {
    int id;
    String name;
    String author;
    String publisher;
    int year;
    int quantity;
    double price;

    public Book(int id, String name, String author, String publisher, int year, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.quantity = quantity;
        this.price = price;

    }

    public Book() {
    }

    public String info() {
        String result = "ID: " + id + " Название: " + name + " Автор: " + author + " Издательство: " + publisher + " Год издания: " + year + " Количество страниц: " + quantity + " Цена: " + price;


        // return "ID: " + id + "Название: " + name + "Автор: " + author + "Издательство: " + publisher + "Год издания: " + year + "Количество страниц: " + quantity + "Цена: " + price;

        return result;
    }

    public void changPrice(double newPrice) {
        this.price = newPrice;

    }

}

