package com.company;

import java.time.LocalDate;

public class LookForModel {
    private static Reader[] dataBase;
    private static Reader[] resultDebt;
    private static Reader[] resultTook;

    private static int numOfRes = 0;
    private static int numOfResDebt = 0;
    private static String[] empty;
    private final static int MAX_READERS = 10;
    private final static int MAX_RES = 10;
    private static int numOfReaders = 0;

    public static void InizializeRES(){
        resultDebt = new Reader[MAX_READERS];
        resultTook = new Reader[MAX_READERS];
    }

    public static void InizializeDB(){
        dataBase = new Reader[MAX_READERS];
        new Fill();
            Fill.createReader(dataBase);
        numOfReaders = Fill.getReaders();
    }

    public static Reader[] findWhoTook(LocalDate date){
        numOfRes = 0;
        for(int i = 0;i < numOfReaders; i++){
            if (dataBase[i].getNumOfBooks() > 0){
                for (int j = 0; j < dataBase[i].getNumOfBooks();j++){
                    if (dataBase[i].getBook()[j].getDateWhenTook().equals(date)) {
                        resultTook[numOfRes] = dataBase[i];
                        numOfRes++;
                        j = dataBase[i].getNumOfBooks();
                    }
                }
            }
        }
        return resultTook;
    }

    public static Reader[] findWhoDebt(){
        numOfResDebt = 0;
        for(int i = 0;i < numOfReaders; i++){
            if (dataBase[i].getNumOfBooks() > 0){
                        for (int j = 0; j < dataBase[i].getNumOfBooks();j++){
                            if (dataBase[i].getBook()[j].getDateWhenTook().plusDays( dataBase[i].getBook()[j].getDays())
                                    .isBefore( LocalDate.now())) {
                                resultDebt[numOfResDebt] = dataBase[i];
                                numOfResDebt++;
                                j = dataBase[i].getNumOfBooks();
                            }
                }
            }
        }

        return resultDebt;
    }


    public static int getNumOfRes () {
        return numOfRes;
    }
    public static int getNumOfResDebt () {
        return numOfResDebt;
    }
    public static Reader[] getDataBase(){
        return dataBase;
    }
}
