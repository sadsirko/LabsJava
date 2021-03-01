package com.company.utilyties;

import com.company.AdminView;

import java.time.LocalDate;
import java.util.Scanner;

public class InputUtil {

    private static Scanner sc = new Scanner(System.in);
    public static LocalDate inputDate(AdminView view){
        LocalDate res = LocalDate.parse("2000-01-01");
        view.printMessage(view.INPUT_LOCDATE_DATA_);
        try {
            res = LocalDate.parse(sc.nextLine());
        }
        catch (Throwable e){
            view.printMessage(view.ERROR_DATA);
            return inputDate(view);
        }
        return res;
    }

    public static String inputMenu(AdminView view){

            view.printMessage(view.MENU);
            String str = sc.nextLine();
            boolean a = str.equals(view.FIRST) || str.equals(view.SECOND) || str.equals(view.EXIT)
                    || str.equals(view.THIRD);
            while ( !a ){
                view.printMessage(view.ERROR_DATA);
                return inputMenu(view);
            }
            return str;
    }
}
