create table if not exists customers (id serial not null, card_number varchar(255), first_name varchar(255), last_name varchar(255), primary key (id));
create table if not exists products (id serial not null, description varchar(255), name varchar(255), primary key (id));
create table if not exists variants (id serial not null, price integer, product_id integer, description varchar(255), name varchar(255), primary key (id));
alter table if exists variants add constraint FK95bued017vcya4rf4s7n31ew4 foreign key (product_id) references products;
