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

## 2. 📊 Dashboard – Real-Time Fraud Overview

Key Metrics Displayed:
Total transaction volume
Fraud blocked count
Critical alerts
Overall risk average

Traffic Simulation:
Start / Stop network traffic
Single transaction simulation
Live fraud-safe distribution monitoring

Visual Analytics:
Fraud vs Safe distribution
Transaction health indicators
System status (Database connectivity)

## 3. 📜 Transaction History (MySQL)

Persistent MySQL-backed transaction storage
Searchable and filterable transaction list

Displays:
Transaction ID
Merchant
Location
Amount
Risk level (LOW / MEDIUM / HIGH)
Approval status

One-click transaction drill-down
Designed for audit & compliance workflows

## 4. 🧪 Manual Validation Engine

Allows analysts to manually validate transactions using rule-based diagnostics.

Inputs:
Account ID
Merchant / Terminal
Transaction amount
Geo-location

Outputs:
Fraud score (0–100)
Risk level classification
Block / Approve decision
Explainable findings, such as:
High-value threshold breach
Integer-amount anomaly
Location deviation

This module focuses on explainable fraud detection, a key requirement in real banking systems.

## 5. 🚨 Risk Alerts & Incident Reports

Active high-severity fraud alerts
Severity scoring (e.g., 60+, 65+)
Detailed internal audit findings

Investigator actions:
Dismiss
Investigate history
Export report as PDF


## 6. 🤖 ML Analytics & Model Performance

Dedicated analytics panel showing model health and reliability.

Metrics:
Global accuracy
False positive rate
Precision score
Recall score

Visuals:
Accuracy trend (24h telemetry)
Feature importance weighting:
Merchant history
Transaction amount
Geo-location
Time of day
Account age

This section demonstrates ML observability, not just prediction.

##  7. 🏗️ System Architecture
Controller Layer (REST + Views)
│
├── Fraud Detection Engine (Rule-Based Logic)
├── Transaction Service Layer
├── Alert & Risk Management Module
├── PDF Report Generator
│
├── JPA Repository (MySQL)
│
└── Frontend (Thymeleaf / JS / Charts)


##  8. 🛢️ MySQL Database Integration

Configured using Spring Data JPA
Automatically creates table
Saves each manual-check transaction

## 🛠️ Technologies Used

Backend:
Java 21
Spring Boot 3
Spring MVC
Spring Data JPA

Frontend:
HTML
CSS
JavaScript
Chart.js
Thymeleaf

Database:
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

## 🖼️ Application Screenshots
<img width="1920" height="1080" alt="Screenshot (301)" src="https://github.com/user-attachments/assets/331594a4-82f4-45c6-bf93-5984e53da2d9" />
<img width="1920" height="1080" alt="Screenshot (302)" src="https://github.com/user-attachments/assets/759910e0-1c40-4435-931a-6551b36878c5" />
<img width="1920" height="1080" alt="Screenshot (303)" src="https://github.com/user-attachments/assets/ee40b88b-26da-48ef-af37-46323a0da20e" />
<img width="1920" height="1080" alt="Screenshot (304)" src="https://github.com/user-attachments/assets/0ff7e7cd-2d88-47f5-8850-7cde9917169b" />
<img width="1920" height="1080" alt="Screenshot (305)" src="https://github.com/user-attachments/assets/f908b335-081b-46d1-8e4d-c2e9fb8e0d7d" />
<img width="1920" height="1080" alt="Screenshot (306)" src="https://github.com/user-attachments/assets/4eadbb5e-84e5-4132-8a7c-7f5196fa1b98" />
<img width="1920" height="1080" alt="Screenshot (311)" src="https://github.com/user-attachments/assets/c05b205b-ffcd-40f4-841c-32fd4d130406" />
<img width="1920" height="1080" alt="Screenshot (307)" src="https://github.com/user-attachments/assets/e50e2b2b-c005-402c-bae8-da29d3152b1f" />
<img width="1920" height="1080" alt="Screenshot (309)" src="https://github.com/user-attachments/assets/877f6e7f-404b-42e8-aba1-31b6d53c373c" />
<img width="1920" height="1080" alt="Screenshot (310)" src="https://github.com/user-attachments/assets/fc8a7e67-2e2d-45de-b2db-2a36444d45fe" />



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








