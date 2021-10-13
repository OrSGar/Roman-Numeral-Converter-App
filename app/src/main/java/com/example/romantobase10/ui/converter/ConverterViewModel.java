package com.example.romantobase10.ui.converter;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ConverterViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ConverterViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Converter");
    }

    public LiveData<String> getText() {
        return mText;
    }
}