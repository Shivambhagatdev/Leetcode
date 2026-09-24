# Write your MySQL query statement below
DELETE e
FROM Person e 
JOIN Person p
ON p.email=e.email
WHERE e.id>p.id
