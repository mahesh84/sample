package net.mahesh.sample.core.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import javax.naming.NamingException;

import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.destination.DriverManagerDestination;
import com.ninja_squad.dbsetup.operation.Operation;

public class DBSetupUtils {
	static Calendar cal;
	static Date date1;	
	final static Properties properties=new Properties();
	static {
		cal= Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 11);
		cal.set(Calendar.MINUTE, 00);
		cal.set(Calendar.SECOND, 00);
		cal.set(Calendar.MILLISECOND, 00);
		date1 = cal.getTime();
		InputStream fileIn = DBSetupUtils.class.getResourceAsStream("/test.properties");
		try {
			properties.load(fileIn);
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}	
	private static String username =properties.getProperty("database.username");
	private static String password = properties.getProperty("database.password");
	private static String URL = properties.getProperty("database.url");	

	Timestamp timestamp = new Timestamp(date1.getTime());

	public static void refreshData(Operation operation) throws NamingException {		
		DbSetup dbSetup = new DbSetup(new DriverManagerDestination(URL,
				username, password), operation);
		dbSetup.launch();
	}

	public static final Operation insertData_FBP_PLANE_DETAILS = Operations
			.sequenceOf(
					Operations.deleteAllFrom("FBP_PLANE_DETAILS"),
					Operations.insertInto("FBP_PLANE_DETAILS")
							.columns("PLANE_ID", "TOTAL_SEAT_CAPACITY")
							.values("10001", "100").values("10002", "100")
							.values("10003", "100").values("10004", "100")
							.values("10005", "100").values("10006", "100")
							.values("10007", "100").values("10008", "100")
							.values("10009", "100").values("10010", "100")
							.values("10011", "100").values("10012", "100")
							.values("10013", "100").values("10014", "100")
							.build());

	public static final Operation insertData_FBP_AIRPORTS = Operations
			.sequenceOf(
					Operations.deleteAllFrom("FBP_AIRPORTS"),
					Operations
							.insertInto("FBP_AIRPORTS")
							.columns("AIRPORT_ID", "AIRPORT_CITY",
									"AIRPORT_CITY_NAME", "AIRPORT_STATE")
							.values("A", "AHMDABAD", "AHMDABAD", "GUJRAT")
							.values("B", "BANGALORU", "BANGALORU", "KARNATAKA")
							.values("C", "CHENNAI", "CHENNAI", "TAMILNADU")
							.values("E", "E", "E", "E")
							.values("F", "F", "F", "F")
							.values("G", "G", "G", "G")
							.values("H", "HUBLI", "HUBLI", "HUBLI").build());	

	public static final Operation insertData_FBP_FLIGHT_DETAILS = Operations
			.sequenceOf(
					Operations.deleteAllFrom("FBP_FLIGHT_DETAILS"),
					Operations
							.insertInto("FBP_FLIGHT_DETAILS")
							.columns("ID", "FLIGHT_ID", "ORIGIN",
									"DESTINATION", "DEPARTURE_TIME",
									"FLIGHT_COST_VALUE",
									"FLIGHT_COST_CURRENCY", "FLIGHT_INFO",
									"PLANE_ID", "FLIGHT_STATUS")
							.values("1", "FBP-A-B-1", "A", "B", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("2", "FBP-B-A-1", "B", "A", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("3", "FBP-A-F-1", "A", "F", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("4", "FBP-F-A-1", "F", "A", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("5", "FBP-H-B-1", "H", "B", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("6", "FBP-B-H-1", "B", "H", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("7", "FBP-B-C-1", "B", "C", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("8", "FBP-B-E-1", "B", "E", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("9", "FBP-E-B-1", "E", "B", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("10", "FBP-C-B-1", "C", "B", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("11", "FBP-C-E-1", "C", "E", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("12", "FBP-C-E-2", "C", "E", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("13", "FBP-C-E-3", "C", "E", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("14", "FBP-C-E-4", "C", "E", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("15", "FBP-C-E-5", "C", "E", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("16", "FBP-C-E-6", "C", "E", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("17", "FBP-C-E-7", "C", "E", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("18", "FBP-C-E-8", "C", "E", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("19", "FBP-C-E-9", "C", "E", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("20", "FBP-E-C-1", "E", "C", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("21", "FBP-E-C-2", "E", "C", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("22", "FBP-E-C-3", "E", "C", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("23", "FBP-E-C-4", "E", "C", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("24", "FBP-E-C-5", "E", "C", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("25", "FBP-E-C-6", "E", "C", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("26", "FBP-E-C-7", "E", "C", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("27", "FBP-E-C-8", "E", "C", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("28", "FBP-E-C-9", "E", "C", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("29", "FBP-C-D-1", "C", "D", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("30", "FBP-D-C-1", "D", "C", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("31", "FBP-D-E-1", "D", "E", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.values("32", "FBP-E-D-1", "E", "D", date1,"1000","INR","BOEING-777","10001","AVAILABLE")
							.build());

}
