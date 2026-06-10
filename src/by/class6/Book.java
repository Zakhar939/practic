package by.class6;

import java.util.Objects;

public class Book {
//    3. Условие: Создай класс Book с полями:
//            • String title
//• String author
    String title;
    String author;
    public Book(String title, String author){
        this.title = title;
        this.author = author;

    }
//3.2 Переоперделите метод equals на книгах так,чтобы он всегда возвращал false


//    @Override
//    public boolean equals(Object object) {
//        return false;
//    }



    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
//        return author.hashCode() + title.hashCode();
        return 1;
    }

    @Override
    public String toString() {
        return "название='" + title + '\'' +
                ", автор='" + author;
    }
}
