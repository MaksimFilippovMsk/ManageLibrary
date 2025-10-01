package marketplaceclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class SpringConfig {

    @Bean
    public BookResult createBookResult(){
        System.out.println("Enter book name:");
        String bookname = new Scanner(System.in).nextLine();
        return new BookResult(bookname,199,"yandex.ru");
    }

    // ...
}
