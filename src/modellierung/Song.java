/**
 * This class stores all information needed to represent a song.
 * (aside the actual music file)
 * @author Thomas Marwitz
 * @version 1.0
 */
public class Song {
    private String title;
    private Duration duration;
    private Artist interpreter;
    private Artist composer;
    private Artist writer;
    private Album album;

    public Song(String title, Duration duration, Artist interpreter, Artist composer, Artist writer, Album album) {
        this.setTitle(title);
        this.setDuration(duration);
        this.setInterpreter(interpreter);
        this.setComposer(composer);
        this.setWriter(writer);
        this.setAlbum(album);
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Artist getInterpreter() {
        return interpreter;
    }

    public void setInterpreter(Artist interpreter) {
        this.interpreter = interpreter;
    }

    public Artist getComposer() {
        return composer;
    }

    public void setComposer(Artist composer) {
        this.composer = composer;
    }

    public Artist getWriter() {
        return writer;
    }

    public void setWriter(Artist writer) {
        this.writer = writer;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
