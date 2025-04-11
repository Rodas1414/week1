public class OPhone9Max extends OPhone9 {
    @Override
    public double getPrice() {
       return Math.round(getBasePrice() * 1.2 / 10.0) * 10;
    }

    @Override
    public String getScreenSize() {
        return "6.5\""; // Larger screen size
    }

    @Override
    public String toString() {
        return String.format("OPhone9Max: Price $%.2f, Comm: %s, Camera: %s, Screen size: %s, Vid Res: %s",
                getPrice(), getComm(), getCamera(), getScreenSize(), getVideoResolution());
    }
}
