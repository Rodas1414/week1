public class OPhone8Mini extends OPhone8 {
   
    public double getPrice() {
        return Math.round(getBasePrice() * 1.1 / 10.0) * 10;
    }

    @Override
    public String getScreenSize() {
        return "4.6\"";
    }

    @Override
    public String toString() {
        return String.format("OPhone8Mini: Price $%.2f, Comm: %s, Camera: %s, Screen size: %s, Vid Res: %s",
                getPrice(), getComm(), getCamera(), getScreenSize(), getVideoResolution());
    }
}
