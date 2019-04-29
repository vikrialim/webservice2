package com.example.vikri.webservice2.presenter;

import com.example.vikri.webservice2.model.get.GetResponse;

public interface MainView {
    void getSucces(GetResponse list);
    void setToast(String message);
    void onError(String errorMessage);
    void onFailure(String failureMessage);

}
