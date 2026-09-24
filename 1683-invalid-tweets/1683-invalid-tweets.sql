# Write your MySQL query statement below
SELECT e.tweet_id
FROM Tweets e
WHERE LENGTH(e.content)>15