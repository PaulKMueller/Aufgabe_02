/**
 * This class contains the important data to describe a music label.
 * @author Thomas Marwitz
 * @version 1.0
 */

public class Label {
    private String labelName;
    private Address labelAddress;
    private Date dateOfFoundation;

    public Label(String labelName, Address labelAddress, Date dateOfFoundation) {
        this.setLabelName(labelName);
        this.setLabelAddress(labelAddress);
        this.setDateOfFoundation(dateOfFoundation);
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public Address getLabelAddress() {
        return labelAddress;
    }

    public void setLabelAddress(Address labelAddress) {
        this.labelAddress = labelAddress;
    }

    public Date getDateOfFoundation() {
        return dateOfFoundation;
    }

    public void setDateOfFoundation(Date dateOfFoundation) {
        this.dateOfFoundation = dateOfFoundation;
    }
}
