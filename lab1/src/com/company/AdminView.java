package com.company;

public class AdminView {
    public static final String INPUT_LOCDATE_DATA_ = "Enter the date , when did he/she took the book\n " +
            "in format yyyy-mm-dd";
    public static final String FIRST = "1";
    public static final String SECOND = "2";
    public static final String EXIT = "exit";
    public static final String ERROR_DATA = "Wrong format of input!";
    public static final String RESULT_DATA_DATE_NO = "There aren't humans , who took book in that day!";
    public static final String RESULT_DATA_DEBT = "They should return us books:";
    public static final String RESULT_DATA_DATE = "There are humans , who took book in that day:";
    public static final String MENU = "1.Find , who took book in that date \n2.The list of the people, who " +
            "owed book \nwrite 'exit' to stop program ";


    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageFull(String message,Reader[] res,int numOfRes){
        System.out.println(message);

        for (int i = 0; i < numOfRes;i++){
            System.out.println(res[i].toString());
        }
    }

//    public void printMessageFull (String resultDataDate, String[] whoTook) {
//    }
}
