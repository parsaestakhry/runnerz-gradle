CREATE TABLE IF NOT EXISTS Run (
    id INT NOT NULL,
    title VARCHAR(255) NOT NULL,
    started_on TIMESTAMP NOT NULL,
    completed_on TIMESTAMP,
    miles FLOAT NOT NULL,
    location VARCHAR(10) INT NOT NULL,
    PRIMARY KEY (id)
)