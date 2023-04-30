
# Job Portal

This is a small spring boot project is to search job in job portal based on location salary and title using CRUD operation.


## Resource used

**Framework:** SpringBoot

**Language:** Java

**Dependency:** Spring Boot DevTools , Spring Web , H2-Database , validation , Spring Boot Starter Data JPA


## Data Flow

**Controller** 

**Service** 

**Repository** 
## API Reference

#### Get job based on title

```http
  GET /bytitle/{title}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `Job`     | `string` | Return job with the title |

#### POST Job

```http
  POST /addjobs
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `JOb`     | `string` | Add All jobs |

#### Get based on location and salary

```http
  GET /locationbysalary/{location}/{salary}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `Job`    | `string` | Return job |

#### Delete job based on salary

```http
  DELETE /deletejob/{salary}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `job`    | `string` | delete job |

#### Update Job salary

```http
  Update /updatesalary
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `Job`     | `Double` | Update salary|

## Features

- Easy to search 
- Filter based on title , based on location and salary
- update job on portal based on id
- Delete job based on salary 

## New in this project

- I have used ENUM in this project which will hold the list of job types, we can access the job types based on there names or by the index starts with 0
- I have used H2 - Database in this project which will create seperate database for this project.
- I have used Starter Data JPA dependency along with h2 database im able to write custom query to fetch data from database
- I have used validation on few of the fields.


## Summary

This small springboot project will is created to search job in job portal, here we can search job based on title location and salary range, and we can add the job to job portal , we can update job using ID , we can filter the jobs based on salary.

