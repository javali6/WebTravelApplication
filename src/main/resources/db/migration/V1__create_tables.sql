-- V1__create_tables.sql

DROP TABLE IF EXISTS Customers CASCADE;
DROP TABLE IF EXISTS Tours CASCADE;
DROP TABLE IF EXISTS Reservations CASCADE;
DROP TABLE IF EXISTS Users CASCADE;

-- Create Customers table
CREATE TABLE IF NOT EXISTS Customers
(
    customerId  serial PRIMARY KEY,
    firstName   VARCHAR(50),
    lastName    VARCHAR(50),
    address     TEXT,
    phoneNumber VARCHAR(15),
    email       VARCHAR(100)
);


-- Create Tours table
CREATE TABLE IF NOT EXISTS Tours
(
    tourID          serial PRIMARY KEY,
    name            VARCHAR(100),
    startDate       DATE,
    endDate         DATE,
    price           NUMERIC(10, 2),
    description     TEXT,
    maxParticipants INTEGER
);


-- Create Reservations table
CREATE TABLE IF NOT EXISTS Reservations
(
    reservationID        serial PRIMARY KEY,
    customerID           INTEGER REFERENCES Customers (CustomerID),
    tourID               INTEGER REFERENCES Tours (TourID),
    reservationDate      DATE,
    numberOfParticipants INTEGER
);


-- Create Users table
CREATE TABLE IF NOT EXISTS Users
(
    userID   serial PRIMARY KEY,
    username VARCHAR(50) UNIQUE,
    password VARCHAR(100),
    role     VARCHAR(20) DEFAULT 'USER'
);
