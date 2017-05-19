package course.Daniel.Java;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public class Main {

//    private static final Object LOCK = new Object() ;

    public static void main(String[] args) {

        ExecutorService service = Executors.newSingleThreadExecutor();

        service.execute(() -> System.out.println("Running the task....."));
        System.out.println("main");
        service.execute(() -> System.out.println("Running the task....."));
        System.out.println("main");
        service.execute(() -> System.out.println("Running the task....."));
        System.out.println("main");
        service.execute(() -> System.out.println("Running the task....."));
        System.out.println("main");

        service.shutdown();
    }

//        SheepHerd herd = new SheepHerd();
//
//        for (int i = 0; i < 10; i++) {
//            new Thread(() -> herd.addSheepAndCount(), String.valueOf(i)).start();
//
//        }
//
//    }
//
//    public static void doSomeWork () throws InterruptedException {
//        System.out.println(Thread.currentThread().getName());
//        Thread.sleep(1000);
//
//        //Thread safe.
//        synchronized (LOCK){
//            //atomic unit of execution
//            //increment your counter safely
//            System.out.println(Thread.currentThread().getName() + " Is Alone Here");
//
//        }
//
//        Thread.sleep(1000);
//        System.out.println(Thread.currentThread().getName());
//
//    }
//
//


//        // favour encapsulation over inheritance
//        Thread t = new Thread(() -> {
//            while (true){
//                System.out.println("Hello"); //do a mission
//                //will make the 2nd Thread sleep.
//                try {
//                    Thread.sleep(5000); // don't use the cpu
//                } catch (InterruptedException e) {
//                    //get rid of any resources and make the thread stop.
//                    //clean up
//                    e.printStackTrace();
//                }
//            }
//
//        });
//
//        t.start();
//
//        //t.interrupt();




}
