package spice.in.myapplication.maps;

/**
 * Created by ch-e01294 on 25-05-2017.
 */

public class TempValue {
//
//    private Thread t;
//    private String threadName;
//
//    public TempValue(String name) {
//        threadName = name;
//        System.out.println("Creating " +  threadName );
//    }
//
//
//
//    @Override
//    public void run() {
//        System.out.println("Running " +  threadName );
//
//        try {
//            for(int i = 4; i > 0; i--) {
//                System.out.println("Thread: " + threadName + ", " + i);
//                // Let the thread sleep for a while.
//                Thread.sleep(50);
//            }
//        }catch (InterruptedException e) {
//            System.out.println("Thread " +  threadName + " interrupted.");
//        }
//        System.out.println("Thread " +  threadName + " exiting.");
//    }
//
//    public void start () {
//        System.out.println("Starting " +  threadName );
//        if (t == null) {
//            t = new Thread (this, threadName);
//            t.start ();
//        }
//    }


    int value = 3;

    @Override
    public int hashCode() {
        return 1; // All objects of this class will have same hashcode.
    }

}
