

public abstract class FamousSwissAthelte {
    private String country = "Switzerland";
    protected String city;

    // add a contructor to set the country attribute
    protected FamousSwissAthelte(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }
}
