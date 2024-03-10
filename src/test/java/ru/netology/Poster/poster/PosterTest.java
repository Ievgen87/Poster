package ru.netology.Poster.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterTest {

    @Test
    public void testAdd () {
        Poster poster = new Poster();
        String films1 = "Бладшот";
        String films2 = "Вперёд";
        String films3 = "Отель Белград";

        poster.add(films1);
        poster.add(films2);
        poster.add(films3);
        String[] expected = {films1, films2, films3};
        String[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void fineLastFilms () {
        Poster poster = new Poster(4);
        String films1 = "Бладшот";
        String films2 = "Вперёд";
        String films3 = "Отель Белград";
        String films4 = "Джентельмены";
        String films5 = "Человек-невидимка";
        String films6 = "Троллию Мировой тур";
        String films7 = "Номер один";

        poster.add(films1);
        poster.add(films2);
        poster.add(films3);
        poster.add(films4);
        poster.add(films5);
        poster.add(films6);
        poster.add(films7);
        String[] expected = {films7, films6, films5, films4};
        String[] actual = poster.fineLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void fineLastFilmsLess () {
        Poster poster = new Poster();
        String films1 = "Бладшот";
        String films2 = "Вперёд";


        poster.add(films1);
        poster.add(films2);

        String[] expected = {films2, films1};
        String[] actual = poster.fineLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
