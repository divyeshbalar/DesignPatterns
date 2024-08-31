package org.balar.javaDesignPatterns;

import org.balar.javaDesignPatterns.observerPattern.observables.WeatherStation;
import org.balar.javaDesignPatterns.observerPattern.observers.Observer1;
import org.balar.javaDesignPatterns.observerPattern.observers.Observer2;

public class Main {
    public static void main(String[] args) {

        //#################--- // Creational Pattern // ---#####################

        //#################---//Factory Method Pattern//---###################

        // Factory method pattern is use to create a single object

//        FactoryConsumer fc = new FactoryConsumer();
//        try{
//            fc.startOperations("water"); // Instanciate a Ship object using ShipLogisticFactory on runtime
//            fc.startOperations("land"); // Instanciate a Truck object using TruckLogisticFactory
//            fc.startOperations("air"); // return exception
//        } catch (InvalidInputException e) {
//            System.out.println(e.getMessage());
//        }

        //#################---//Abstract Factory Pattern//---###################

        //Abstract Factory Pattern let you create a family/multiple of related or dependent objects[related]

//        AbstractFactoryConsumer afc = new AbstractFactoryConsumer();
//        try{
//            afc.startOperations("water"); // Instanciate a Ship object using ShipLogisticFactory on runtime
//            afc.startOperations("land"); // Instanciate a Truck object using TruckLogisticFactory
//            afc.startOperations("air"); // return exception
//        } catch (InvalidInputException e) {
//            System.out.println(e.getMessage());
//        }

        //#################--- // Behavioral Pattern // ---#####################

        //#################---//Strategy Pattern//---###################

         /*
         Strategy pattern suggest composition over inheritance
         Strategy patterns defines a family of algorithms,
         It encapsulate each one of them and make them interchangeable
         Strategy pattern let the algorithmn vary independently from the clients that use it
         i.e collection sorting algorithms, finding different route option using different algorithms in navigation app
        */
//        List<Integer> sampleList = new ArrayList<>(Arrays.asList(1,2,23,4,345,345,45,65,67,76,85,456,4,53,432,34,243));
//        SortByLastDigitStrategy sortByLast = new SortByLastDigitStrategy();
//        SortByFirstDigitStrategy sortByFirst = new SortByFirstDigitStrategy();
//        SortByNaturalAscStrategy naturalSort = new SortByNaturalAscStrategy();
//        StrategyConsumer sc = new StrategyConsumer();
//        //sortBy algorithm/strategy can change based on the requirement without changing the overall code
//        sc.executeSort(naturalSort, sampleList);

        //#################---//Observer Pattern//---###################

        /*
        Observer patterns defines one to many dependency,
        so when the one object change the state, all of its observers gets notified.
        IObservable HAS A one to many relationship with Iobserver
        IObservable/abstract class and concrete class must have register(IObserver) unRegister(IObserver) and notify() method
        IObserver concrete must have implementation of update(IObservable) method
        i.e Chatroom, social media groups, pub-sub mechanism, broadcasting
         */
        Observer1 sub1 = new Observer1();
        Observer2 sub2 = new Observer2();
        WeatherStation ws = new WeatherStation();
        ws.add(sub1);
        ws.add(sub2);
        ws.setTemperature(30);
        ws.setTemperature(28);
        ws.setTemperature(33);

    }
}
