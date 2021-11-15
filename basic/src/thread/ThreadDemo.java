package thread;

/**
 * 线程demo
 */
public class ThreadDemo {

    static int threadNo = 100;

    static int MAX_TURN = 5;

    public static String getCurrentThreadName(){
        return Thread.currentThread().getName();
    }

    static class SingleThreadStart extends Thread {

        public SingleThreadStart(int times){
            super("SingleThread-" + (threadNo + times));
        }

        public void run(){
            for (int i = 1; i <= MAX_TURN; i++) {
                System.out.println(getName() + "-run-times-" + i);
            }
            System.out.println(getName()+"-run-end");
        }
    }

    public static void main(String[] args){
        Thread thread = null;
        long qrId = Long.parseLong("3503294850709651629\t");
        try {
            for (int j = 1; j <= MAX_TURN; j++) {
                thread = new SingleThreadStart(j);
                thread.start();
                System.out.println("thread-name-" + thread.getName() + "-isAlive-" + thread.isAlive() + "-state-" + thread.getState());

                System.out.println(getCurrentThreadName()+"-state-"+Thread.currentThread().getState());

            }
        }catch (Exception exception){
            System.out.println(thread.getName() + exception);
        }


        System.out.println(getCurrentThreadName()+"-state-"+Thread.currentThread().getState());
    }

}
