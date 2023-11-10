-- V1__create_tables.sql

-- Create Customers table
CREATE TABLE IF NOT EXISTS Customers
(
    CustomerID  serial PRIMARY KEY,
    FirstName   VARCHAR(50),
    LastName    VARCHAR(50),
    Address     TEXT,
    PhoneNumber VARCHAR(15),
    Email       VARCHAR(100)
);


-- Create Tours table
CREATE TABLE IF NOT EXISTS Tours
(
    TourID          serial PRIMARY KEY,
    Name            VARCHAR(100),
    StartDate       DATE,
    EndDate         DATE,
    Price           NUMERIC(10, 2),
    Description     TEXT,
    MaxParticipants INTEGER
);


-- Create Reservations table
CREATE TABLE IF NOT EXISTS Reservations
(
    ReservationID        serial PRIMARY KEY,
    CustomerID           INTEGER REFERENCES Customers (CustomerID),
    TourID               INTEGER REFERENCES Tours (TourID),
    ReservationDate      DATE,
    NumberOfParticipants INTEGER
);


-- Create Users table
CREATE TABLE IF NOT EXISTS Users
(
    UserID   serial PRIMARY KEY,
    Username VARCHAR(50) UNIQUE,
    Password VARCHAR(100),
    Role     VARCHAR(20) DEFAULT 'USER'
);
