package org.example;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.function.Supplier;

public class Application {

   public static void main(String[]args){
      Faker fake = new Faker(Locale.ITALY);
      Random rndm = new Random();
      Supplier<Customer> customerSupplier = () -> new Customer(fake.number().numberBetween(1L,1000L), fake.name().firstName(), rndm.nextInt(1, 3));
      List<Customer> customerList = new ArrayList<>();

      for (int i = 0; i < 5; i++) {
         customerList.add(customerSupplier.get());
      }
      System.out.println(customerList);

      Faker fake2 = new Faker(Locale.ITALY);
      Random rndm2 = new Random();
      Supplier<Product> productSupplier = () -> new Product(fake.number().numberBetween(1L,1000L), fake.book(), fake.funnyName(),fake.number());
      List<Product> productList = new ArrayList<>();

      for (int i = 0; i < 5; i++) {
         productList.add(productSupplier.get());
      }
      System.out.println(productList);
   }
}
