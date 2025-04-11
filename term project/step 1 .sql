-- Create database
CREATE DATABASE MovieLibrary;

-- Use database
USE MovieLibrary;

-- Create tables
CREATE TABLE Movie (
  MovieID INT PRIMARY KEY,
  Title VARCHAR(255),
  ReleaseYear INT,
  DirectorID INT,
  GenreID INT,
  FOREIGN KEY (DirectorID) REFERENCES Director(DirectorID),
  FOREIGN KEY (GenreID) REFERENCES Genre(GenreID)
);

CREATE TABLE Actor (
  ActorID INT PRIMARY KEY,
  Name VARCHAR(255)
);

CREATE TABLE Director (
  DirectorID INT PRIMARY KEY,
  Name VARCHAR(255)
);

CREATE TABLE Genre (
  GenreID INT PRIMARY KEY,
  Name VARCHAR(255)
);

CREATE TABLE Cast (
  MovieID INT,
  ActorID INT,
  PRIMARY KEY (MovieID, ActorID),
  FOREIGN KEY (MovieID) REFERENCES Movie(MovieID),
  FOREIGN KEY (ActorID) REFERENCES Actor(ActorID)
);