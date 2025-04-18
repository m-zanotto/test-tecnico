package com.example.api.controller;

import java.util.List;

import com.example.api.entity.DataItem;

public class DataResultDTO {
    private List<DataItem> items;

    public DataResultDTO(List<DataItem> items) {
        this.items = items;
    }

    public List<DataItem> getItems() {
        return items;
    }
}