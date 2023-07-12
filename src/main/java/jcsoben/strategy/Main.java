package jcsoben.strategy;

import jcsoben.strategy.context.Context;
import jcsoben.strategy.impl.InMemoryRepositoryImpl;
import jcsoben.strategy.impl.MongoRepositoryImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calling repository");

        Context c = new Context(new MongoRepositoryImpl());
        c.execute();
    }
}
