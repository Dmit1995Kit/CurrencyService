create table InfoCourseDB(
id integer DEFAULT nextval('infocourse_id_seq') NOT NULL,
disclaimer varchar(80) not null,
license varchar(80) not null,
times INT,
base varchar(80) not null,
RUB DECIMAL,
EUR DECIMAL,
ANG DECIMAL,
ARS DECIMAL,
AUD DECIMAL,
logintime timestamp default now()
);
CREATE SEQUENCE infocourse_id_seq
INCREMENT BY 1,
NO MAXVALUE,
NO MINVALUE,
CACHE 1;
