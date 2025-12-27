package ma.enset.kafkastreamspringcloud.handlers;

import ma.enset.kafkastreamspringcloud.events.PageEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class PageEventHandler {

    @Bean
    public Consumer<PageEvent> pageEventConsumer(){
        return pageEvent -> {
            System.out.println("*********************************************");
            System.out.println(pageEvent.toString());
            System.out.println("*********************************************");
        };
    }
}
