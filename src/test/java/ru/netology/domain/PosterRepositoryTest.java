package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PosterRepositoryTest {

    @Test
    void shouldGetRecentMax() {
        PosterRepository manager = new PosterRepository();
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

        manager.save(movie1);
        manager.save(movie2);
        manager.save(movie3);
        manager.save(movie4);
        manager.save(movie5);
        manager.save(movie6);
        manager.save(movie7);
        manager.save(movie8);
        manager.save(movie9);
        manager.save(movie10);
        manager.save(movie11);
        manager.save(movie12);
        manager.save(movie13);
        manager.save(movie14);
        manager.save(movie15);

        Movie[] actual = manager.recent();
        Movie[] expected = new Movie[]{movie15, movie14, movie13, movie12, movie11, movie10, movie9, movie8, movie7, movie6};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetRecent() {
        PosterRepository manager = new PosterRepository(5);
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

        manager.save(movie1);
        manager.save(movie2);
        manager.save(movie3);
        manager.save(movie4);
        manager.save(movie5);
        manager.save(movie6);
        manager.save(movie7);
        manager.save(movie8);
        manager.save(movie9);
        manager.save(movie10);
        manager.save(movie11);
        manager.save(movie12);
        manager.save(movie13);
        manager.save(movie14);
        manager.save(movie15);

        Movie[] actual = manager.recent();
        Movie[] expected = new Movie[]{movie15, movie14, movie13, movie12, movie11};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetRecentMin() {
        PosterRepository manager = new PosterRepository();
        Movie movie1 = new Movie(1, "название 1", "Жанр 1");
        Movie movie2 = new Movie(2, "название 2", "Жанр 2");
        Movie movie3 = new Movie(3, "название 3", "Жанр 3");
        Movie movie4 = new Movie(4, "название 4", "Жанр 4");
        Movie movie5 = new Movie(5, "название 5", "Жанр 1");
        Movie movie6 = new Movie(6, "название 6", "Жанр 2");
        Movie movie7 = new Movie(7, "название 7", "Жанр 3");

        manager.save(movie1);
        manager.save(movie2);
        manager.save(movie3);
        manager.save(movie4);
        manager.save(movie5);
        manager.save(movie6);
        manager.save(movie7);

        Movie[] actual = manager.recent();
        Movie[] expected = new Movie[]{movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveById() {
        PosterRepository manager = new PosterRepository();
        Movie movie1 = new Movie(1, "название 1", "Жанр 1");
        Movie movie2 = new Movie(2, "название 2", "Жанр 2");
        Movie movie3 = new Movie(3, "название 3", "Жанр 3");
        Movie movie4 = new Movie(4, "название 4", "Жанр 4");
        Movie movie5 = new Movie(5, "название 5", "Жанр 1");
        Movie movie6 = new Movie(6, "название 6", "Жанр 2");
        Movie movie7 = new Movie(7, "название 7", "Жанр 3");

        manager.save(movie1);
        manager.save(movie2);
        manager.save(movie3);
        manager.save(movie4);
        manager.save(movie5);
        manager.save(movie6);
        manager.save(movie7);
        manager.removeById(1);

        Movie[] actual = manager.recent();
        Movie[] expected = new Movie[]{movie7, movie6, movie5, movie4, movie3, movie2};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindByIdMax() {
        PosterRepository manager = new PosterRepository();
        Movie movie1 = new Movie(1, "название 1", "Жанр 1");
        Movie movie2 = new Movie(2, "название 2", "Жанр 2");
        Movie movie3 = new Movie(3, "название 3", "Жанр 3");
        Movie movie4 = new Movie(4, "название 4", "Жанр 4");
        Movie movie5 = new Movie(5, "название 5", "Жанр 1");
        Movie movie6 = new Movie(6, "название 6", "Жанр 2");
        Movie movie7 = new Movie(7, "название 7", "Жанр 3");

        manager.save(movie1);
        manager.save(movie2);
        manager.save(movie3);
        manager.save(movie4);
        manager.save(movie5);
        manager.save(movie6);
        manager.save(movie7);

        Movie[] actual = manager.findById(8);
        Movie[] expected = new Movie[]{null};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindById() {
        PosterRepository manager = new PosterRepository();
        Movie movie1 = new Movie(1, "название 1", "Жанр 1");
        Movie movie2 = new Movie(2, "название 2", "Жанр 2");
        Movie movie3 = new Movie(3, "название 3", "Жанр 3");
        Movie movie4 = new Movie(4, "название 4", "Жанр 4");
        Movie movie5 = new Movie(5, "название 5", "Жанр 1");
        Movie movie6 = new Movie(6, "название 6", "Жанр 2");
        Movie movie7 = new Movie(7, "название 7", "Жанр 3");

        manager.save(movie1);
        manager.save(movie2);
        manager.save(movie3);
        manager.save(movie4);
        manager.save(movie5);
        manager.save(movie6);
        manager.save(movie7);

        Movie[] actual = manager.findById(7);
        Movie[] expected = new Movie[]{movie7};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindAll() {
        PosterRepository manager = new PosterRepository();
        Movie movie1 = new Movie(1, "название 1", "Жанр 1");
        Movie movie2 = new Movie(2, "название 2", "Жанр 2");
        Movie movie3 = new Movie(3, "название 3", "Жанр 3");
        Movie movie4 = new Movie(4, "название 4", "Жанр 4");
        Movie movie5 = new Movie(5, "название 5", "Жанр 1");
        Movie movie6 = new Movie(6, "название 6", "Жанр 2");
        Movie movie7 = new Movie(7, "название 7", "Жанр 3");

        manager.save(movie1);
        manager.save(movie2);
        manager.save(movie3);
        manager.save(movie4);
        manager.save(movie5);
        manager.save(movie6);
        manager.save(movie7);


        Movie[] actual = manager.findAll();
        Movie[] expected = new Movie[]{movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveAll() {
        PosterRepository manager = new PosterRepository();
        Movie movie1 = new Movie(1, "название 1", "Жанр 1");
        Movie movie2 = new Movie(2, "название 2", "Жанр 2");
        Movie movie3 = new Movie(3, "название 3", "Жанр 3");
        Movie movie4 = new Movie(4, "название 4", "Жанр 4");
        Movie movie5 = new Movie(5, "название 5", "Жанр 1");
        Movie movie6 = new Movie(6, "название 6", "Жанр 2");
        Movie movie7 = new Movie(7, "название 7", "Жанр 3");

        manager.save(movie1);
        manager.save(movie2);
        manager.save(movie3);
        manager.save(movie4);
        manager.save(movie5);
        manager.save(movie6);
        manager.save(movie7);

        Movie[] actual = manager.removeAll();
        Movie[] expected = new Movie[]{null, null, null, null, null, null, null};
        assertArrayEquals(expected, actual);
    }
}