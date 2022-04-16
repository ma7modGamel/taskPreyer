package com.baianat.prayerr;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.baianat.prayerr.Network.RetroWeb;
import com.baianat.prayerr.Network.ServiceApi;
import com.baianat.prayerr.model.ResponseTimePrayer;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainViewModel extends ViewModel {


    MutableLiveData<ResponseTimePrayer> datesMutableLiveData=new MutableLiveData<>();
    public void OnGetTimes(String date){

        RetroWeb.getClient().create(ServiceApi.class).onGetAllTimes("cairo",date).enqueue(new Callback<ResponseTimePrayer>() {
            @Override
            public void onResponse(Call<ResponseTimePrayer> call, Response<ResponseTimePrayer> response) {
                ResponseTimePrayer model = response.body();
                if (model != null) {
                    datesMutableLiveData.setValue(model);
                }
            }

            @Override
            public void onFailure(Call<ResponseTimePrayer> call, Throwable t) {
                Log.e("CC", t.getMessage());
            }
        });
    }

}
