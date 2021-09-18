package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Movie {
    private int id; // id фильма
    private String title; // название фильма
    private String genres; // жанр фильма
}


