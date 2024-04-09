package com.example.optionalOrElseThrow;

public class DataService {
    DataProvider dataProvider = new DataProvider();

    String getUsername(int id) {
        return dataProvider.getUsername(id).orElseThrow();
    }
}
