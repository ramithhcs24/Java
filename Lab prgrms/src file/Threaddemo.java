class Message extends Thread
{
    String message;
    int delay;
    public Message(String message , int delay)
    {
        this.message = message;
        this.delay=delay;
    }

    public void run()
    {
        while(true)
        {
            try{
                System.out.println(message);
                Thread.sleep(delay);
            }
            catch(InterruptedException e){
                System.out.println("Thread Interrupted");
            }
        }
    }
}

public class Threaddemo
{
    public static void main(String[] args) {
        Message m1=new Message("BMS College of Engineering", 10000);
        Message m2=new Message("CSE",2000);
        m1.start();
        m2.start();
    }
}