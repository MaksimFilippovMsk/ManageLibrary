package MVC;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private BookRepository bookRepository;


    //  class HAS-ONLY-ONE field       MVC.BookService HAS-ONLY-ONE ArrayList

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
//      bookRepository = new MVC.BookRepository();  ошибка
    }

    public List<Book> getAllBooks() {
        //todo bookrepository.getAllBooks
       return bookRepository.findAll();
    }

    public void addBook(Book book){
        bookRepository.save(book);

    }
//    public void changeBook(MVC.Book book,long newId){
//    }

    public void removeBook(Book book){
        bookRepository.delete(book);
    }

}
