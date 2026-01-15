package org.example.referencebook.threads;

public class CurrentTrheadDemo {

    public static void main(String[] args) {
        /**
         * currentThread() : acessa a thread atual para posteriormente ser controlada pelo programado
         */
        Thread t = Thread.currentThread();

        System.out.println("ID : "+t.getId());
        System.out.println("NAME : "+t.getName());
        System.out.println("STATE : "+t.getState());
        System.out.println("PRIORITY : "+t.getPriority());
        System.out.println(t.getContextClassLoader());
        System.out.println(t.getStackTrace());
        System.out.println(t.getThreadGroup());

        for (int i = 0; i < 5; i++){
            try {
                Thread.sleep(2000);
                teste(t, i);
            }catch (InterruptedException ie){
                System.err.println(ie.getMessage());
            }
        }
    }


    private static void teste(Thread t, int i){

        t.setName("Principal");
        System.out.println("After set name "+i);
        System.out.println(t.getName());
    }
}
