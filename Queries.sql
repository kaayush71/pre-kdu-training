SELECT e.employee_id, e.employee_name, d.department_name
FROM employee e
JOIN department d ON e.department_id = d.department_id;

SELECT *
FROM employee e
ORDER BY e.salary DESC;

SELECT d.department_name, AVG(e.salary) AS avg_salary
FROM employee e
JOIN department d ON e.department_id = d.department_id
GROUP BY e.department_id;