package ru.netology.stats;

public class FilmManager {
    private String[] films = new String[0];
    private int limit;

    public FilmManager() {
        this.limit = 5;
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        this.films = tmp;
    }

    public String[] findAll() {
        int sizeMassive;
        if (films.length < limit) {
            sizeMassive = films.length;
        } else {
            sizeMassive = limit;
        }
        String[] tmp = new String[sizeMassive];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[i];
        }

        return tmp;
    }

    public String[] findLast() {
        int sizeMassive;
        if (films.length < limit) {
            sizeMassive = films.length;
        } else {
            sizeMassive = limit;
        }
        String[] tmp = new String[sizeMassive];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
