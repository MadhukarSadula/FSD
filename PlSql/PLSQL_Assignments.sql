select last_name || ',' || ' ' || job_id "Employee and Title" from HR.EMPLOYEES;


select EMPLOYEE_ID || ',' || FIRST_NAME || ',' || LAST_NAME || ',' || EMAIL || ',' || PHONE_NUMBER || ',' || HIRE_DATE || ',' || JOB_ID  ||',' || SALARY ||',' || COMMISSION_PCT ||',' || MANAGER_ID ||',' || DEPARTMENT_ID "Employee" from HR.EMPLOYEES;


select last_name, salary from HR.EMPLOYEES where salary not between 5000 and 12000;



select last_name,job_id,start_date from HR.EMPLOYEES where hire_date between TO_DATE('20/02/1998', 'DD/MM/YYYY') and TO_DATE('01/05/1998', 'DD/MM/YYYY') order by start_date asc;



select last_name,department_id from HR.EMPLOYEES where department_id in (20,50) order by last_name asc;



select last_name,job_id from HR.EMPLOYEES where MANAGER_ID is null;



select last_name,salary,commission from HR.EMPLOYEES where commission not null order by salary, commission desc;



select employee_id,last_name,salary,ROUND(salary * 1.15, 0) "New Salary" from HR.EMPLOYEES;



select employee_id,last_name,salary,ROUND(salary * 1.15, 0) "New Salary",(salary * 1.15 - salary) "Increase" from HR.EMPLOYEES;



select first_name "Name",LENGTH(first_name) "Length" from HR.EMPLOYEES where first_name like 'J%' or first_name like 'M%' or first_name like 'A%' order by first_name;



select last_name,department_id from HR.EMPLOYEES where last_name like '%a%';