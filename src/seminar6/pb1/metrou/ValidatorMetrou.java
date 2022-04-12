package seminar6.pb1.metrou;

public class ValidatorMetrou implements ValidatorSubteran {
    @Override
    public void ValidareCalatorie() {
        System.out.println("validat bilet metrou");
    }

    @Override
    public void validareAbonament() {
        System.out.println("Validat abonament metrou");
    }
}
