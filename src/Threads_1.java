public class Threads_1 {
  
  public static void main(String[] args) {    
    // Thread atual        
    Thread t = Thread.currentThread();
    System.out.println(t.getName()); //obter nome Thread

    
        
    //-------------------------------------------------
    System.out.println("-------------------------------");



    MeuRunnable meuRunnable = new MeuRunnable();
    
    // Nova thread
    Thread t1 = new Thread(meuRunnable);    

    Thread t2 = new Thread(meuRunnable);    

    // Runnable como lambda
    Thread t3 = new Thread(() -> System.out.println(Thread.currentThread().getName()));    

    // Várias threads
    Thread t4 = new Thread(meuRunnable);

    t1.start(); // apenas executando na mesma thread
    t2.start(); // cria e executa em uma nova thread de fato!
    t3.start();
    t4.start();
  }

}