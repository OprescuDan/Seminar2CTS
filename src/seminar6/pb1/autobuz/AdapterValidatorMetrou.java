package seminar6.pb1.autobuz;

import seminar6.pb1.metrou.ValidatorMetrou;

public class AdapterValidatorMetrou extends ValidatorMetrou implements ValidatorAutobuz {
    @Override
    public void validareBilet() {
        super.ValidareCalatorie();
    }
}
