
<h1 align="center">Budget Tracker - Console Java</h1>

<div align="center">
    <img src="https://github.com/user-attachments/assets/b79e6882-623d-4d7b-a532-0a8880879fb1" alt="budget output" width="500px">
</div>

---
<h2 align="center">Description</h2>

<p align="left">
    This is a simple console-based <strong>Budget Tracker Application</strong> written in Java. It allows users to:
</p>

<ul align="left">
    <li>Add categories with expected spending limits.</li>
    <li>View current spending and limits in a structured table.</li>
    <li>Update spending for specific categories.</li>
    <li>Display a pie chart summary of your spendings.</li>
</ul>

---

<h2 align="center">File Structure</h2>

<div align="left">
    <ul>
        <li><strong>Budget.java</strong>: Contains the core functionality, such as adding categories, viewing spending, and updating spendings.</li>
        <li><strong>utils</strong>: A folder containing helper classes:</li>
        <ul>
            <li><strong>BasicUtils.java</strong>: Handles user input and other utility functions.</li>
            <li><strong>BasicFileUtils.java</strong>: Manages file read/write operations.</li>
            <li><strong>AdvancedFileUtils.java</strong>: Provides additional file management utilities.</li>
        </ul>
    </ul>
</div>


---

<h2 align="center">Features</h2>

<div align="left">
    <ol>
        <li><strong>Add Categories</strong>: Set categories and expected spending limits.</li>
        <li><strong>Update Spending</strong>: Record your spendings for each category.</li>
        <li><strong>View Spending Table</strong>: Display spending information in a formatted table.</li>
        <li><strong>Pie Chart Visualization</strong>: Visualize spending as a console-based pie chart.</li>
    </ol>
</div>


---
<h2 align="center">Example Data Format</h2>
The spending data is stored in a file in the following format:

```
movies,300,150
food,500,200
ride,200,50
```
---
<h2 align="center">Example Table Output</h2>

Here is how the spending table looks in the console:
```
+----------------+----------------------+----------------+
|    Category    | Expected Spending   | Your Spendings |
+----------------+----------------------+----------------+
| movies         | 300                 | 150            |
| food           | 500                 | 200            |
| ride           | 200                 | 50             |
+----------------+----------------------+----------------+
```
---
<h2 align="center">How to Run</h2>
  
1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/My-Development-Tools.git
   ```

2. Navigate to folder:
   ```bash
   cd Budget Tracker - Console Java
   ```

3. Compile the Java files:
   ```bash
   javac codes/*.java utils/*.java
   ```

4. Run the application:
   ```bash
   java codes.Main
   ```

---
<h2 align="center">Dependencies</h2>
This project uses Java and no external libraries are required.

<h2 align="center">Contributing</h2>
Feel free to fork this repository, make improvements, and submit pull requests.

<h2 align="center">License</h2>
This project is for personal use.
