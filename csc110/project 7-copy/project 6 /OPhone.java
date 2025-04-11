public class OPhone {
    private static final double BASE_PRICE = 790.0; // Base price for OPhone

    private static final String BASE_COMM = "4g";
    private static final String BASE_CAM = "8MP";
    private static final String BASE_VID_RES = "";
    private static final String BASE_SCREEN = "";

    // Getter for the base price
    public double getBasePrice() {
        return BASE_PRICE;
    }

    // Getter for communication type
    public String getComm() {
        return BASE_COMM;
    }

    // Getter for camera specs
    public String getCamera() {
        return BASE_CAM;
    }

    // Getter for video resolution
    public String getVideoResolution() {
        return BASE_VID_RES;
    }

    // Getter for screen size
    public String getScreenSize() {
        return BASE_SCREEN;
    }

    // Override toString method to display phone details
    @Override
    public String toString() {
        return String.format("OPhone: Price $%.2f, Comm: %s, Camera: %s, Screen size: %s, Vid Res: %s",
                getBasePrice(), getComm(), getCamera(), getScreenSize(), getVideoResolution());
    }
}
