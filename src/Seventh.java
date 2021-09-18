public class Seventh {
    public int Threadnumber;
    public Seventh() {
        this.Threadnumber=1;
    }

    synchronized public void first(Runnable printFirst) throws InterruptedException {
        if(Threadnumber!=1){
            wait();
        }
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        Threadnumber++;
        notifyAll();
    }

  synchronized   public void second(Runnable printSecond) throws InterruptedException {
        if(Threadnumber!=2){
            wait();
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        Threadnumber++;
        notifyAll();
    }

   synchronized public void third(Runnable printThird) throws InterruptedException {
        if(Threadnumber!=3){
            wait();
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        Threadnumber++;
        notifyAll();
    }

}
