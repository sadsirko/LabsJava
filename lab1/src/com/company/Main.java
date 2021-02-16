package com.company;
import com.company.Reader;
public class Main {
    public static void main(String[] args) {
        Reader example = new Reader();
        example.setSurname("Yaponchick");
        example.setName("Mishka");
        example.setAddress("Odessa Main Prison");
        example.setBook("The Count of Monte Cristo 1201902");
        System.out.println(example.getSurname());
    }
}

