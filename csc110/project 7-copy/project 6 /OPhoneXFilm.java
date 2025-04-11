public class OPhoneXFilm extends OPhoneX {

    // Override the price calculation (25% increase from OPhoneX)
    public double getPrice() {
        return Math.round(getBasePrice() * 1.25 / 10.0) * 10; // Apply 25% increase to the base price
    }

    
    public String getVideoResolution() {
        return "4K slow motion";
    }

    // Override toString method to display OPhoneXFilm details
    @Override
    public String toString() {
        return String.format("OPhoneXFilm: Price $%.2f, Comm: %s, Camera: %s, Screen size: %s, Vid Res: %s",
                getPrice(), getComm(), getCamera(), getScreenSize(), getVideoResolution());
    }
}
