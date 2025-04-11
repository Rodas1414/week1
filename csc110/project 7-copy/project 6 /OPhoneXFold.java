public class OPhoneXFold extends OPhoneX {

    // Override the price calculation (15% increase from OPhoneX)
    public double getPrice() {
        return Math.round(getBasePrice() * 1.15 / 10.0) * 10; // Apply 15% increase to the base price
    }

    // Override screen size (7.5 inches for OPhoneXFold)
    public String getScreenSize() {
        return "7.5\"";
    }

    // Override video resolution (still 1080p for OPhoneXFold)
    public String getVideoResolution() {
        return "";
    }

    // Override toString method to display OPhoneXFold details
    @Override
    public String toString() {
        return String.format("OPhoneXFold: Price $%.2f, Comm: %s, Camera: %s, Screen size: %s, Vid Res: %s",
                getPrice(), getComm(), getCamera(), getScreenSize(), getVideoResolution());
    }
}
