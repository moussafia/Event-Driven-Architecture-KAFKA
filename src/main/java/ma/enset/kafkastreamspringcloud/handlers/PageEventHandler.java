package ma.enset.kafkastreamspringcloud.handlers;

import ma.enset.kafkastreamspringcloud.events.PageEvent;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

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


    @Bean
    public Supplier<PageEvent> pageEventSupplier(){
        return () -> {
            return new PageEvent(
                    Math.random() > 0.5 ?"P1":"P2",
                    Math.random() > 0.5 ?"U1":"U2",
                    new Date(),
                    10 + new Random().nextInt(10000)

            );
        };
    }



}
