package com.company;

import java.time.LocalDate;

public class Model {
    private String[] result = new String[100];
    private int numOfRes = 0;
    private String[] empty;
    public String[] findWhoTook(Reader[] data, LocalDate date,int numOfReaders){

        for(int i = 0;i < numOfReaders; i++){
            if (data[i].getNumOfBooks() > 0){
                result[numOfRes] = data[i].getSurname();
                numOfRes++;
                i++;
            }
        }
        if (numOfRes > 0)
        return result;
        else
            return empty;
         }
}
