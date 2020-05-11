package com.lesnyg.mvvmexam1;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SeekbarViewModel extends ViewModel {
    public MutableLiveData<Integer> progress = new MutableLiveData<>();
}
