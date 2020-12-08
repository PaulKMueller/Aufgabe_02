/**
 * A useful class to store an address.
 * @author Thomas Marwitz
 * @version 1.0
 */

public class Address {
    private String streetName;
    private String cityName;
    private int postalCode;

    public Address(String streetName, String cityName, int postalCode) {
        this.setStreetName(streetName);
        this.setCityName(cityName);
        this.setPostalCode(postalCode);
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
}
