package seminar6.pb1.autobuz;

public class Autobuz implements ValidatorAutobuz
{
    @Override
    public void validareAbonament() {
        System.out.println("validat abonament autobuz");
    }

    @Override
    public void validareBilet() {
        System.out.println("validat bilet autobuz");
    }
}
