package net.mahesh.sample.core;


import javax.naming.NamingException;

import net.mahesh.sample.core.util.DBSetupUtils;


import org.junit.Test;


public class PrepareDBTest {
	
	
	
	@Test
	public void prepareDB() throws NamingException{
		DBSetupUtils.refreshData(DBSetupUtils.insertData_FBP_PLANE_DETAILS);
		DBSetupUtils.refreshData(DBSetupUtils.insertData_FBP_AIRPORTS);
		DBSetupUtils.refreshData(DBSetupUtils.insertData_FBP_FLIGHT_DETAILS);
	}

}
