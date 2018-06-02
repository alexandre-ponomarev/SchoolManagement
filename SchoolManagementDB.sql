create schema SchoolManagementDB;

use SchoolManagementDB;

create table Students
 (
	StudentID int auto_increment not null,
    UserName nvarchar(40) not null,
    StudentPass nvarchar(40) not null,	
	FirstName nvarchar(100) not null,
	LastName nvarchar(100) not null, 
	City nvarchar(24) null,	
	PostalCode nvarchar(7) not null,	
	constraint pk_Students primary key clustered (StudentID asc)
 )
 ;
 
 create table Books
 (
	BookID int auto_increment not null,
    BookName nvarchar(200) not null,
    AuthorName nvarchar(100) not null,
    Category nvarchar(50) null,
	constraint pk_Books primary key clustered (BookID asc)
 )
 ;
 
 insert into Students (UserName, Studentpass, FirstName, LastName, City, Postalcode) values 
 ('marysmith', 'm123', 'Mary', 'Smith', 'Montreal', 'H4D 3C4'),
 ('tonyfo', 'an123', 'Anthony', 'Fotocia', 'Montreal', 'H4G 8C6'),
 ('saral', 's999', 'Sara', 'Lee', 'Montreal', 'N6H 9D9'),
 ('leob', 'l555', 'Leo', 'Blonc', 'Laval', 'M4N 3B5'),
 ('yasment', 'yt11', 'Yasmeen', 'Tylor', 'Dorval', 'K4P 9C9'),
 ('joek', 'j33', 'Joe', 'King', 'Montreal', 'H5T 4D5'),
 ('emmmyc', 'e44', 'Emmy', 'Colse', 'Kirkland', 'N4M 9B3'),
 ('marysmith', 'm123', 'Andria', 'Walton', 'Montreal', 'H4D 3B4')
 ;
 
 insert into Books (BookName, AuthorName, Category) values('First Lensman', 'Edward Elmer Smith', 'Scifi'),
 ('The Stars My Destination', 'Alfred Bester','Scifi'),
 ('Children of Time', 'Adrian Tchaikovsky','Scifi'),
 ('Crushing It', 'Gary Vaynerchuk, Rich Roll', 'Business'),
 ('The Hardest Fall', 'Ella Maise', 'Romance'),
 ('I Am Justice (Band of Sisters)', 'Diana Muñoz Stewart', 'Romance'),
 ('The Ocean Liner', 'Marius Gabriel', 'Romance'),
 ('Obama: An Intimate Portrait', 'Pete Souza, Barack Obama', 'Biography'),
 ('I am Keith Hernandez: A Memoir', ' Keith Hernandez', 'Biography')
 ;
 
 select * from Students;
 
 select * from Books;