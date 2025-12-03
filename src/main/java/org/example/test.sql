UPDATE order_table
SET status = 'shipped'
WHERE order_id = 12345 AND order_date < '2024-01-01';