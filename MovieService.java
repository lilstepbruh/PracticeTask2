package ru.mirea.dyachenko.movies;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface MovieService {
    @GET("movies.json")
    Call<List<MovieStructure>> getMovies();
}