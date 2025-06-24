package MVC;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.times;

public class BookServiceTest {

    private static  BookRepository bookRepository;
    private static BookService bookService;
    private static ArrayList<Book> books;
    private Book book;

    @BeforeAll
    public static void initData() {
        bookRepository = Mockito.mock(BookRepository.class);
        bookService = new BookService(bookRepository);
        books = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            books.add(new Book(8980, "Война и мир", "Толстой", 1800));
        }
    }
    @Test
    public void getAllBooksTest() {
        Mockito.when(bookRepository.findAll()).thenReturn(books);               //                          bookService.getAllBooks() --> "bookRepository".findAll()
                                                                                //  assertEquals() <--      ArrayList                <-- ArrayList
        Assertions.assertEquals(books, bookService.getAllBooks());              //                          bookService.getAllBooks() --> bookRepository.findAll() --> database

        Mockito.verify(bookRepository, times(1)).findAll();
    }

    @Test
    public void addBook() {

//        Mockito.when(bookRepository.save(new Book(4566, "Война и мир", "Толстой", 1800)));
//        Assertions.assertEquals(book, bookService.addBook());
    }

//    @Test
//    public void changeBook() {
//        Mockito.when(bookRepository.(new Book(4566, "Война и мир", "Толстой", 1800)));
//        Assertions.assertEquals(book, null);
//    }
//
//    @Test
//    public void sum() {
//        Assertions.assertEquals(12, calculator.sum(3,4,5));
//    }

}
