# Write your MySQL query statement below
select email
FROM person
GROUP BY email
HAVING COUNT(email)>1;
