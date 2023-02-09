/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so;

import repository.GenericRepository;
import repository.db.DbRepository;
import repository.db.DbRepositoryImpl;

/**
 *
 * @author Jelena
 */
public abstract class AbstractSO {
    
    protected final GenericRepository repository;

    public AbstractSO() {
        repository = new DbRepositoryImpl();
    }

    public final void execute(Object operation) throws Exception {
        try {
            precondition(operation);
            startTransaction();
            executeOperation(operation);
            commitTransaction();
            System.out.println("Operacija je uspešno izvršena!");
        } catch (Exception ex) {
            System.out.println("Greška prilikom izvršavanja operacije!");
            rollbackTransaction();
            throw ex;
        } finally {
            disconnect();
        }
    }

    
    //naredne dve operacije su abstract jer zavise
    //od slucaja do slucaja
    protected abstract void precondition(Object param) throws Exception;

    protected abstract void executeOperation(Object param) throws Exception;

    private void startTransaction() throws Exception {
        ((DbRepository) repository).connect();
    }

    private void commitTransaction() throws Exception {
        ((DbRepository) repository).commit();
    }

    private void rollbackTransaction() throws Exception {
        ((DbRepository) repository).rollback();
    }

    private void disconnect() throws Exception {
        ((DbRepository) repository).disconnect();
    }

}
