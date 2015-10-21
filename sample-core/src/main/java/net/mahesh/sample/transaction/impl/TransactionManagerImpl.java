package net.mahesh.sample.transaction.impl;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.PersistenceContext;

import net.mahesh.sample.entities.BookingDetails;
import net.mahesh.sample.transaction.TransactionManager;

@Stateless(name="net.mahesh.sample.transaction.imple.TransactionManagerImpl")
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class TransactionManagerImpl implements TransactionManager {
	@PersistenceContext(name="fbp")
	private javax.persistence.EntityManager em;


	public BookingDetails bookFlight(BookingDetails bookingDetails) {
		em.persist(bookingDetails);
		return bookingDetails;
	}
}