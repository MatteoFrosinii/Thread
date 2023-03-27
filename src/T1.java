public class T1  extends Thread{
    protected String nome;

    public T1(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {

        for (int i = 5; i >= 0; i--) {
            System.out.println("Stampa Thread T1 " + nome + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}
