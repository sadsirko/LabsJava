package com.company;

import com.company.userClasses.Reader;

public class AdminView {
    public static final String INPUT_LOCDATE_DATA_ = "Enter the date , when did he/she took the book\n " +
            "in format yyyy-mm-dd";
    public static final String FIRST = "1";
    public static final String SECOND = "2";
    public static final String THIRD = "3";
    public static final String EXIT = "exit";
    public static final String ERROR_DATA = "Wrong format of input!";
    public static final String RESULT_DATA_DEBT = "They should return us books:";
    public static final String RESULT_DATA_DATE = "There are humans , who took book in that day:";
    public static final String RESULT_NULL = "There are no such readers";
    public static final String MENU = "Enter the number to manage the system \n1.Find , who took book in that date " +
            "\n2.The list of the people, who owed book \n3.Full DataBase " +
            "\nwrite 'exit' to stop program ";


    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageFull(String message, Reader[] res, int numOfRes){
        if (numOfRes > 0) {
            System.out.println(message);
            for (int i = 0; i < numOfRes; i++) {
                System.out.println(res[i].toString());
            }
        }
        else {
            System.out.println(this.RESULT_NULL);
        }

    }

    public void printFullDB(Reader[] dataBase, int readers){
        for (int i = 0; i < readers;i++){
            System.out.println(dataBase[i].toString());
        }
    }
}
