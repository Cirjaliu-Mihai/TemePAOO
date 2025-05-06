import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            EcuatieGr1 ec1 = new EcuatieGr1(2, -4);
            ec1.salveazaInFisier("ecuatia1.json");

            EcuatieGr1 ec2 = new EcuatieGr1(0, 5);
            ec2.salveazaInFisier("ecuatia2.json");

            EcuatieGr1 ec3 = new EcuatieGr1(0, 0);
            ec3.salveazaInFisier("ecuatia3.json");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
