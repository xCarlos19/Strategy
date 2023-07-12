package jcsoben.strategy.context;

import jcsoben.strategy.repository.Repository;

public class Context {

    private Repository repository;

    public Context(Repository repository) {
        this.repository = repository;
    }

    public void execute() {
        repository.save();
    }
}
