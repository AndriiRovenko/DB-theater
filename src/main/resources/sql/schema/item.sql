CREATE TABLE IF NOT EXISTS item (
  id          INT     NOT NULL,
  name        VARCHAR NOT NULL,
  description VARCHAR NULL     DEFAULT NULL,
  PRIMARY KEY (id)
)