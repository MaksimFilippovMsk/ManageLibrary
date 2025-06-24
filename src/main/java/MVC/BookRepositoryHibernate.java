package MVC;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class BookRepositoryHibernate {
    private Session session;

    public BookRepositoryHibernate(Session session) {
        this.session = session;
    }

    public void saveBook(Book book) {
        Transaction transaction = session.beginTransaction();
        session.save(book);
        transaction.commit();
    }

    @Transactional
    public void saveBook2(Book book) {
        session.save(book);
    }

    public Book getBook(Long id) {
        return session.get(Book.class, id);
    }

    public List<Book> getAllBooks() {
        Query<Book> query = session.createQuery("FROM Book", Book.class);
        return query.list();
    }

    public void updateBook(Book book) {
        Transaction transaction = session.beginTransaction();
        session.update(book);
        transaction.commit();
    }

    public void deleteBook(Long id) {
        Transaction transaction = session.beginTransaction();
        Book book = getBook(id);
        if (book != null) {
            session.delete(book);
        }
        transaction.commit();
    }

}
