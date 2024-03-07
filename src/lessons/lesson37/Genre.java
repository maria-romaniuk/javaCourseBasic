package lessons.lesson37;

import java.util.Objects;

public class Genre <T>{
    private T genre;

    public Genre(T genre) {
        this.genre = genre;
    }

    public T getGenre() {
        return genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Genre<?> genre1)) return false;
        return Objects.equals(genre, genre1.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genre);
    }

    @Override
    public String toString() {
        return "Genre{" +
                "genre=" + genre +
                '}';
    }
}
