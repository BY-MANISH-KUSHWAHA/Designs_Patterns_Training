package Singleton;

import java.util.ArrayList;
import java.util.List;

public class AircraftSynchronized {

    private static  AircraftSynchronized instance;

    public static synchronized AircraftSynchronized getInstance(){
        System.out.println("Start");
        if(instance==null){
            instance = new AircraftSynchronized();
        }
        // create Some Delay
        List<Integer> arr = new ArrayList<>();
        List<List<Integer>> listarr = new ArrayList<>();
        for (int i = 0; i < 150000000; i++) {
            arr.add(i);
            listarr.add(arr);
        }
        return instance;
    }

    public static  AircraftSynchronized getInstance_Lazy(){
        System.out.println("Start");
        if(instance==null){
            synchronized (AircraftSynchronized.class){
                instance = new AircraftSynchronized();
            }

        }
        return instance;
    }
    public void fly(){
        System.out.println("Flying some Aircraft using Synchronized");
    }
}

class Client2{
    public static void main(String[] args) {
        AircraftSynchronized obj1 = AircraftSynchronized.getInstance();
        obj1.fly();
        AircraftSynchronized obj2 = AircraftSynchronized.getInstance();
        obj2.fly();

    }
}
