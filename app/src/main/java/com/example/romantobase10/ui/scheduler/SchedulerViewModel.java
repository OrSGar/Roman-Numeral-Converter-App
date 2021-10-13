package com.example.romantobase10.ui.scheduler;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SchedulerViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SchedulerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Scheduler");
    }

    public LiveData<String> getText() {
        return mText;
    }
}