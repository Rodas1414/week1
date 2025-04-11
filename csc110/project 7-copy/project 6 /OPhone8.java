public class OPhone8 extends OPhone {
   
    public double getPrice() {
       return Math.round(getBasePrice()* 0.6 / 10.0) * 10;
    }

    @Override
    public String getScreenSize() {
        return "5.5\"";
    }

    @Override
    public String getVideoResolution() {
        return "720p";
    }

    @Override
    public String toString() {
        return String.format("OPhone8: Price $%.2f, Comm: %s, Camera: %s, Screen size: %s, Vid Res: %s",
                getPrice(), getComm(), getCamera(), getScreenSize(), getVideoResolution());
    }
}
