package course.Daniel.Java;

/**
 * Created by Jakars on 19/05/2017.
 */
public class SheepHerd {
    private int sheepCounter = 0;
    
    public synchronized void addSheepAndCount (){
        System.out.print(++sheepCounter + " Thread: ");
        System.out.println(Thread.currentThread().getName());

    }
    public synchronized void doSomeOtherStuff (){
        System.out.print(" Thread: " + Thread.currentThread().getName());
        System.out.println("Doing other stuff.");

    }

}
