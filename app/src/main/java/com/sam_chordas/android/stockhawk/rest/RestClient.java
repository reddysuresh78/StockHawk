package com.sam_chordas.android.stockhawk.rest;

import com.sam_chordas.android.stockhawk.service.QuoteService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {

    private static final String URL = "https://query.yahooapis.com/v1/";

    private QuoteService quoteService;

    public RestClient() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        quoteService = retrofit.create(QuoteService.class);
    }

    public QuoteService getService(){

        return quoteService;
    }
}
