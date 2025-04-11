-- Insert data into tables
INSERT INTO Movie (MovieID, Title, ReleaseYear, DirectorID, GenreID)
VALUES
  (1, 'The Shawshank Redemption', 1994, 1, 1),
  (2, 'The Godfather', 1972, 2, 2),
  (3, 'The Dark Knight', 2008, 3, 3),
  (4, '12 Angry Men', 1957, 4, 4),
  (5, 'Schindler''s List', 1993, 5, 5);

INSERT INTO Actor (ActorID, Name)
VALUES
  (1, 'Tim Robbins'),
  (2, 'Morgan Freeman'),
  (3, 'Marlon Brando'),
  (4, 'Al Pacino'),
  (5, 'Christian Bale');

INSERT INTO Director (DirectorID, Name)
VALUES
  (1, 'Frank Darabont'),
  (2, 'Francis Ford Coppola'),
  (3, 'Christopher Nolan'),
  (4, 'Sidney Lumet'),
  (5, 'Steven Spielberg');

INSERT INTO Genre (GenreID, Name)
VALUES
  (1, 'Drama'),
  (2, 'Crime'),
  (3, 'Action'),
  (4, 'Thriller'),
  (5, 'Biography');

INSERT INTO Cast (MovieID, ActorID)
VALUES
  (1, 1),
  (1, 2),
  (2, 3),
  (2, 4),
  (3, 5);