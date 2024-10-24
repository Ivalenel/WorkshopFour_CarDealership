package com.ps;

import java.io.*;

public class DealershipFileManager {

    public static void initMethod() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("inventory.csv"));
            String firstLine = bufferedReader.readLine();
            String input;
            while ((input = bufferedReader.readLine()) != null) {
                String[] inventoryArr = input.split("\\|");

//                   String dateOfArrival = transactionsArr[0];
//                    String timeOfArrival = transactionsArr[1];
//                    String description = transactionsArr[2];
//                    String vendor = transactionsArr[3];
//                    String amount = transactionsArr[4];
            }
            bufferedReader.close();
        } catch (Exception e){
        e.printStackTrace();
        }
    }
}
