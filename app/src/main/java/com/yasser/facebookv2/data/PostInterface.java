package com.yasser.facebookv2.data;

import com.yasser.facebookv2.pojo.PostModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface PostInterface {

    @GET("posts")
    public Observable<List<PostModel>> getPosts();
}
