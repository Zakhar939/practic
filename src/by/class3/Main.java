package by.class3;

public class Main {
    public static void main(String[] args) {

//        Book book1 = new Book(1, "Война и мир", "Толстой", "Просвещение", 1964, 123, 52);
//        Book book2 = new Book(2, "Преступление", "Достоевский", "Азбука", 1656, 672, 18.9);
//        Book book3 = new Book(3, "Мастер и Маргарита", "Булгаков", "Эксмо", 1987, 464, 22);
//        Book book4 = new Book(4, "1984", "Оруэлл", "АСТ", 1559, 310, 15);
//        Book book5 = new Book(5, "Властелин колец", "Толкин", "Астрель", 1933, 1178, 28.3);
//
//        String infoForBook1;
//        String infoForBook2;
//        String infoForBook3;
//        String infoForBook4;
//        String infoForBook5;
//
//        infoForBook1 = book1.info();
//        infoForBook2 = book2.info();
//        infoForBook3 = book3.info();
//        infoForBook4 = book4.info();
//        infoForBook5 = book5.info();

//        System.out.println(infoForBook1);
//        System.out.println(infoForBook2);
//        System.out.println(infoForBook3);
//        System.out.println(infoForBook4);
//        System.out.println(infoForBook5);

//        book2.changPrice(70);
//        String changBook = book1.info();
//        System.out.println(changBook);
        Book arreyBook[ ] = arreyBook();
        for (Book  x: arreyBook){
            System.out.println(x.info());
        }
    }

    public static Book[] arreyBook() {

        Book book1 = new Book(1, "Война и мир", "Толстой", "Просвещение", 1964, 123, 52);
        Book book2 = new Book(2, "Преступление", "Достоевский", "Азбука", 1656, 672, 18.9);
        Book book3 = new Book(3, "Мастер и Маргарита", "Булгаков", "Эксмо", 1987, 464, 22);
        Book book4 = new Book(4, "1984", "Оруэлл", "АСТ", 1559, 310, 15);
        Book book5 = new Book(5, "Властелин колец", "Толкин", "Астрель", 1933, 1178, 28.3);

        Book arreyBook[] = new Book[5];
        arreyBook[0] = book1;
        arreyBook[1] = book2;
        arreyBook[2] = book3;
        arreyBook[3] = book4;
        arreyBook[4] = book5;
        return arreyBook;


    }
}

