package MVC;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {


    //todo JPARepository, better to only read about it, but write controller
    //  @Entity is needed in MVC.Book.class
    //  @Id is needed in MVC.Book.class
    //  application.properties file is needed in directory resources on the left
    //  install database server (mysql server or postgre)
}



// below: no jpa


//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//@Repository
//public class MVC.BookRepository {
//    private ArrayList<MVC.Book> books;
//
//    public MVC.BookRepository() {
//        //todo DB
//        books = new ArrayList<>();
//    }
//
//    public ArrayList getAllBooks() {
//        return books;
//    }
//    public void addBook(MVC.Book book){
//        books.add(book);
//    }
////    public void changeBook(MVC.Book book,long newId){
////
////        // todo using streams (or for cycle)
////
////      for(MVC.Book book:books){
////           books.remove(book.getId());
////           books.add(book.setId(newId)); //Как поступуть (вопрос 6)
////       }
////    }
//    public void removeBook(MVC.Book book){
//        books.remove(book);
//    }
//}
