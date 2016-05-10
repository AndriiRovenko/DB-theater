CREATE TYPE CATEGORY AS ENUM ('clothes', 'makeup', 'scenery');

CREATE TABLE IF NOT EXISTS production (
  id       INT         NOT NULL,
  category CATEGORY    NOT NULL,
  name     VARCHAR(64) NOT NULL,
  price    MONEY       NOT NULL,
  location VARCHAR(64),
  available BOOL,
  PRIMARY KEY (id)

)
