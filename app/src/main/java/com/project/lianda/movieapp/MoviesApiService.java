package com.project.lianda.movieapp;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by lenovo on 11/05/2017.
 */

public interface MoviesApiService {
    @GET("/movie/popular")
    void getPopularMovies(Callback<Movie.MovieResult> cb);
}
