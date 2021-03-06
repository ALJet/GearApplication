package gear.yc.com.gearapplication.network.service;

import gear.yc.com.gearapplication.pojo.ResponseJson;
import gear.yc.com.gearapplication.pojo.User;
import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * GearApplication
 * Created by YichenZ on 2016/4/13 14:37.
 */
@com.gear.apifinder.annotation.APIService
public interface ApiService {
    @GET("src/app/{path}")
    Flowable<ResponseJson<User>> getUser(@Path("path") String path);

//    @POST("src/app/demo.php")
//    Call<ResponseJson<User>> getUser();

    @POST("src/app/demo.php")
    Flowable<ResponseJson<User>> getUser();
}
