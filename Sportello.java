public class Sportello {
    private boolean occupata = false;

    public boolean isOccupata() {
        return occupata;
    }
    public synchronized void consegna_modulo(){
        String name = Thread.currentThread().getName();
        try {
            while(occupata){
                wait();
            }
            System.out.println(name + " ENTRA nel Sportello...");
            occupata = true;
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public synchronized void stampa(){
        occupata = false;
        String name = Thread.currentThread().getName();
        System.out.println("Il documento del Sig. "+name+" è stato stampato");
        System.out.println(name + " ESCE dal sportello.");
        notifyAll();
    }

    public synchronized void richiesta_modulo(){
        String name = Thread.currentThread().getName();
        System.out.println("il Sig. "+name+" ha rischiesto il modulo");
    }
}
