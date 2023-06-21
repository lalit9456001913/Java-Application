create table users
(
    id                   uuid                     not null
        primary key,
    mobile_number        varchar(255)             not null
        constraint users_unique_mobile_number
            unique
        constraint ukr7c96a004bv8w16jgdm8imich
            unique,
    name                 text,
    email_id             varchar(255),
--    country_code          text,
    created_at           timestamp with time zone not null default current_timestamp,
    updated_at           timestamp with time zone not null default current_timestamp
);

