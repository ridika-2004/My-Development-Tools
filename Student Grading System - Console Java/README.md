cat << 'EOF' > README.md
# Grade Management System

This is a **Java-based application** for managing grades of students across multiple courses. It calculates the **total marks**, determines the **percentage**, and assigns a **grade** based on the given criteria.

## Features
- Takes marks input for 5 courses:
  - **Attendance** (out of 30)
  - **Quiz** (out of 45)
  - **Midterm** (out of 75)
  - **Final Exam** (out of 150)
- Dynamically calculates the **total marks** and **percentage**.
- Assigns letter grades (A+ to F) based on the percentage.

## Grade System
| Percentage | Grade |
|------------|-------|
| 80%+       | A+    |
| 75%-79%    | A     |
| 70%-74%    | A-    |
| 65%-69%    | B+    |
| 60%-64%    | B     |
| 55%-59%    | B-    |
| 50%-54%    | C+    |
| 45%-49%    | C     |
| 40%-44%    | D     |
| Below 40%  | F     |

## How to Use
1. Compile the program:
   ```bash
   javac Grade.java
