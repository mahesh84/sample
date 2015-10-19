package net.mahesh.sample.transaction;

import javax.ejb.Local;

@Local(value=TransactionManager.class)
public interface TransactionManager {

}
