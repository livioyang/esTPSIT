import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Sportello s = new Sportello();
        List<Persona> codaPersone = new ArrayList<>();
        codaPersone.add(new Persona("Rossi",s));
        codaPersone.add(new Persona("Verdi",s));
        codaPersone.add(new Persona("Giallo",s));
        codaPersone.add(new Persona("Marrone",s));
        codaPersone.add(new Persona("Arancio",s));
        codaPersone.add(new Persona("Viola",s));

        for (Persona p : codaPersone) {
            p.start();
        }
    }
}
