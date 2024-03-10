package ru.netology.Poster.poster;
public class Poster {
    private String[] films = new String[0];
    private int limit;

    public Poster(){
        this.limit = 5;
    }
    public Poster(int newLimit){
        this.limit = newLimit;
    }

    public void add(String newFilms){
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = newFilms;
        films = tmp;
    }
    public String[] findAll(){
        return films;
    }
    public String[] fineLast(){
        int resultLength;
        if (limit < films.length) {
            resultLength = limit;
        } else {
            resultLength = films.length;
        }
        String [] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = films[films.length - 1 -i];
        }
        return result;
    }

}
