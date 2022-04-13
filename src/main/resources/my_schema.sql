--Ejemplos de las tablas que voy a crear 

DROP TABLE IF EXISTS USERS:
DROP TABLE IF EXISTS VEHICLES;
DROP TABLE IF EXISTS HOSTS;
DROP TABLE IF EXISTS CHARGERS;

CREATE TABLE USERS(
    USER_ID INTEGER IDENTITY PRIMARY KEY, 
    CAR_ID INTEGER,
    AGE INTEGER NOT NULL, --Ya que debe de ser mayor de edad
    COUNTRY VARCHAR(255) NOT NULL, 
    IDENTIFICATION VARCHAR(255) NOT NULL --Para el DNI vamos a tener que hacer la verificacion en el frontend 
);

CREATE TABLE VEHICLES (
    USER_ID INTEGER IDENTITY PRIMARY KEY, 
    CAR_ID NOT NULL, 
    ELECTRIC BOOLEAN NOT NULL, 
    MODEL VARCHAR(255), 
    VEHICLE_AGE INTEGER NOT NULL
);


CREATE TABLE HOSTS(
    USER_ID INTEGER IDENTITY PRIMARY KEY, 
    CAR_ID INTEGER, 
    CHARGER_LOCATION VARCHAR(255) NOT NULL,
    HOURLY_RATE FLOAT NOT NULL, 
    RATING INTEGER, 
    NUMBER_USED INTEGER, 
    IDENTIFICATION VARCHAR(255) NOT NULL
);

CREATE TABLE  CHARGERS (
    USER_ID INTEGER NOT NULL PRIMARY KEY,
    CHARGER_ID INTEGER NOT NULL,
	CHARGER_NAME VARCHAR2(40) NOT NULL,
	LATITUDE REAL,
	LONGITUDE REAL,
	POWER NUMBER
);