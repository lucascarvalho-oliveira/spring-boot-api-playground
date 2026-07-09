create table produto(
    id int auto_increment primary key,
    nome varchar(50) not null,
    descricao varchar(300),
    preco numeric(15, 2) not null
);