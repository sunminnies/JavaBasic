create table sungjuk (
    sjno    int auto_increment,
    name    varchar(10) not null,
    kor     int default 0,
    eng     int default 0,
    mat     int default 0,
    tot     int,
    mean    decimal(5,1),
    grd     char(2),
    regdate datetime default current_timestamp
);

insert into sungjuk(name, kor, eng, mat, tot, mean, grd)
values ('홍길동', 99, 89, 72, 288, 96.5, '수');

select sjno, name, kor, eng, mat, mid(regdate,1,10) regdate from sungjuk
order by sjno;

select * from sungjuk where sjno = 1;

update sungjuk set name = '파이썬', kor = 90, eng = 90, mat = 90 where sjno = 1;

delete from sungjuk where sjno = 1;