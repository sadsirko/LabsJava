package com.company;

import com.company.Reader;

import static java.lang.Integer.parseInt;

public class Fill {
    public static int readers = 0;
    public static void createReader (Reader[] dataBase) {
        fillAndCreate(readers, dataBase, "Mishka", "Yaponchick", "Odessa Main Prison");
        dataBase[readers - 1].setBooks("The Count of Monte Cristo", "2016-08-16", 10);
        dataBase[readers - 1].setBooks("Boratino", "2019-08-16", 1000);
        dataBase[readers - 1].setBooks("Star Wars", "2000-08-16", 100);
        fillAndCreate(readers, dataBase, "Vladimir", "Zelen", "Bankova street");
        dataBase[readers - 1].setBooks("The world Economy", "2019-08-16", 5000);

        fillAndCreate(readers, dataBase, "Mark", "Zuckerberg", "London, Yelizaveta street");
        dataBase[readers - 1].setBooks("The world Economy", "2019-08-16", 50);

        fillAndCreate(readers, dataBase, "Viktor", "Yanukovich", "Rostov, Podval under the Station");
        dataBase[readers - 1].setBooks("History 7-th class", "2013-12-13", 50);
//
//        System.out.println(dataBase[0].toString());
//        System.out.println(dataBase[1].toString());
//        System.out.println(dataBase[2].toString());
    }

    public static void fillAndCreate (int numOfReader, Reader[] arrR, String name, String surname,
                                      String address) {
        arrR[numOfReader] = new Reader(surname,name,address);
        readers++;
    }

    public static int getReaders(){
        return readers;
    }
}
