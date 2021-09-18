package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PosterManagerTest {
    @Test
    void shouldGetRecentMax() {
        PosterManager manager = new PosterManager();
        Movie movie1 = new Movie(1, "название 1", "Жанр 1");
        Movie movie2 = new Movie(2, "название 2", "Жанр 2");
        Movie movie3 = new Movie(3, "название 3", "Жанр 3");
        Movie movie4 = new Movie(4, "название 4", "Жанр 4");
        Movie movie5 = new Movie(5, "название 5", "Жанр 1");
        Movie movie6 = new Movie(6, "название 6", "Жанр 2");
        Movie movie7 = new Movie(7, "название 7", "Жанр 3");
        Movie movie8 = new Movie(8, "название 8", "Жанр 4");
        Movie movie9 = new Movie(9, "название 9", "Жанр 1");
        Movie movie10 = new Movie(10, "название 10", "Жанр 2");
        Movie movie11 = new Movie(11, "название 11", "Жанр 3");
        Movie movie12 = new Movie(12, "название 12", "Жанр 4");
        Movie movie13 = new Movie(13, "название 13", "Жанр 1");
        Movie movie14 = new Movie(14, "название 14", "Жанр 2");
        Movie movie15 = new Movie(15, "название 15", "Жанр 3");

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);
        manager.add(movie12);
        manager.add(movie13);
        manager.add(movie14);
        manager.add(movie15);


        Movie[] actual = manager.recent();
        Movie[] expected = new Movie[]{movie15, movie14, movie13, movie12, movie11, movie10, movie9, movie8, movie7, movie6};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetRecent() {
        PosterManager manager = new PosterManager(5);
        Movie movie1 = new Movie(1, "название 1", "Жанр 1");
        Movie movie2 = new Movie(2, "название 2", "Жанр 2");
        Movie movie3 = new Movie(3, "название 3", "Жанр 3");
        Movie movie4 = new Movie(4, "название 4", "Жанр 4");
        Movie movie5 = new Movie(5, "название 5", "Жанр 1");
        Movie movie6 = new Movie(6, "название 6", "Жанр 2");
        Movie movie7 = new Movie(7, "название 7", "Жанр 3");
        Movie movie8 = new Movie(8, "название 8", "Жанр 4");
        Movie movie9 = new Movie(9, "название 9", "Жанр 1");
        Movie movie10 = new Movie(10, "название 10", "Жанр 2");
        Movie movie11 = new Movie(11, "название 11", "Жанр 3");
        Movie movie12 = new Movie(12, "название 12", "Жанр 4");
        Movie movie13 = new Movie(13, "название 13", "Жанр 1");
        Movie movie14 = new Movie(14, "название 14", "Жанр 2");
        Movie movie15 = new Movie(15, "название 15", "Жанр 3");

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);
        manager.add(movie12);
        manager.add(movie13);
        manager.add(movie14);
        manager.add(movie15);


        Movie[] actual = manager.recent();
        Movie[] expected = new Movie[]{movie15, movie14, movie13, movie12, movie11};
        assertArrayEquals(expected, actual);
    }


    @Test
    void shouldGetRecentMin() {
        PosterManager manager = new PosterManager();
        Movie movie1 = new Movie(1, "название 1", "Жанр 1");
        Movie movie2 = new Movie(2, "название 2", "Жанр 2");
        Movie movie3 = new Movie(3, "название 3", "Жанр 3");
        Movie movie4 = new Movie(4, "название 4", "Жанр 4");
        Movie movie5 = new Movie(5, "название 5", "Жанр 1");
        Movie movie6 = new Movie(6, "название 6", "Жанр 2");
        Movie movie7 = new Movie(7, "название 7", "Жанр 3");

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);


        Movie[] actual = manager.recent();
        Movie[] expected = new Movie[]{movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        assertArrayEquals(expected, actual);
    }
}