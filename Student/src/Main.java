import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Book> books1 = List.of(
                new Book("Книга1", 300, 2010),
                new Book("Книга2", 150, 2005),
                new Book("Книга3", 200, 2018),
                new Book("Книга4", 100, 1999),
                new Book("Книга5", 400, 2015)
        );

        List<Book> books2 = List.of(
                new Book("Книга5", 400, 2015),
                new Book("Книга3", 200, 2018),
                new Book("Книга6", 320, 2020),
                new Book("Книга7", 250, 2002),
                new Book("Книга8", 220, 1997)
        );

        List<Student> students = List.of(
                new Student("Анюта", books1),
                new Student("Лёша", books2)
        );

        students.stream()
                .peek(System.out::println)
                .flatMap(student -> student.getBooks().stream())
                .sorted(Comparator.comparingInt(book -> book.pages))
                // distinct пока не использовала, не до конца поняла, как работает с equals
                .filter(book -> book.year > 2000)
                .limit(3)
                .map(book -> {
                    System.out.println("Год выпуска: " + book.year);
                    return book;
                })
                .findFirst()
                .ifPresent(book -> System.out.println("Найдена книга: " + book.title + " (" + book.year + ")"));
    }
}