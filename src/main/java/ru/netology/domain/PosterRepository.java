package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class PosterRepository {
    private Movie[] movies = new Movie[0];

    private int amount = 10;

    public PosterRepository(int amount) {
        this.amount = amount;
    }

    public Movie[] findAll() { //возвращает массив всех хранящихся в массиве объектов
        return movies;
    }

    public void save(Movie movie) { //добавляет объект в массив
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Movie[] findById(int id) { // возвращает объект по идентификатору (либо null, если такого объекта нет)
        Movie[] tmp = new Movie[1];
        if (id <= movies.length) {
            tmp[0] = movies[id - 1];
        } else tmp[0] = null;
        return tmp;
    }

    public void removeById(int id) { // removeById - удаляет объект по идентификатору (если объекта нет, то пусть будет исключение, как на лекции)
        if (id <= movies.length) {
            int length = movies.length - 1;
            Movie[] tmp = new Movie[length];
            int index = 0;
            for (Movie item : movies) {
                if (item.getId() != id) {
                    tmp[index] = item;
                    index++;
                }
            }
            movies = tmp;
        } else return;
    }

    public Movie[] removeAll() { // полностью вычищает репозиторий
        Movie[] tmp = new Movie[movies.length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = null;
        }
        movies = tmp;
        return movies;
    }

    public Movie[] recent() { // выдает последние добавленные фильмы
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