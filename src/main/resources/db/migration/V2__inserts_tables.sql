-- Customers
INSERT INTO Customers(FirstName, LastName, Address, PhoneNumber, Email)
VALUES ('Jan', 'Krawczyk', 'ul. Warszawska, Poznań', '+48561234522', 'krawczykjanek21@gmail.com');

-- Tours

INSERT INTO Tours (name, description, startDate, endDate, price) VALUES
('Wycieczka do Krakowa', 'Dwudniowa wycieczka do Krakowa', '2024-06-15', '2024-06-16', 300.00),
('Wycieczka do Warszawy', 'Jednodniowa wycieczka do stolicy', '2024-06-20', '2024-06-20', 200.00),
('Wycieczka do Gdańska', 'Trzydniowa wycieczka nad morze', '2024-07-05', '2024-07-07', 450.00),
('Wycieczka po Tatrach', 'Czterodniowa wycieczka górska', '2024-08-10', '2024-08-13', 600.00),
('Wycieczka do Wrocławia', 'Dwudniowa wycieczka do Wrocławia', '2024-09-01', '2024-09-02', 350.00),
('Weekend w Zakopanem', 'Weekend w górach', '2024-10-05', '2024-10-06', 400.00),
('Wycieczka do Poznania', 'Jednodniowa wycieczka do Poznania', '2024-11-15', '2024-11-15', 250.00),
('Sylwester w Górach', 'Sylwestrowa wycieczka w Tatry', '2024-12-31', '2025-01-01', 700.00);

-- Users

INSERT INTO Users (username, password, role) VALUES
('janek123', 'bezpieczneHaslo123', 'user'),
('ewak456', 'tajneHaslo456', 'admin'),
('tomek789', 'hasloTajne789', 'user');

