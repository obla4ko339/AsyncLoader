package com.delta.asyncloader;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by GrabVN_1791 on 22.10.2017.
 */

public interface UmoriliApi {

    @GET("/mjson.php")
    Call <List<EventModel>> getData(@Query("datepost") String datepostName);

}
