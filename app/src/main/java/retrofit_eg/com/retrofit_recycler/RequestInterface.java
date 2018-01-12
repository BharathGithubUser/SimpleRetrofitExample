package retrofit_eg.com.retrofit_recycler;

/**
 * Created by user on 14/11/17.
 */

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {

    @GET("android/jsonandroid")
    Call<JSONResponse> getJSON();
}