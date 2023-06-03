package com.example.fragtoactivity;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Fragtoactviewmodel extends ViewModel {

    private final MutableLiveData<String> selecteddata =new MutableLiveData<String>();

    public void setdata(String data){
        selecteddata.setValue(data);
    }

    public LiveData<String> getdata(){

        return selecteddata;
    }
}
