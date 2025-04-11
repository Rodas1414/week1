public class OPhone9 extends OPhone {

    // Override the price calculation (20% decrease from OPhone, +1G for comm)
    public double getPrice() {
        return Math.round(getBasePrice() * 0.8 / 10.0) * 10; // Apply 20% decrease to the base price
    }

    // Override communication type (5g instead of 4g)
    public String getComm() {
        return "5g";
    }

  
    public String getScreenSize() {
        return "5.6\"";
    }

    // Override camera specs (10MP for OPhone9)
    public String getCamera() {
        return "10MP";
    }

    
    public String getVideoResolution() {
        return "1080p";
    }

    // Override toString method to display OPhone9 details
    @Override
    public String toString() {
        return String.format("OPhone9: Price $%.2f, Comm: %s, Camera: %s, Screen size: %s, Vid Res: %s",
                getPrice(), getComm(), getCamera(), getScreenSize(), getVideoResolution());
    }
}
