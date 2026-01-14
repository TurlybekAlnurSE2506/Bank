drop table if exists BankAccount;
drop table if exists Customer;
drop table if exists Bank;


create table Bank(
    bank_id serial8 not null,
    bank_name varchar not null unique,
    primary key (bank_id)
);
create table Customer(
    customer_id serial8 not null,
    name varchar not null,
    surname varchar not null,
    primary key (customer_id),
    bank_id int8 not null,
    constraint fk_bank_customer
        foreign key (bank_id) references Bank(bank_id)
);

create table BankAccount(
    bankAcc_id serial8 not null,
    username varchar not null,
    password varchar not null,
    balance double precision,
    customer_id int8 not null,
    bank_id int8 not null,
    primary key (bankAcc_id),

    constraint fk_customer
        foreign key (customer_id) references Customer(customer_id),
    constraint fk_bank
        foreign key (bank_id) references Bank(bank_id)
);