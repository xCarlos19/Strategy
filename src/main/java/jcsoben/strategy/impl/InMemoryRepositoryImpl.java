package jcsoben.strategy.impl;

import jcsoben.strategy.repository.Repository;

public class InMemoryRepositoryImpl implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in Memory");
    }
}
