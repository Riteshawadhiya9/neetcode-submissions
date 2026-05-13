-- -- Write your query below
-- CREATE TABLE customers(
--     customer_id INT,
--     year INT,
--     revenue  INT,
--     PRIMARY kEY(customer_id,year)
-- );

-- INSERT INTO customers (customer_id,year,revenue) VALUES (1,2019,100),(1,2020,50),(2,2020,-30),
SELECT customer_id
FROM customers
WHERE year = 2020
AND revenue > 0;