class main{
    public static void main(String[] args) throws InterruptedException {
        T1 t1 = new T1("Gianni");
        T2 t2 = new T2("Mario");
        System.out.println("THREAD MAIN HA FINITO. ORA LANCIO I DUE THREAD");
        Thread.sleep(3);
        t1.start();
        t2.start();
        try {
            System.out.println(5/0);
        } catch (ArithmeticException e) {
            System.out.println("Main crashato");
        }
    }
}
