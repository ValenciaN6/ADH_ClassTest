package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.TransactionEntity;

/**
 * Session Bean implementation class TransactionEJB
 */
@Stateless
@LocalBean
public class TransactionEJB {

    @PersistenceContext(unitName = "digibank")
    EntityManager em;
    
    public TransactionEJB() {
        // TODO Auto-generated constructor stub
    }

    public void newTransaction(TransactionEntity transEntity) {
    	System.out.println("<<<<<<New Transaction to persist>>>>>");
    	em.persist(transEntity);
    	
    }
}
