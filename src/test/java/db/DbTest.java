package db;


import org.junit.Assert;
import org.junit.Test;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.test.AbstractPersistenceTest;

import jacklow.model.Vehiculo;


public class DbTest extends AbstractPersistenceTest implements WithGlobalEntityManager {

	@Test
	public void guardarYTraerVehiculo() {
		Vehiculo vehiculo1 = new Vehiculo("2","1");
		
		withTransaction(() -> {entityManager().persist(vehiculo1);});
		Assert.assertTrue(entityManager().find(Vehiculo.class, "2")==vehiculo1);
	}

	@Test
	public void contextUpWithTransaction() throws Exception {
		withTransaction(() -> {});
	}

}
