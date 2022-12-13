CREATE DATABASE employee;

USE employee;

CREATE TABLE department (
  department_id INT,
  department_name VARCHAR(50),
  PRIMARY KEY (department_id)
);

CREATE TABLE employee (
  employee_id INT,
  employee_name VARCHAR(50),
  salary FLOAT,
  department_id INT,
  PRIMARY KEY (employee_id),
  FOREIGN KEY (department_id) REFERENCES department(department_id)
);