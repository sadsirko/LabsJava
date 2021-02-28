package com.company;

import java.time.LocalDate;

import static java.lang.String.valueOf;

public class Controller {
    public static void creation() {
        AdminView view = new AdminView();
        new LookForModel();
        LookForModel.InizializeDB();
        LookForModel.InizializeRES();
        String menu = null;
        menu = InputUtil.inputMenu(view);
        while (! menu.equals(view.EXIT)){
            switch (menu){
                case "1":
                    LocalDate dateTook = InputUtil.inputDate(view);
                    view.printMessageFull(view.RESULT_DATA_DATE, LookForModel.findWhoTook(dateTook),
                            LookForModel.getNumOfRes());
                    break;
                case "2":
                    view.printMessageFull(view.RESULT_DATA_DEBT,LookForModel.findWhoDebt(),
                            LookForModel.getNumOfResDebt());
                    break;
            }
            menu = InputUtil.inputMenu(view);
        }
    }
}
