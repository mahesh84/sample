--create database TEST;

drop table FBP_AIRPORTS;
drop table FBP_FLIGHT_BOOKINGS;
drop table FBP_FLIGHT_DETAILS;
drop table FBP_PLANE_DETAILS;

create table FBP_AIRPORTS (AIRPORT_ID varchar(255) not null, AIRPORT_CITY varchar(255), AIRPORT_CITY_NAME varchar(255), AIRPORT_STATE varchar(255), primary key (AIRPORT_ID));
create table FBP_FLIGHT_BOOKINGS (ID integer not null AUTO_INCREMENT, BOOKING_ID varchar(255), CHECKIN_TIME varchar(255), FLIGHT_ID varchar(255), JOURNEY_DATE timestamp, PASSENGER_AGE integer, PASSENGER_FIRST_NAME varchar(255), PASSENGER_LAST_NAME varchar(255), PASSENGER_MEAL_CHOICE varchar(255), PASSENGER_MOBILE varchar(255), ADDRESS_LINE_2 varchar(255), CITY varchar(255), COUNTRY varchar(255), ADDRESS_LINE_1 varchar(255), PIN_CODE varchar(255), STATE varchar(255), ADDRESS_LINE_3 varchar(255), PASSENGER_ID_NUMBER varchar(255), PASSENGER_SEX varchar(255), PAYMENT_MODE varchar(255), REPORTING_TIME varchar(255), primary key (ID));
create table FBP_FLIGHT_DETAILS (ID integer not null AUTO_INCREMENT, FLIGHT_COST_CURRENCY varchar(255), FLIGHT_COST_VALUE double, DEPARTURE_TIME varchar(255), DESTINATION varchar(255), FLIGHT_DURATION varchar(255), FLIGHT_ID varchar(255) not null, FLIGHT_INFO varchar(255), ORIGIN varchar(255), FLIGHT_STATUS varchar(255), PLANE_ID integer, primary key (ID));
create table FBP_PLANE_DETAILS (PLANE_ID integer not null, TOTAL_SEAT_CAPACITY integer, primary key (PLANE_ID));

alter table FBP_FLIGHT_DETAILS add constraint FKDFA201DE8C089B84 foreign key (PLANE_ID) references FBP_PLANE_DETAILS;