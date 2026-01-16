# 🌐 **Digital Banking Fraud Detection And Simulation Engine**

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-brightgreen?style=for-the-badge&logo=springboot)
![MySQL](https://img.shields.io/badge/MySQL-8+-blue?style=for-the-badge&logo=mysql)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-Server--Side-green?style=for-the-badge&logo=thymeleaf)
![Chart.js](https://img.shields.io/badge/Chart.js-Analytics-red?style=for-the-badge&logo=chartdotjs)
![Status](https://img.shields.io/badge/Project-Active-success?style=for-the-badge)
![Build](https://img.shields.io/badge/Build-Maven-blueviolet?style=for-the-badge&logo=apachemaven)
![License](https://img.shields.io/badge/License-MIT-black?style=for-the-badge)

A full–stack banking fraud detection simulator built using Spring Boot, Java, Thymeleaf, and MySQL.
The system allows real-time dashboards, manual fraud checking, transaction history storage, PDF report generation and ML performance analytics.

# 🎯 Project Objectives

1.Detect and assess high-risk financial transactions
2.Provide manual fraud validation with explainable risk reasons
3.Maintain a persistent transaction audit trail
4.Offer real-time dashboards & alerts
5.Visualize ML model health and performance metrics
6.Generate investigation-ready PDF reports

# 🚀 Features

##  1. 🔐 Authentication & Access Control

Secure login portal
Role-based access (Admin / Analyst ready)
Session termination support
Backend-controlled routing
![Login Page] <img width="1920" height="1080" alt="Screenshot (301)" src="https://github.com/user-attachments/assets/0624ca16-d113-4f08-bb5c-fae0363a7da3" />

## 🧾 2. PDF Report Generation

Creates a complete transaction fraud report.
Includes:
Timestamp
Transaction details
Amount, Merchant, Channel, Location
Fraud Score
Status (SAFE/FRAUD)
Reason list
Users can download the report with one click.

## 📜 3. Transaction History (MySQL)

Each transaction is automatically saved.
History page shows:
Transaction ID
Account ID
Amount
Merchant
Fraud Score
Status
Timestamp

## 🪟 4. Detailed Popup Modal

Click any row in history table to see full details.
Popup adapts to dark mode.
Clean and responsive.

## 🌓 5. Light/Dark Mode Support

Works on:
Dashboard
Manual Check Page
History Page
Popup Modal

Adjusts:
Background
Text color
Table styling
Popup design

## 📊 6. Dashboard with Charts

Includes interactive visual charts using Chart.js
Shows sample fraud-safe ratios and transaction patterns.

## 🏗️ 7. Spring Boot Architecture
Controller (REST + Pages)
|
|-- FraudDetector (Logic)
|
|-- Repository (MySQL)
|
|-- Thymeleaf Frontend

## 🛢️ 8. MySQL Database Integration

Configured using Spring Data JPA
Automatically creates table
Saves each manual-check transaction

## 🛠️ Technologies Used

Backend
Java 21
Spring Boot 3
Spring MVC
Spring Data JPA

Frontend
HTML
CSS
JavaScript
Chart.js
Thymeleaf

Database
MySQL 8+

# Setup Instructions
## 1. Clone the repo
git clone https://github.com/your-username/fraud-sim-engine.git

## 2. Configure MySQL
Edit application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/frauddb
spring.datasource.username=root
spring.datasource.password=yourpassword

## 3. Run the Application
mvn spring-boot:run

## 4. Access in Browser
http://localhost:8080/
<img width="1920" height="1080" alt="Screenshot (233)" src="https://github.com/user-attachments/assets/5570bdce-6f80-433d-b724-dbc2aefa328e" />
<img width="1920" height="1080" alt="Screenshot (234)" src="https://github.com/user-attachments/assets/4407954e-4fbf-4c07-a7c8-2591c8f3cd89" />
<img width="1920" height="1080" alt="Screenshot (235)" src="https://github.com/user-attachments/assets/3bfcd4ef-82ee-46b2-aedd-475f2598e673" />
<img width="1920" height="1080" alt="Screenshot (236)" src="https://github.com/user-attachments/assets/c8d2d2c1-518d-48e9-9746-3b9634cddd95" />
<img width="1920" height="1080" alt="Screenshot (237)" src="https://github.com/user-attachments/assets/aa8eedd2-84f7-4199-9824-7b878b431cb5" />
<img width="1920" height="1080" alt="Screenshot (238)" src="https://github.com/user-attachments/assets/b94a80d6-98fb-41b2-bcd8-4438cafdab33" />
<img width="1920" height="1080" alt="Screenshot (239)" src="https://github.com/user-attachments/assets/a8af17da-8a1a-4001-ae12-c87f8bdce136" />
<img width="1920" height="1080" alt="Screenshot (240)" src="https://github.com/user-attachments/assets/1161a642-1ca8-4366-b730-6ad6e65a130d" />
<img width="1920" height="1080" alt="Screenshot (241)" src="https://github.com/user-attachments/assets/b50f517b-fce3-407a-8029-408df9af8b72" />
<img width="1920" height="1080" alt="Screenshot (230)" src="https://github.com/user-attachments/assets/5268233a-8c01-4152-923c-a5828d5af339" />








