package com.majkel.PROJEKTY.EmailApp;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("John","Smith");
        em1.setAlternateEmail("js@gmail.com");
        System.out.println(em1.getAlternateEmail());
    }
}
