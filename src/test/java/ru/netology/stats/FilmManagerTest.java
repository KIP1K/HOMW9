package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    @Test
    public void test() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Taxi 1");

        String[] expected = { "Taxi 1" };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
