# user-management-system

## Overview

This RESTful API provides endpoints for basic CRUD operations on a user management system. It allows you to perform operations like creating, reading, updating, and deleting user information.

## Table of Contents

- [Features](#features)
- [Endpoints](#endpoints)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [Examples](#examples)
- [Contributing](#contributing)
- [License](#license)

## Features

- Create a new user
- Retrieve user information
- Update existing user details
- Delete a user

## Endpoints

- **Create User**
  - `POST /user/save`

- **Get User**
  - `GET /user/display/{userId}`
- **Get All User**
  - `GET /user/displayall`

- **Update User**
  - `PUT /user/update/{userId}`

- **Delete User**
  - `DELETE /user/delete/{userId}`

## Getting Started

### Prerequisites

- Java (version 17)
- Spring Boot (version 3.2.0)
- Database (MySQL)

### Installation

1. Clone the repository: `git clone https://github.com/shivdatt23/user-management-system.git`
2. Navigate to the project directory: `cd user-management-system`
3. Build the project: 
4. Run the application: 

## Usage

Make requests to the API using your preferred tool (e.g., Postman) or integrate it into your application.

## Examples

### Create User

```bash
postman POST  "Body: JSON"
'{
   
    "name":"shiv datt",
    "age":22,
    "email": "shiv@gmail.com",
    "password": "g22dd3",
    "mobile":9322228,
    "salary":23345
}'
 http://localhost:8080/user/save
