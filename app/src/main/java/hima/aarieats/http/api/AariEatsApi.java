package hima.aarieats.http.api;

import hima.aarieats.http.models.LoginRequest;
import hima.aarieats.http.models.LoginResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface AariEatsApi {

    @POST("/login")
    Call<LoginResponse> login(@Body LoginRequest loginRequest);
}
