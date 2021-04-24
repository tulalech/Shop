package pl.lech.shop;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
class Shop {
    int min = 50;
    int max = 300;
    public List<Article> articleList;

    public Shop() {
        Random random = new Random();
        Article art1 = new Article("groszek", random.nextDouble() * (max - min) + min);
        Article art2 = new Article("marchew", random.nextDouble() * (max - min) + min);
        Article art3 = new Article("kapusta", random.nextDouble() * (max - min) + min);
        Article art4 = new Article("borówki", random.nextDouble() * (max - min) + min);
        Article art5 = new Article("gruszki", random.nextDouble() * (max - min) + min);
        articleList = new ArrayList<>();
        articleList.add(art1);
        articleList.add(art2);
        articleList.add(art3);
        articleList.add(art4);
        articleList.add(art5);
    }

    public List<Article> getArticleList() {
        return articleList;
    }

}
