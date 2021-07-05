use `chat`;

create table massage (id bigint not null auto_increment, local_date_time datetime(6), name varchar(255), text varchar(255), primary key (id)) engine=InnoDB;
