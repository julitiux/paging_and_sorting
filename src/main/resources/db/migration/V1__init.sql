CREATE TABLE people
(
    id           UUID           NOT NULL,
    username     VARCHAR UNIQUE NOT NULL,
    name         VARCHAR        NOT NULL,
    lastname     VARCHAR        NOT NULL,
    password     VARCHAR        NOT NULL,
    date_created TIMESTAMP      NOT NULL,
    last_updated TIMESTAMP      NOT NULL,
    PRIMARY KEY (id)
);
