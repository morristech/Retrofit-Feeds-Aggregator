package navneet.com.hackernews;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;

/**
 * Created by Sree on 27-10-2016.
 */

public interface InterfaceNews {
    @GET("v1/articles?source=engadget&sortBy=top&apiKey=apikey")
    Call<JSONResponse> getJSON();
 //   Call<JSONResponse> searchHotel(@Body InputItem item);
}
