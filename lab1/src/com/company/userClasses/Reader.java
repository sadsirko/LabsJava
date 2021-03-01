package com.company.userClasses;

import com.company.userClasses.Book;

public class Reader {
    private String surname;
    private String name;
    private String address;
    private Book[]books;
    private int numOfBooks = 0;
    private int MAX_BOOK = 10;
    public Reader(String name,String surname,String address){
        this.surname = surname;
        this.name = name;
        this.address = address;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public void setBooks (String bookName, String dateWhenTook, int days) {
        if (this.books == null) {
            this.books = new Book[MAX_BOOK];
            this.books[0] = new Book(bookName,dateWhenTook,days);
        }
        else
            this.books[this.numOfBooks]  = new Book(bookName,dateWhenTook,days);
        numOfBooks++;
    }

    public String getSurname(){
        return this.surname;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public Book[] getBook(){
        return this.books;
    }

    public int getNumOfBooks(){
        return this.numOfBooks;
    }


    public String toString () {
        String ret =
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'';

        for (int i = 0; i < this.numOfBooks; i++){
            ret = ret + '\n' + " book: '" + books[i].getBookName() + '\'' +
                    " Date when took: '" + books[i].getDateWhenTook() + '\'' +
                    " Days: '" + books[i].getDays() + '\'' + '\n';
        }
    return ret;
    }
}