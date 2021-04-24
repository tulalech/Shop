package pl.lech.shop;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Profile("start")
public class ShopStart extends Shop {

    @EventListener(ApplicationReadyEvent.class)
    public void showArticle() {
        articleList.forEach(System.out::println);
    }

}

