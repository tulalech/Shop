package pl.lech.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Profile("plus")
public class ShopPlus extends Shop {

    @Value("${vat}")
    private int vat;

    public ShopPlus() {
        List<Article> articleList = super.getArticleList();
        for (Article article: articleList) {
            article.setVat(vat);
        }
    }

    @EventListener(ApplicationReadyEvent.class)
    public void showArticle() {
        articleList.forEach(System.out::println);
    }

}

