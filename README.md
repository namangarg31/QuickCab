
# QuickCab

QuickCab is a backend service built with Java Spring Boot, designed to handle the core functionalities of a cab booking platform. It includes a wide range of essential features typically found in modern ride-sharing applications:

*JWT-based Authentication & Refresh Token Support:* Ensures secure user authentication and provides seamless session management with refresh tokens.

*Robust Security & Role-based Authorization:* Implements secure RESTful APIs with fine-grained access control using Spring Security and role-based permissions to protect endpoints.

*Geospatial Database Integration:* Utilizes PostgreSQL with PostGIS to store and process geospatial data, enabling features like location-based services and real-time geolocation tracking.
Distance Calculations with OSRM: Leverages Open Source Routing Machine (OSRM) for efficient and accurate distance and route calculations


## Tech Stack

Java, Spring Boot, Spring Security, JPA and Hibernate, Mockito, PostgreSQL and AWS.


## Deployment

Deployment is managed using AWS Elastic Beanstalk for application hosting, AWS CodePipeline for continuous integration and deployment (CI/CD), and AWS RDS for PostgreSQL database management

**Swagger Live Link :** http://quickcab.ap-south-1.elasticbeanstalk.com/swagger-ui/index.html#/


## UML Diagram

![Image](https://github.com/user-attachments/assets/d20ebe9f-18bd-447a-a7fd-9f8ca8266cd2)


