package pl.lech.shop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.text.DecimalFormat;

@Component
public class Article {
    DecimalFormat df = new DecimalFormat("0.00");
    private String name;
    private Double price;

    private Integer vat;
    protected Double discount;

    public void setVat(Integer vat) {
        this.vat = vat;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Article() {
    }

    public Article(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        String returnValue = "Article { name = " + name + ", price = " + df.format(price);
        if (vat != null) returnValue = returnValue + " VAT = " + vat;
        if (discount != null) returnValue = returnValue + " Discount = " + df.format(discount);
        returnValue = returnValue + " }";
        return returnValue;
    }
}
