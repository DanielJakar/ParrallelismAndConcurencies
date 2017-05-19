package course.Daniel.Java;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.function.Consumer;

public class Main {

//    private static final Object LOCK = new Object() ;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //consumer
        //shutdown
        doStuff((s) -> {
            System.out.println("The result is here: ");
            System.out.println(s);
        });






    }
    public static void doStuff(Consumer<String> listener){
        ExecutorService threadPool = Executors.newFixedThreadPool(4);

        threadPool.submit(() -> {
            try {Thread.sleep(4000);}
            catch (InterruptedException ignored) {}
            //doing some work
            //call the listener
            listener.accept("this is the result");
        });
        threadPool.shutdown();
    }

    public static void doStuff (){
        System.out.println("Doing Stuff.");
    }

    //void accept (T result)
    public static void readData (String s){
        System.out.println("Read "+ s);
    }
    public static void hello (){
        System.out.println("Hello, the time is: " + LocalTime.now());
    }





//        for (int i = 0; i < 10; i++) {
//
//            threadPool.execute(() -> {
//                try {
//                    Thread.sleep(10000);
//                    threadPool.execute((Main::hello));
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            });
//
//        }

//        threadPool.shutdown();

//        SheepHerd herd = new SheepHerd();
//        ExecutorService pool = Executors.newFixedThreadPool(4);
//
//
//        ScheduledExecutorService sched = Executors.newScheduledThreadPool(1);
//        sched.scheduleAtFixedRate(Main::hello, 2, 3, TimeUnit.SECONDS);
//        pool.execute(herd::addSheepAndCount);
//
//
//        ArrayList<String> data = new ArrayList<>();
//        data.add("A");
//        data.add("B");
//        data.add("C");
//        data.add("D");
//
////        data.forEach(System.out::println);
//        //Method reference:
//        data.forEach(Main::readData);
//
//
//        ExecutorService service = Executors.newFixedThreadPool(4);
//        service.execute(Main::doStuff);
//        service.shutdown();
//


//        ExecutorService service = Executors.newSingleThreadExecutor();
//
//        service.execute(() -> System.out.println("Running the task....."));
//        System.out.println("main");
//        service.execute(() -> System.out.println("Running the task....."));
//        System.out.println("main");
//        service.execute(() -> System.out.println("Running the task....."));
//        System.out.println("main");
//        service.execute(() -> System.out.println("Running the task....."));
//        System.out.println("main");
//
//        service.shutdown();


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
