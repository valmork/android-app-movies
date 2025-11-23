package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;

public interface ApiService {

    @GET("movie?token=S582NST-8P3434Q-NRRMRVD-HZWGV2M&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&page=2&limit=40")
    Single<MovieResponse> loadMovies();
}