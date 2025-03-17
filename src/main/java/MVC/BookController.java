package MVC;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("/allBooks")
    public List<Book> getAllBooks() {
        //todo bookrepository.getAllBooks
        return bookService.getAllBooks();
    }
    @PostMapping("/addBook")
    public void addBook(Book book){
        bookService.addBook(book);
    }
    //    public void changeBook(MVC.Book book,long newId){
//    }
    @DeleteMapping("/deleteBook")
    public void removeBook(Book book){
        bookService.removeBook(book);
    }

}
