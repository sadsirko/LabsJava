package com.company.utilyties;

import com.company.AdminView;
import com.company.userClasses.Readers;

import java.io.IOException;
import java.io.Reader;
import java.time.LocalDate;
import static com.company.utilyties.InputUtil.*;

public class Validation {

    public String validatedInputMenu() {
        AdminView view = new AdminView();
        String info = "0";
        try {
            info = inputMenu();
        } catch (LibraryException e) {
            view.printMessage(view.ERROR_DATA);
            //e.printStackTrace();
        }
        return info;
    }

    public LocalDate validatedInputDate() {
        LocalDate res = LocalDate.parse("2000-01-01");
        try {
            res = inputDate();
            if(res.compareTo(LocalDate.now()) > 0)
                throw new LibraryException(AdminView.ERROR_DATA_FUTURE);
        }
        catch (LibraryException e) {
            e.printStackTrace();
            res = validatedInputDate();
        }
        catch (Exception e) {
            AdminView.printMessage(AdminView.ERROR_DATE);
            res = validatedInputDate();
        }
        return res;
    }

    public boolean validatedAskSave() {
        boolean res;
        try {
            res = InputUtil.ifSave();
        } catch (LibraryException e) {
            e.printStackTrace();
            res = validatedAskSave();
        }
        catch (Exception e){
            e.printStackTrace();
            res = validatedAskSave();
        }
        return res;
    }

    public void saveStr(String res){

        try {
            Streams.saveResult(res);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public String inputReaderStr(String info){
        String reader = "";
        AdminView.printMessage(info);
        try {
            reader = InputUtil.input();
        }
        catch (Exception e){
            e.printStackTrace();
            inputReaderStr(info);
        }

        return reader;
    }

    public Integer inputReaderInt(String info){
        Integer reader = null;
        AdminView.printMessage(info);
        try {
            reader = Integer.parseInt(InputUtil.input());
        }
        catch (Exception e){
            e.printStackTrace();
            inputReaderInt(info);
        }
        return reader;
    }

    public void inputFullReader(Integer numOfReaders, Readers[] database){
        String name = inputReaderStr(AdminView.ENTER_NAME);
        String surname = inputReaderStr(AdminView.ENTER_SURNAME);
        String address = inputReaderStr(AdminView.ENTER_ADDRESS);

        DataBaseFill.fillAndCreate(numOfReaders, database, name,surname,address,AdminView.COUNT_BOOKS);

    }

    public void inputFullBook(Readers[] database){
        Integer numOfReader = inputReaderInt(AdminView.ENTER_NUM_OF_READER);
        String bookTitle = inputReaderStr(AdminView.ENTER_TITLE);
        String dateTook = inputDate().toString();
        Integer daysOfUse = inputReaderInt(AdminView.ENTER_DAYS);
        try{
            database[numOfReader].setBooks(bookTitle, dateTook,daysOfUse);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}