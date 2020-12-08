/**
 * This class describes an artist by providing his name and the date when he first published something.
 * @author Thomas Marwitz
 * @version 1.0
 */

public class Artist {
    private String firstName;
    private String lastName;
    private Date publishingDateOfFirstOpus;

    public Artist(String firstName, String lastName, Date publishingDateOfFirstOpus) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPublishingDateOfFirstOpus(publishingDateOfFirstOpus);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getPublishingDateOfFirstOpus() {
        return publishingDateOfFirstOpus;
    }

    public void setPublishingDateOfFirstOpus(Date publishingDateOfFirstOpus) {
        this.publishingDateOfFirstOpus = publishingDateOfFirstOpus;
    }
}
