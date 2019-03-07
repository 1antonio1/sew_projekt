CREATE DATABASE 1819_4ax_antoniojakova_scott;
USE 1819_4ax_antoniojakova_scott;

CREATE TABLE dept (
  DEPTNO int NOT NULL default 0,
  DNAME char(14) default NULL,
  LOC char(13) default NULL,
  PRIMARY KEY (DEPTNO)
);

INSERT INTO DEPT VALUES (10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO DEPT VALUES (20,'RESEARCH', 'DALLAS');
INSERT INTO DEPT VALUES (30,'SALES', 'CHICAGO');
INSERT INTO DEPT VALUES (40,'OPERATIONS', 'BOSTON');

CREATE TABLE emp (
  EMPNO int NOT NULL default 0000,
  ENAME char(10) default NULL,
  JOB char(9) default NULL,
  MGR int default NULL,
  HIREDATE datetime default NULL,
  SAL double default NULL,
  COMM double default NULL,
  DEPTNO int default NULL,
  PRIMARY KEY (EMPNO)
);

INSERT INTO emp VALUES (7369, 'SMITH', 'CLERK', 7902, '1980-12-17', 800.00, NULL, 20);
INSERT INTO emp VALUES (7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20', 1600.00, 300.00, 30);
INSERT INTO emp VALUES (7521, 'WARD', 'SALESMAN', 7698, '1981-02-22', 1250.00, 500.00, 30);
INSERT INTO emp VALUES (7566, 'JONES', 'MANAGER', 7839, '1981-04-02', 2975.00, NULL, 20);
INSERT INTO emp VALUES (7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28', 1250.00, 1400.00,
30);

INSERT INTO emp VALUES (7698,'BLAKE','MANAGER',7839,'1981-05-01',2850.00,NULL,30);
INSERT INTO emp VALUES (7782, 'CLARK', 'MANAGER', 7839, '1981-06-09', 2450.00, NULL, 10);
INSERT INTO emp VALUES (7788, 'SCOTT', 'ANALYST', 7566, '1982-12-09', 3000.00, NULL, 20);
INSERT INTO emp VALUES (7839, 'KING', 'PRESIDENT', NULL, '1981-11-17', 5000.00, NULL, 10);
INSERT INTO emp VALUES (7844, 'TURNER', 'SALESMAN', 7698, '1981-09-08', 1500.00, 0.00, 30);
INSERT INTO emp VALUES (7876, 'ADAMS', 'CLERK', 7788, '1983-01-12', 1100.00, NULL, 20);
INSERT INTO emp VALUES (7900, 'JAMES', 'CLERK', 7698, '1981-12-03', 950.00, NULL, 30);
INSERT INTO emp VALUES (7902, 'FORD', 'ANALYST', 7566, '1981-12-03', 3000.00, NULL, 20);
INSERT INTO emp VALUES (7934, 'MILLER', 'CLERK', 7782, '1982-01-23', 1300.00, NULL, 10);

CREATE TABLE salgrade (
  GRADE int NOT NULL default 0,
  LOSAL int default NULL,
  HISAL int default NULL,
  PRIMARY KEY  (GRADE)
);

INSERT INTO salgrade  VALUES (1,700, 1200);
INSERT INTO salgrade  VALUES (2,1201, 1400);
INSERT INTO salgrade  VALUES (3,1401, 2000);
INSERT INTO salgrade  VALUES (4,2001, 3000);
INSERT INTO salgrade  VALUES (5,3001, 9999);
