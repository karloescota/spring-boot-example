INSERT INTO customers (card_number, first_name, last_name) SELECT '123', 'John', 'Doe' WHERE NOT EXISTS (SELECT * FROM customers WHERE id=1);
