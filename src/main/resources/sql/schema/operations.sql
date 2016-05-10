CREATE TYPE CATEGORY AS ENUM ('buy', 'sell', 'refund', 'write-off');
CREATE TYPE STATUS AS ENUM ('ordered', 'waiting', 'ready');

CREATE TABLE IF NOT EXISTS operations (
  id       INT         NOT NULL,
  CATEGORY CATEGORY    NOT NULL,
  name     VARCHAR(64) NOT NULL,
  status   STATUS      NOT NULL,
  contact_person INT   NOT NULL,

  PRIMARY KEY (id)

)
