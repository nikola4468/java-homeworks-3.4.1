package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class PosterManager {
    private Movie[] movies = new Movie[0];
    private int amount = 10;

    public PosterManager(int amount) {
        this.amount = amount;
    }

    public void add(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Movie[] recent() {
        int resultLength;
        if (movies.length <= amount) {
            resultLength = movies.length;
        } else {
            resultLength = amount;
        }
        Movie[] recent = new Movie[resultLength];
        for (int i = 0; i < recent.length; i++) {
            int index = movies.length - i - 1;
            recent[i] = movies[index];
        }
        return recent;
    }
}