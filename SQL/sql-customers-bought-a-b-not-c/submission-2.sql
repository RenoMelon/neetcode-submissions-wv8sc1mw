-- Write your query below
SELECT customers.customer_id, customers.customer_name
FROM customers
JOIN orders ON customers.customer_id = orders.customer_id
GROUP BY customers.customer_id, customers.customer_name
HAVING
    SUM(CASE WHEN orders.product_name = 'A' THEN 1 ELSE 0 END) > 0
    AND
    SUM(CASE WHEN orders.product_name = 'B' THEN 1 ELSE 0 END) > 0
    AND
    SUM(CASE WHEN orders.product_name = 'C' THEN 1 ELSE 0 END) = 0
ORDER BY customers.customer_name ASC;