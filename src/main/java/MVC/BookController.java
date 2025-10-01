package MVC;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    private BookService bookService;


    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/allBooks")
    public ResponseEntity<?> getAllBooks() {
        //todo bookrepository.getAllBooks
        return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
    }

    @PostMapping("/admin/addBook")
    public ResponseEntity<?> addBook(@RequestBody Book book) {
        bookService.addBook(book);
        if(bookService.containsBook(book)) {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>("Не удалось добавить книгу",HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PutMapping("/admin/changeBook")
    public void changeBook(@RequestBody Book newBook, @RequestParam(name = "id") long id) {         // fixme
        bookService.changeBook(newBook, id);
    }
    @GetMapping("/getAllAuthors")
    public List<String> getAllAuthors() {
        return bookService.getAllAuthors();
    }
    @GetMapping("/getByAuthor")
    public List<Book> getByAuthor(@RequestParam(name = "name") String name) {
        return bookService.getByAuthor(name);
    }

    @DeleteMapping("/deleteBook")
    public void removeBook(@RequestBody Book book) {
        bookService.removeBook(book);
    }


}
