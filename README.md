<center>
<h1> 🏚️Job Search Portal</h1>
</center>
<center>
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
</center><br>
Job Search Portal is a Spring Boot application to find job.

---

## Framework Used
* Spring Boot

---

## Language Used
* Java

---

## Data Model
The Job class defined in the model packages, which has the following attributes with some validation:<br>

id : @Id<br> 
title<br>
description<br>
location<br>
salary : @Min(20000)<br>
companyEmail<br>
companyName<br>
employerName<br>
jobType : Enum<br>
appliedDate<br>


---

## Data Flow

1. The user sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.

4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

## Functions used :-

### API Endpoints :-
</br>

* PostMapping: /job 

This endpoint makes a call to method in JobService class which is connected to database. In database we add a new Job given through API.

* PostMapping: /jobs

This endpoint makes a call to method in JobService class which is connected to database. In database we add multiple new Jobs given through API.


* GetMapping: 

It has some GetMaping APIs which return us the result on the basis of spacified rules.


* PutMapping: 

It has some PutMaping APIs which can update the jobs description according to the our need.


* DeleteMapping: 

It has only two API in first API we can delete a Job bt their id,
and second API will delete the All Jobs from the DB.


---

## CrudRepository extends by IJobRepo interface.


We have used CrudRepository to implement some CRUD operation which is prewritten in JPA dependies.

---

## 📝Project Summary
I have create this application using Spring Boot.In this project we have one model class Job and its controller class, service class and repository which follows the MVC ruls.
In this project we can add new Jobs and find the available jobs, update the job description and we can also delete the jobs.

Thank You!