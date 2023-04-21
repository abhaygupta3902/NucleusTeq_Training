create table movies
(
	movie_id int,
	movie_name varchar(50),
	movie_genere varchar(30),
	movie_rating real
);

select * from movies;

insert into movies (movie_id,movie_name,movie_genere,movie_rating)
values
(101,'The Lion King','animation',8.5),
(102,'The Dark Knight','Action',9.0),
(103,'The Matrix','Sci-fi',8.7),
(104,'se7en','crime',8.5),
(101,'Intersteller','Adventure',8.6);

update movies set movie_id = 105 where movie_name = 'Intersteller';


alter table movies rename column movie_genere to movie_genre;

delete from movies where movie_id = 104;

select * from movies where movie_rating >8.3;

select * from movies where movie_rating between 8.6 and 9.0;

select * from movies where movie_genre = 'Action';

select movie_name,movie_genre from movies where movie_rating <8.9;

select * from movies where movie_rating in (8.7,9.0);

insert into movies (movie_id,movie_name,movie_genre,movie_rating)
values
(106,'Avengers:Endgame','Sci-fi',8.5),
(107,'Hera pheri','Comedy',9.0),
(108,'3 idiots','Drama',9.1),
(109,'Ek tha Tiger','Action',8.5),
(110,'De Dana Dan','Comedy',8.6);


select distinct movie_genre from movies;


select movie_name from movies limit 5;

select movie_name from movies order by movie_name asc limit 5;

select * from movies;

select * from movies order by movie_id desc limit 3;

select UPPER(movie_name) from movies;

select length(movie_name) from movies;

select substring(movie_name, 1,6) from movies;

select now();

select count(movie_id) from movies;

select sum(movie_rating) from movies;

select Avg(movie_rating) from movies;

select min(movie_rating) from movies;

create table classroom
(
	rollno int8 Primary key,
	name varchar(30) NOT NULL,
	house char(12) NOT NULL,
	grade char(1)
);

INSERT INTO classroom  (rollno, name, house, grade)  VALUES
(1, 'sam', 'Akash', 'B'),
(2, 'Ram', 'Agni', 'A'),
(3, 'Shyam', 'Jal', 'B'),
(4, 'Sundar', 'Agni', 'A'),
(5, 'Ram', 'Yayu', 'B');

select * from classroom;



