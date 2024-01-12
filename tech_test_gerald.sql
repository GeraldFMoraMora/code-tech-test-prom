

CREATE TABLE customer (
    id VARCHAR(50) PRIMARY KEY,
    firstName VARCHAR(20),
    lastName VARCHAR(20),
    phone VARCHAR(20),
    birthdate DATE
);

ALTER TABLE customer
ALTER COLUMN id TYPE VARCHAR(50),
ALTER COLUMN firstName TYPE VARCHAR(20),
ALTER COLUMN lastName TYPE VARCHAR(20),
ALTER COLUMN phone TYPE VARCHAR(20);

-- Procedimiento almacenado para agregar un cliente.
CREATE OR REPLACE PROCEDURE add_client(
    p_id VARCHAR(50),
    p_firstName VARCHAR(20),
    p_lastName VARCHAR(20),
    p_phone VARCHAR(20),
    p_birthdate DATE
)
AS $$
BEGIN
    INSERT INTO customer(id, firstName, lastName, phone, birthdate)
    VALUES (p_id, p_firstName, p_lastName, p_phone, p_birthdate);
END;
$$ LANGUAGE plpgsql;

-- Procedimiento para eliminar cliente
CREATE OR REPLACE PROCEDURE del_client(p_id VARCHAR(50))
AS
$$
BEGIN
	DELETE FROM customer WHERE ID = p_id;
END;
$$
LANGUAGE plpgsql;

-- Procedimiento para actualizar cliente
CREATE OR REPLACE PROCEDURE update_client(
	p_id VARCHAR(50),
	p_firstName VARCHAR(20),
	p_lastName VARCHAR(20),
	p_phone VARCHAR(20),
	p_birthdate DATE
)
AS
$$
BEGIN
	UPDATE customer
	SET
		firstName = p_firstName,
		lastName = p_lastName,
		phone = p_phone,
		birthdate = p_birthdate
	WHERE id = p_id;
END;
$$
LANGUAGE plpgsql;

-- Procedimiento para obtener cliente por id
CREATE OR REPLACE FUNCTION get_client(p_id VARCHAR(50))
RETURNS TABLE(
	id VARCHAR(50),
    firstname VARCHAR(20),
    lastname VARCHAR(20),
    phone VARCHAR(20),
    birthdate DATE
) AS
$$
BEGIN
	RETURN QUERY SELECT c.* FROM customer c WHERE c.id = p_id; 
END;
$$
LANGUAGE plpgsql;

-- Procedimiento para listar clientes ordenados por fecha de nacimiento descendente
CREATE OR REPLACE FUNCTION list_client_by_birthdate()
RETURNS TABLE (
	id VARCHAR(50),
    firstName VARCHAR(20),
    lastName VARCHAR(20),
    phone VARCHAR(20),
    birthdate DATE
) AS
$$
BEGIN
	RETURN QUERY SELECT * FROM customer ORDER BY birthdate DESC;
END;
$$
LANGUAGE plpgsql;


-- Procedimiento para listar clientes ordenados por id
CREATE OR REPLACE FUNCTION list_client_by_id()
RETURNS TABLE (
	id VARCHAR(50),
    firstName VARCHAR(20),
    lastName VARCHAR(20),
    phone VARCHAR(20),
    birthdate DATE
) AS
$$
BEGIN
	RETURN QUERY SELECT * FROM customer ORDER BY id;
END;
$$
LANGUAGE plpgsql;

-- Procedimiento para listar clientes ordenados por nombre de manera ascendente
CREATE OR REPLACE FUNCTION list_client_by_name()
RETURNS TABLE (
	id VARCHAR(50),
    firstName VARCHAR(20),
    lastName VARCHAR(20),
    phone VARCHAR(20),
    birthdate DATE
) AS
$$
BEGIN
	RETURN QUERY SELECT * FROM customer ORDER BY firstName, lastName;
END;
$$
LANGUAGE plpgsql;

CREATE OR REPLACE PROCEDURE add_client(
    p_id VARCHAR(50),
    p_firstName VARCHAR(20),
    p_lastName VARCHAR(20),
    p_phone VARCHAR(20),
    p_birthdate DATE
)
AS $$
BEGIN
    INSERT INTO customer(id, firstName, lastName, phone, birthdate)
    VALUES (p_id, p_firstName, p_lastName, p_phone, p_birthdate);
END;
$$ LANGUAGE plpgsql;

