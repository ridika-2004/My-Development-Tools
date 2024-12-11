#include <iostream>
#include <cstdlib>
#include <iomanip>
using namespace std;

void clearTerminal() {
    cout << "\033[2J\033[1;1H"; // Clear screen and move cursor to home
}

int main() {
    double height, weight;

    clearTerminal();
    
    // Input section
    cout << "-----------------------------------------" << endl;
    cout << "            BMI CALCULATOR               " << endl;
    cout << "-----------------------------------------" << endl;
    cout << "Enter your height (in meters): ";
    cin >> height;
    cout << "Enter your weight (in kg): ";
    cin >> weight;

    double bmi = weight / (height * height);

    cout << "\nYour BMI is: " << fixed << setprecision(2) << bmi << endl;
    cout << endl;

    cout << "____________________________________________________________________________" << endl;
    cout << "|                             BMI Classification                          |" << endl;
    cout << "____________________________________________________________________________" << endl;
    cout << "|   BMI Range (kg/m^2)          |               State                     |" << endl;
    cout << "____________________________________________________________________________" << endl;
    cout << "| Less than 18.5                | Underweight                             |" << endl;
    cout << "| 18.5 - 24.9                   | Healthy                                 |" << endl;
    cout << "| 25 - 29.9                     | Overweight                              |" << endl;
    cout << "| 30 or greater                 | Obese                                   |" << endl;
    cout << "____________________________________________________________________________" << endl;


    string state;
    if (bmi < 18.5) {
        state = "Underweight";
    } else if (bmi >= 18.5 && bmi <= 24.9) {
        state = "Healthy";
    } else if (bmi >= 25 && bmi <= 29.9) {
        state = "Overweight";
    } else {
        state = "Obese";
    }

    cout << "\nBased on your BMI, you are classified as: " << state << endl;
    cout << "Stay healthy!" << endl;

    return 0;
}
