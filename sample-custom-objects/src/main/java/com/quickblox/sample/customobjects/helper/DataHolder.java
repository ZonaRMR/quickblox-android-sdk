package com.quickblox.sample.customobjects.helper;

import com.quickblox.sample.customobjects.model.Movie;
import com.quickblox.customobjects.model.QBCustomObject;

import java.util.ArrayList;
import java.util.List;

public class DataHolder {

    private static DataHolder dataHolder;
    private List<Movie> movieList;

    public static synchronized DataHolder getDataHolder() {
        if (dataHolder == null) {
            dataHolder = new DataHolder();
        }
        return dataHolder;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public String getMovieName(int position) {
        return movieList.get(position).getName();
    }

    public String getMovieDescription(int position) {
        return movieList.get(position).getDescription();
    }

    public String getMovieDate(int position) {
        return movieList.get(position).getDate();
    }

    public String getMovieYear(int position) {
        return movieList.get(position).getYear();
    }

    public String getMovieRating(int position) {
        return movieList.get(position).getRating();
    }

    public void clear() {
        movieList.clear();
    }

    public int size() {
        if (movieList != null) {
            return movieList.size();
        }
        return 0;
    }

    public void addMovieToList(QBCustomObject customObject) {
        if (movieList == null) {
            movieList = new ArrayList<>();
        }
        movieList.add(new Movie(customObject));
    }
}