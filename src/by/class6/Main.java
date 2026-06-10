package by.class6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
//    1.1.Создать коллекцию List (реализация ArrayList). Типизация коллекции – String.
    public static void main(String[] args) {
//        List<String> list = new ArrayList<String>();
//
//        list.add("привет");
//        list.add("как дела");
//        list.add("праздник");
//        list.add("суфле");
//
//        System.out.println(list);
//
////        1.4 Проверить, содержит ли коллекция слово Конфета
//
//        boolean confeta = list.contains("конфета");
//        System.out.println(confeta);
//
////        1.5 Посчитать количество элементов в коллекции
//        int count = list.size();
//        System.out.println(count);
//        2. Условие: Создайте ArrayList<String> для хранения списка покупок. Добавь в него 5 товаров. Затем выведите весь список на экран,
//        а после — удалите один товар по названию и снова выведите обновлённый список.
//        ArrayList<String> shoppingList = new ArrayList<String>();
//        shoppingList.add("товар1");
//        shoppingList.add("товар2");
//        shoppingList.add("товар3");
//        shoppingList.add("товар4");
//        shoppingList.add("товар5");
//        System.out.println(shoppingList);
//
//        shoppingList.remove("товар3");
//        System.out.println(shoppingList);
        //    Создайте 3 книги. И добавьте эти книги в коллекцию. Используйте метод List.of();

//        List<Book> books = List.of(
//                new Book("первая книга", "автор1");
//                new Book("вторая книга", "автор2");
//                new Book("книга 3", "автор3");


//        List<Book> books = new ArrayList<>();

        Set<Book> books = new HashSet<>();
                Book book = new Book("первая книга", "автор1");
                Book book1 = new Book("вторая книга", "автор2");
                Book book2 = new Book("книга 5", "автор5");
                Book book3 = new Book("книга 5", "автор7");


                books.add(book);
                books.add(book1);
                books.add(book2);
                books.add(book3);
//
//        System.out.println(books);
//
//        books.remove(book1);
//        System.out.println(books);

        System.out.println(books);






    }
}
