# Write your MySQL query statement below
SELECT firstName,lastName,city,state
FROM person
LEFT JOIN Address
ON person.personid=Address.personid;