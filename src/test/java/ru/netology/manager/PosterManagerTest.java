package ru.netology.manager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.Movie;
import ru.netology.domain.PosterRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)

public  class PosterManagerTest {
    @Mock
    private PosterRepository repository = Mockito.mock(PosterRepository.class);
    @InjectMocks
    private PosterManager manager = new PosterManager(repository);
    private Movie movie1 = new Movie(1, "название 1", "Жанр 1");
    private Movie movie2 = new Movie(2, "название 2", "Жанр 2");
    private Movie movie3 = new Movie(3, "название 3", "Жанр 3");
    private Movie movie4 = new Movie(4, "название 4", "Жанр 4");
    private Movie movie5 = new Movie(5, "название 5", "Жанр 1");
    private Movie movie6 = new Movie(6, "название 6", "Жанр 2");
    private Movie movie7 = new Movie(7, "название 7", "Жанр 3");

    @Test
    public void shouldGetAll() {
        Movie[] returned = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        doReturn(returned).when(repository).findAll();

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        assertArrayEquals(expected, actual);

    }
//    @Test
//    void shouldGetAll() {
//        PosterManager manager = new PosterManager();
//        Movie movie1 = new Movie(1, "название 1", "Жанр 1");
//        Movie movie2 = new Movie(2, "название 2", "Жанр 2");
//        Movie movie3 = new Movie(3, "название 3", "Жанр 3");
//        Movie movie4 = new Movie(4, "название 4", "Жанр 4");
//        Movie movie5 = new Movie(5, "название 5", "Жанр 1");
//        Movie movie6 = new Movie(6, "название 6", "Жанр 2");
//        Movie movie7 = new Movie(7, "название 7", "Жанр 3");
//
//        manager.add(movie1);
//        manager.add(movie2);
//        manager.add(movie3);
//        manager.add(movie4);
//        manager.add(movie5);
//        manager.add(movie6);
//        manager.add(movie7);
//
//
//        Movie[] actual = manager.getAll();
//        Movie[] expected = new Movie[]{movie7, movie6, movie5, movie4, movie3, movie2, movie1};
//        assertArrayEquals(expected, actual);
//    }
//
    @Test
    void shouldRemoveById() {
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
        manager.removeById(1);


        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{movie7, movie6, movie5, movie4, movie3, movie2};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveByIdMax() {
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
        manager.removeById(8);


        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        assertArrayEquals(expected, actual);
    }
}