DROP TABLE IF EXISTS connect;
DROP SEQUENCE IF EXISTS glob_seq_connect;

CREATE SEQUENCE glob_seq_connect START 1;
CREATE TABLE connect (
  id   INTEGER PRIMARY KEY DEFAULT nextval('glob_seq_connect'),
  name VARCHAR(100)
)