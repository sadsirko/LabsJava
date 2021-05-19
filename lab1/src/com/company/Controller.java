package com.company;

import com.company.utilyties.Validation;

import java.time.LocalDate;

import static java.lang.String.valueOf;

public class Controller {
    private static Integer readers;
    Controller(){
        readers = 10;
    }
    public static void creation() {
        LookForModel model = new LookForModel(readers);
        Validation val = new Validation();
        String menu = null;
        model.openDB();
//        model.InitializeDB();
        menu = val.validatedInputMenu();
        while (! menu.equals(AdminView.EXIT)){
            switch (menu) {
                case AdminView.WHO_TOOK_THAT_DATE -> {
                    LocalDate dateTook = val.validatedInputDate();
                    AdminView.printMessageFull(AdminView.RESULT_DATA_DATE, model.findWhoTook(dateTook),
                            model.getNumOfRes());
                    if (val.validatedAskSave()) val.saveStr(AdminView.getLast_result());
                }
                case AdminView.WHO_OWED -> {
                    AdminView.printMessageFull(AdminView.RESULT_DATA_DEBT, model.findWhoDebt(),
                            model.getNumOfResDebt());
                    if (val.validatedAskSave()) val.saveStr(AdminView.getLast_result());

                }
                case AdminView.FULL_DB ->
                    AdminView.printMessageFull(model.getDataBase(), model.getNumOfReaders());
                case AdminView.ADD_READER ->
                    val.inputFullReader(model.getNumOfReaders(), model.getDataBase());
                case  AdminView.ADD_BOOK ->
                        val.inputFullBook(model.getDataBase());
            }
            menu = val.validatedInputMenu();
        }
        model.saveDB();
    }
}
