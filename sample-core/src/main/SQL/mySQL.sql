create database TEST;
drop table if exists FBP_AIRPORTS
drop table if exists FBP_FLIGHT_BOOKINGS
drop table if exists FBP_FLIGHT_DETAILS
create table FBP_AIRPORTS (AIRPORT_ID varchar(255) not null, AIRPORT_CITY varchar(255), AIRPORT_CITY_NAME varchar(255), AIRPORT_STATE varchar(255), primary key (AIRPORT_ID))
create table FBP_FLIGHT_BOOKINGS (ID varchar(255) not null auto_increment, BOOKING_ID varchar(255), CHECKIN_TIME datetime, FLIGHT_ID varchar(255), PASSENGER_AGE integer, PASSENGER_FIRST_NAME varchar(255), PASSENGER_LAST_NAME varchar(255), PASSENGER_MEAL_CHOICE varchar(255), PASSENGER_MOBILE varchar(255), ADDRESS_LINE_2 varchar(255), CITY varchar(255), COUNTRY varchar(255), ADDRESS_LINE_1 varchar(255), PIN_CODE varchar(255), STATE varchar(255), ADDRESS_LINE_3 varchar(255), PASSENGER_ID_NUMBER varchar(255), PASSENGER_SEX varchar(255), PAYMENT_MODE varchar(255), REPORTING_TIME datetime, primary key (ID))
create table FBP_FLIGHT_DETAILS (ID varchar(255) not null auto_increment, FLIGHT_COST_CURRENCY varchar(255), FLIGHT_COST_VALUE double precision, DEPARTURE_TIME datetime, DESTINATION varchar(255), FLIGHT_INFO varchar(255), FLIGHT_ID varchar(255), ORIGIN varchar(255), PLANE_ID varchar(255), FLIGHT_STATUS varchar(255), primary key (ID))

COMMIT;
