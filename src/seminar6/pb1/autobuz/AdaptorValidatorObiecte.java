package seminar6.pb1.autobuz;

import seminar6.pb1.metrou.ValidatorMetrou;

public class AdaptorValidatorObiecte implements ValidatorAutobuz{
    private ValidatorMetrou validatorMetrou;

    public AdaptorValidatorObiecte (ValidatorMetrou validatorMetrou){
        this.validatorMetrou=validatorMetrou;
    }
    @Override
    public void validareAbonament() {
        validatorMetrou.validareAbonament();
    }

    @Override
    public void validareBilet() {
        validatorMetrou.ValidareCalatorie();
    }
}
