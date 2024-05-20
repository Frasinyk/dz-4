package org.example;

public class Phone {
    String phoneBrand = "Iphone";
    int price = 1200;
    char currency = '$';

    public Phone(String phoneBrand, int price, char currency) {
        System.out.printf("phone1 %s has price %d %s \n", this.phoneBrand, this.price, this.currency);
        this.phoneBrand = phoneBrand;
        this.price = price;
        this.currency = currency;
    }

}
