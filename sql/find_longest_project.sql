SELECT ID, DATEDIFF(finish_date, start_date) AS DURATION FROM project WHERE DATEDIFF(finish_date, start_date) = (SELECT MAX(DATEDIFF(finish_date, start_date)) FROM project);