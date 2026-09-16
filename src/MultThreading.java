public class MultThreading {
    public static void main(String[] args) {
    Counter ctr = new Counter();
    myThread  obj = new myThread(ctr);
    Thread t1 = new Thread(obj);
    Thread t2 = new Thread(obj);
    Thread t3 = new Thread(obj);
    Thread t4 = new Thread(obj);
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    try {
        t1.join();
        t2.join();
        t3.join();
        t4.join();
    } catch (InterruptedException e) {
        System.out.println(e);
    }

    System.out.println(ctr.count);
    }
}

class Counter{
    int count=0;
    // void increment(){ Random values below 4000
    synchronized void increment(){ // After Synchronization exact 40000
        count++;
    }
}

class myThread implements Runnable{
    myThread(Counter ctr){
        this.ct = ctr;
    }
    Counter ct;
    public void run(){
        for(int i=0;i<10000;i++){
            ct.increment();
        }
    }
}