package MVC;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collections;
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
    public List<String> getAllAuthors(){
        List<Book> foundBooks = bookRepository.findAll();
        List<String> authors = foundBooks.stream()
                                            .map(book->book.getAuthor())
                                            .distinct()
                                            .toList();
        return authors;
    }
    public List<Book> getByAuthor(String name){
        List<Book> foundBooks = bookRepository.findAll();
        List<Book> booksByAuthor = foundBooks.stream().filter(book->book.getAuthor().equals(name)).toList();
        return booksByAuthor;
    }


    public boolean bookContainsThisAuthor(Book book, String name) {
       return book.getAuthor().equals(name);
    }

    public void changeBook( Book newBook, long id) {
        if(bookRepository.existsById(id)) {
            bookRepository.deleteById(id);
            bookRepository.save(newBook);
        }
    }

    public void removeBook(Book book){
        bookRepository.delete(book);
    }
 public boolean containsBook(Book book) {

        if (bookRepository.findById(book.getId()) != null) {
            return true;
        }
        return false;
 }

//    public Book getByIdAndName(long id, String name){
//
//        return bookRepository.getByIdAndName(id,name);
//    }

}
