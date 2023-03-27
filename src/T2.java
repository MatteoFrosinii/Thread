public class T2 extends Thread{
    protected String nome;

    public T2(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {

        for (int i = 0; i <= 5; i++) {
            System.out.println("Stampa Thread T2 " + nome + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}
