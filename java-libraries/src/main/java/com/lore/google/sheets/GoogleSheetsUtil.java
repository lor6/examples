package com.lore.google.sheets;

import java.io.IOException;
import java.security.GeneralSecurityException;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.sheets.v4.Sheets;

public class GoogleSheetsUtil {
    public static Sheets getSheetsService() throws GeneralSecurityException, IOException {
        Sheets sheets = new Sheets.Builder(GoogleNetHttpTransport.newTrustedTransport(),
                JacksonFactory.getDefaultInstance(), GoogleSheetsCredential.getCredential()).setApplicationName("Google Sheets Client").build();
       return sheets;
    }

}
