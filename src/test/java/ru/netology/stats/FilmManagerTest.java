package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FilmManagerTest {
    @Test
    public void AddInAutoLimit() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Taxi 1");
        manager.addFilm("Taxi 2");
        manager.addFilm("Taxi 3");
        manager.addFilm("Taxi 4");
        manager.addFilm("Taxi 5");


        String[] expected = {"Taxi 1", "Taxi 2", "Taxi 3", "Taxi 4", "Taxi 5"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddInAutoAboweLimit() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Taxi 1");
        manager.addFilm("Taxi 2");
        manager.addFilm("Taxi 3");
        manager.addFilm("Taxi 4");
        manager.addFilm("Taxi 5");
        manager.addFilm("Taxi 6");


        String[] expected = {"Taxi 1", "Taxi 2", "Taxi 3", "Taxi 4", "Taxi 5", "Taxi 6"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddInAutoBeloweLimit() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Taxi 1");
        manager.addFilm("Taxi 2");
        manager.addFilm("Taxi 3");
        manager.addFilm("Taxi 4");

        String[] expected = {"Taxi 1", "Taxi 2", "Taxi 3", "Taxi 4"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddInManualLimit() {
        FilmManager manager = new FilmManager(5);
        manager.addFilm("Taxi 1");
        manager.addFilm("Taxi 2");
        manager.addFilm("Taxi 3");
        manager.addFilm("Taxi 4");
        manager.addFilm("Taxi 5");

        String[] expected = {"Taxi 1", "Taxi 2", "Taxi 3", "Taxi 4", "Taxi 5"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddInManualAboweLimit() {
        FilmManager manager = new FilmManager(5);
        manager.addFilm("Taxi 1");
        manager.addFilm("Taxi 2");
        manager.addFilm("Taxi 3");
        manager.addFilm("Taxi 4");
        manager.addFilm("Taxi 5");
        manager.addFilm("Taxi 6");


        String[] expected = {"Taxi 1", "Taxi 2", "Taxi 3", "Taxi 4", "Taxi 5", "Taxi 6"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddInManualBeloweLimit() {
        FilmManager manager = new FilmManager(5);
        manager.addFilm("Taxi 1");
        manager.addFilm("Taxi 2");
        manager.addFilm("Taxi 3");
        manager.addFilm("Taxi 4");


        String[] expected = {"Taxi 1", "Taxi 2", "Taxi 3", "Taxi 4",};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ManualLimit() {
        FilmManager manager = new FilmManager(6);
        manager.addFilm("Taxi 1");
        manager.addFilm("Taxi 2");
        manager.addFilm("Taxi 3");
        manager.addFilm("Taxi 4");
        manager.addFilm("Taxi 5");
        manager.addFilm("Taxi 6");


        String[] expected = {"Taxi 6", "Taxi 5", "Taxi 4", "Taxi 3", "Taxi 2", "Taxi 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void AboweManualLimit() {
        FilmManager manager = new FilmManager(6);
        manager.addFilm("Taxi 1");
        manager.addFilm("Taxi 2");
        manager.addFilm("Taxi 3");
        manager.addFilm("Taxi 4");
        manager.addFilm("Taxi 5");
        manager.addFilm("Taxi 6");
        manager.addFilm("Taxi 7");

        String[] expected = {"Taxi 7", "Taxi 6", "Taxi 5", "Taxi 4", "Taxi 3", "Taxi 2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void BeloweManualLimit() {
        FilmManager manager = new FilmManager(6);
        manager.addFilm("Taxi 1");
        manager.addFilm("Taxi 2");
        manager.addFilm("Taxi 3");
        manager.addFilm("Taxi 4");
        manager.addFilm("Taxi 5");


        String[] expected = {"Taxi 5", "Taxi 4", "Taxi 3", "Taxi 2", "Taxi 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void AutoLimit() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Taxi 1");
        manager.addFilm("Taxi 2");
        manager.addFilm("Taxi 3");
        manager.addFilm("Taxi 4");
        manager.addFilm("Taxi 5");


        String[] expected = {"Taxi 5", "Taxi 4", "Taxi 3", "Taxi 2", "Taxi 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AboweAutoLimit() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Taxi 1");
        manager.addFilm("Taxi 2");
        manager.addFilm("Taxi 3");
        manager.addFilm("Taxi 4");
        manager.addFilm("Taxi 5");
        manager.addFilm("Taxi 6");


        String[] expected = {"Taxi 6", "Taxi 5", "Taxi 4", "Taxi 3", "Taxi 2",};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void BeloweAutolLimit() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Taxi 1");
        manager.addFilm("Taxi 2");
        manager.addFilm("Taxi 3");
        manager.addFilm("Taxi 4");

        String[] expected = {"Taxi 4", "Taxi 3", "Taxi 2", "Taxi 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}
