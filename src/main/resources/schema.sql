DROP TABLE IF EXISTS WashMachine;
CREATE TABLE WashMachine 
(
Machine_id INT AUTO_INCREMENT PRIMARY KEY,
Machine_Brand VARCHAR(250) NOT NULL,
Machine_version VARCHAR(250) NOT NULL,
Machine_Type VARCHAR(250) DEFAULT NULL,
Price NUMERIC(18,2)
); 