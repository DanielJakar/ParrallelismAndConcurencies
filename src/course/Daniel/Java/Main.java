package course.Daniel.Java;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Thread t = new Thread(() -> {

        });
        
        t.start();

        Runnable r = () -> {};
        r.run();

        Callable<String> C = () -> "Hello";

        ArrayList<String> data = new ArrayList<>();
        data.add("A");
        data.add("B");
        data.add("C");
        data.add("D");

        data.forEach(s -> System.out.println(s.toLowerCase()));

        Consumer<String> consumer = s -> {
        };


    }
}
