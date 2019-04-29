package com.example.vikri.webservice2.presenter;

public interface MainInterface {
    void getAllItems();
    void updateItems(String id, String name, String description);
    void deleteItems(String id);
    void createItems(String name, String description);


}

