public class OPhoneX extends OPhone {

    // Override the price calculation (10% increase from OPhone)
    public double getPrice() {
        return Math.round(getBasePrice() * 1.1 / 10.0) * 10; // Apply 10% increase to the base price
    }

    // Override communication type (5g instead of 4g)
    public String getComm() {
        return "5g";
    }

    // Override screen size (6.7 inches for OPhoneX)
    public String getScreenSize() {
        return "6.7\"";
    }

    // Override camera specs (12MP for OPhoneX)
    public String getCamera() {
        return "12MP";
    }

    // Override video resolution (1080p for OPhoneX)
    public String getVideoResolution() {
        return "1080p";
    }

    // Override toString method to display OPhoneX details
    @Override
    public String toString() {
        return String.format("OPhoneX: Price $%.2f, Comm: %s, Camera: %s, Screen size: %s, Vid Res: %s",
                getPrice(), getComm(), getCamera(), getScreenSize(), getVideoResolution());
    }
}
