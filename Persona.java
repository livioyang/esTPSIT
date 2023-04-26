public class Persona extends Thread {
    private String nome;
    private Sportello sportello;

    Persona(String nome,Sportello s){
        super(nome);
        this.sportello = s;
    }
   public String getNome() {
       return nome;
   }
   @Override
   public void run(){
    long tempo = (int) (Math.random() * 5000) + 1;
    sportello.richiesta_modulo();
    sportello.consegna_modulo();
    try{
        Thread.sleep(tempo);

    }catch(InterruptedException e) {
    }
    sportello.stampa();
   }

}