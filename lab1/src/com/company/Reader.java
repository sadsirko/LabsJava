package com.company;

import java.time.LocalDate;

public class Reader {
    private String surname;
    private String name;
    private String address;
    private String []book ;
    private LocalDate [] dateWhenTook;
    private int [] days;

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public void setBook(String aboutBook){
        if (this.book == null) {
            this.book = new String[100];
            this.book[0] = aboutBook;
        }
            else
        this.book[this.book.length] = aboutBook;
    }

    public void setBookDateTook(LocalDate date){
        this.dateWhenTook[this.dateWhenTook.length] = date;
    }

    public String getSurname(){
        return this.surname;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return surname;
    }

    public String[] getBook(){
        return this.book;
    }

    public LocalDate[] getBookDateTook(){
        return this.dateWhenTook;
    }

    public int[] getDays(){
        return this.days;
    }
}
