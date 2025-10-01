package MVC;

import bot.BookLibraryBot;
import marketplaceclient.MainSpring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class);

//        TelegramBotsApi botsApi = null;
//        try {
//            botsApi = new TelegramBotsApi(DefaultBotSession.class);
//            botsApi.registerBot(new BookLibraryBot());
//        } catch (TelegramApiException e) {
//            throw new RuntimeException(e);
//        }
    }
}
