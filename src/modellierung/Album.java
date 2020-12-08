/**
 * This class stores all information needed to describe an album.
 * @author Thomas Marwitz
 * @version 1.0
 */

public class Album {
    private String title;
    private Artist interpreter;
    private Date firstPublished;
    private Label publisher;
    private int totalSongAmount;
    private Genre genre;

    public enum Genre {
        ROCK,
        POP,
        PUNK,
        HIP_HOP,
        GERMAN_POP_SONGS, // "Schlager"
        JAZZ,
        BLUES,
        CLASSICAL_MUSIC,
        REGGAE,
    }

    public Album(String title, Artist interpreter,
                 Date firstPublished, Label publisher,
                 Duration totalDuration, int totalSongAmount, Genre genre) {
        this.setTitle(title);
        this.setInterpreter(interpreter);
        this.setFirstPublished(firstPublished);
        this.setPublisher(publisher);
        this.setTotalSongAmount(totalSongAmount);
        this.setGenre(genre);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getInterpreter() {
        return interpreter;
    }

    public void setInterpreter(Artist interpreter) {
        this.interpreter = interpreter;
    }

    public Date getFirstPublished() {
        return firstPublished;
    }

    public void setFirstPublished(Date firstPublished) {
        this.firstPublished = firstPublished;
    }

    public Label getPublisher() {
        return publisher;
    }

    public void setPublisher(Label publisher) {
        this.publisher = publisher;
    }

    public int getTotalSongAmount() {
        return totalSongAmount;
    }

    public void setTotalSongAmount(int totalSongAmount) {
        this.totalSongAmount = totalSongAmount;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

}
