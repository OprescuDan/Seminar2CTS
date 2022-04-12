package seminar6.pb1;

import seminar6.pb1.autobuz.AdaptorValidatorObiecte;
import seminar6.pb1.autobuz.Autobuz;
import seminar6.pb1.metrou.ValidatorMetrou;

public class main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz();
        ValidatorMetrou metrou=new ValidatorMetrou();

        AdaptorValidatorObiecte adaptorValidatorObiecte=new AdaptorValidatorObiecte(metrou);
    }
}
