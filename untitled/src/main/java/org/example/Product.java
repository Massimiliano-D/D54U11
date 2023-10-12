package org.example;

import com.github.javafaker.FunnyName;
import com.github.javafaker.Name;
import com.github.javafaker.Number;

import java.awt.print.Book;

public class Product {
    Long id;
    com.github.javafaker.Book name;
    FunnyName category;
    Number price;

    public Product(Long id, com.github.javafaker.Book name, FunnyName category, Number price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Number getPrice() {
        return price;
    }

    public void setPrice(Number price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
