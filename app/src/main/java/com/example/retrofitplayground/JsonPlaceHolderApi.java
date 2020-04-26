package com.example.retrofitplayground;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JsonPlaceHolderApi {

    @GET ("posts")
    Call<List<Post>> getAllPosts();

    @GET ("posts")
    Call<List<Post>> getPosts(
            @Query("userId")Integer userId,
            @Query("_sort")String sort,
            @Query("_order")String order

            );
}
