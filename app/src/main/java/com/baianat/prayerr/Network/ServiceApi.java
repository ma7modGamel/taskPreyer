package com.baianat.prayerr.Network;

import com.baianat.prayerr.model.ResponseTimePrayer;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;


public interface ServiceApi {

    @GET("v2/times/day.json")
    Call<ResponseTimePrayer> onGetAllTimes(@Query("city") String city,@Query("date") String date);
}
