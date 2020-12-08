/**
 * This class stores the duration of a Song for example with to integer values representing minutes and seconds.
 * @author Thomas Marwitz
 * @version 1.0
 */

public class Duration {
    private int lengthMinutes;
    private int lengthSeconds;

    public Duration(int lengthMinutes, int lengthSeconds) {
        this.setLengthMinutes(lengthMinutes);
        this.setLengthSeconds(lengthSeconds);
    }

    public int getLengthMinutes() {
        return lengthMinutes;
    }

    public void setLengthMinutes(int lengthMinutes) {
        this.lengthMinutes = lengthMinutes;
    }

    public int getLengthSeconds() {
        return lengthSeconds;
    }

    public void setLengthSeconds(int lengthSeconds) {
        this.lengthSeconds = lengthSeconds;
    }
}
