public class Main {
    public static void main(String[] args) {
        OPhone[] phones = {
            new OPhone(),
            new OPhone8(),
            new OPhone8Mini(),
            new OPhone9(),
            new OPhone9Max(),
            new OPhoneX(),
            new OPhoneXFold(),
            new OPhoneXFilm()
        };

        for (OPhone phone : phones) {
            System.out.println(phone);
        }
    }
}
