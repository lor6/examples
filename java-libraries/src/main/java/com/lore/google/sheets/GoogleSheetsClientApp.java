package com.lore.google.sheets;

import java.io.IOException;
import java.security.GeneralSecurityException;

public class GoogleSheetsClientApp {

    public static String SPREADSHEET_ID = "1Xch3fiBSodhqt7gWwde5VUw1W2m0DWED-MrJrlKw1hE";

    public static void main(String[] args) throws GeneralSecurityException, IOException {
        GoogleSheetsService service = new GoogleSheetsService(GoogleSheetsUtil.getSheetsService());
        service.getRange(SPREADSHEET_ID, "A1");
    }
}
