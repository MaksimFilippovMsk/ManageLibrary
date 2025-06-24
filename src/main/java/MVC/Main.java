package MVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
       SpringApplication.run(Main.class);

        // сканирует все компоненты и запоминает ка

        BookController controller1 = new BookController(null);
        BookController controller2 = new BookController(null);
        BookController controller3 = new BookController(null);

        System.out.println(controller3);
    }
}
