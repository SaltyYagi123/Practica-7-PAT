--Insertamos algunos registros para que la base de datos no este vacia 

INSERT INTO USERS (USER_ID, CAR_ID, AGE, COUNTRY, IDENTIFICATION) VALUES (1,1, 18, "Spain", "06679111A");
INSERT INTO USERS (USER_ID, CAR_ID, AGE, COUNTRY, IDENTIFICATION) VALUES (2,2,34, "United Kingdom", "12345678B");
INSERT INTO USERS (USER_ID, CAR_ID, AGE, COUNTRY, IDENTIFICATION) VALUES (3,3,35, "Zimbabwe", "98765432C");

INSERT INTO VEHICLES (USER_ID, CAR_ID, ELECTRIC, MODEL, VEHICLE_AGE) VALUES (1,1,true , "Renault Twizzy", 25 );
INSERT INTO VEHICLES (USER_ID, CAR_ID, ELECTRIC, MODEL, VEHICLE_AGE) VALUES (2,2,false, "Delorean", 69);
INSERT INTO VEHICLES (USER_ID, CAR_ID, ELECTRIC, MODEL, VEHICLE_AGE) VALUES (3,3, true, "Tesla Model X", 15);

INSERT INTO HOSTS(USER_ID, CAR_ID, CHARGER_LOCATION, HOURLY_RATE, RATING, NUMBER_USED, IDENTIFICATION) VALUES (1,,"Albacete, Reino de ESPANHA", 15.32, , 5, "06679111A");
INSERT INTO HOSTS(USER_ID, CAR_ID, CHARGER_LOCATION, HOURLY_RATE, RATING, NUMBER_USED, IDENTIFICATION) VALUES (2,2, "Murcia, Murcia", 10.15,7,8, "12345678B");
INSERT INTO HOSTS(USER_ID, CAR_ID, CHARGER_LOCATION, HOURLY_RATE, RATING, NUMBER_USED, IDENTIFICATION) VALUES (3,3, "Londres, GREAT BRITANNIA",27.32,8,9,"98765432C");