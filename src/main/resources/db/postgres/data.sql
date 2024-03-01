INSERT INTO customers (card_number, first_name, last_name) SELECT '123', 'John', 'Doe' WHERE NOT EXISTS (SELECT * FROM customers WHERE id=1);

INSERT INTO products (name, description) SELECT 'Tint', 'Lorem opsem rorem surrum' WHERE NOT EXISTS (SELECT * FROM products WHERE id=1);
INSERT INTO products (name, description) SELECT 'Lip', 'Dum dum dee dum' WHERE NOT EXISTS (SELECT * FROM products WHERE id=2);

INSERT INTO variants (product_id, name, description, price) SELECT 1, 'Light', 'Surrum opsem orem Lorem', 14000 WHERE NOT EXISTS (SELECT * FROM variants WHERE id=1);
INSERT INTO variants (product_id, name, description, price) SELECT 1, 'Dark', 'Opem suru rorm', 32000 WHERE NOT EXISTS (SELECT * FROM variants WHERE id=2);

INSERT INTO variants (product_id, name, description, price) SELECT 2, 'Red', 'Dee dum dum dum', 32000 WHERE NOT EXISTS (SELECT * FROM variants WHERE id=3);
