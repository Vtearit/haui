use master
go
create database QLBH
go

create table TaiKhoan(
	
	NameDN nvarchar(20),
	PassDN nvarchar(20)
)
drop table TaiKhoan
create table HANG(
	IDHang char(4) primary key,
	NameHang nvarchar(20),
	Quality int,
	Price money,
	Typeof nvarchar(20),
)
select * from TaiKhoan
select * from HANG