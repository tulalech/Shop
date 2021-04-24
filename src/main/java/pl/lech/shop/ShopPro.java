package pl.lech.shop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Profile("pro")
public class ShopPro extends Shop {

    @Value("${vat}")
    private int vat;
    @Value("${discount}")
    private double discount;

    public ShopPro() {
        List<Article> articleList = super.getArticleList();
        for (Article article: articleList) {
            article.setVat(vat);
            article.setDiscount(discount);
        }
    }

    @EventListener(ApplicationReadyEvent.class)
    public void showArticle() {
        articleList.forEach(System.out::println);
    }

}

