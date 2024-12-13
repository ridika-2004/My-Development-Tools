#!/bin/bash

# Create README.md file
cat <<EOF > README.md
# Ride Fare Calculator

## Description
This is a Ride Fare Calculator for a ride-sharing application. It calculates the fare for both **Economy** and **Premium** rides, considering distance, time, and applicable surcharges and discounts.

## Features
- **Economy Ride**:
  - Base Fare: \$5.00
  - Per Mile Charge: \$1.75
  - Time Charge: \$0.50 per minute
  - **Discount**: 10% off if the ride is completed 10 minutes earlier than the estimated time.

- **Premium Ride**:
  - Base Fare: \$5.00
  - Per Mile Charge: \$3.00
  - Time Charge: \$0.50 per minute
  - **Surcharge**: 20% on the calculated fare
  - **Discount**: 10% off if the ride is completed 10 minutes earlier than the estimated time.

## Usage
1. Clone the repository.
2. Compile and run the Java files using the following commands:

```bash
javac RideCalculator.java App.java
java App
