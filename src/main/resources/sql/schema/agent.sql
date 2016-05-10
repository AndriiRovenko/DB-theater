CREATE TYPE CATEGORY AS ENUM ('seller', 'reseller', 'manufacturer');

CREATE TABLE IF NOT EXISTS agent (
  id       INT         NOT NULL,
  category CATEGORY    NOT NULL,
  edrpou   CHAR(10)    NOT NULL,
  name     VARCHAR(64) NOT NULL,
  phone    VARCHAR(13),
  mail     VARCHAR(64),
  created  DATE        NOT NULL,
  state    VARCHAR(64),
  city     VARCHAR(64),
  PRIMARY KEY (id)

)
