CREATE TABLE users (
	id BIGINT PRIMARY KEY default nextval('users_seq'),
	first_name VARCHAR(255) not null,
	last_name VARCHAR(255) not null,
	age INT not null,
	CONSTRAINT users_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.users
    OWNER to postgres;