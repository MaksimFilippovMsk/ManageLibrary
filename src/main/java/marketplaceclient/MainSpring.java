package marketplaceclient;

import MVC.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainSpring {

    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(MainSpring.class);
        System.out.println(ac.getBean(BookResult.class));
    }
}
