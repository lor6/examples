package com.lore.google.sheets;

import java.io.IOException;

import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;

public class GoogleSheetsService {
    private Sheets sheetsService;

    public GoogleSheetsService(Sheets sheetsService) {
        this.sheetsService = sheetsService;
    }

    public ValueRange getRange(String sheetId, String range) throws IOException {
        ValueRange readResult = sheetsService.spreadsheets().values().get(sheetId, range)
                .execute();
        
        readResult.getValues().forEach( v-> System.out.println(v.get(0)));
        
        return readResult;

    }

}
