package com.lore.google.sheets;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.security.GeneralSecurityException;

import org.junit.jupiter.api.Test;

public class GoogleSheetsAPIIntegrationTest {
    public static String SPREADSHEET_ID = "1Xch3fiBSodhqt7gWwde5VUw1W2m0DWED-MrJrlKw1hE";

    @Test
    public void test() throws GeneralSecurityException, IOException {
        GoogleSheetsService service = new GoogleSheetsService(GoogleSheetsUtil.getSheetsService());
        assertEquals("Hello", service.getRange(SPREADSHEET_ID, "A1").getValues().get(0).get(0));
    }
}
