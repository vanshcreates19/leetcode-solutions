# Write your MySQL query statement below
SELECT b.name as Employee
FROM Employee as a
JOIN Employee as b
ON a.id=b.managerId 
WHERE b.salary>a.salary;
