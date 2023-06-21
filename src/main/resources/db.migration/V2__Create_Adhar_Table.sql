create table users
(
    id                   uuid                     not null
        primary key,

    name                 text,
    adhar_number             varchar(255),
    created_at           timestamp with time zone not null default current_timestamp,
    updated_at           timestamp with time zone not null default current_timestamp
);

