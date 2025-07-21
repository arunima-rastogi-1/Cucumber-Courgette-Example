# Courgette Test Runner  

This repository contains a **Courgette** test runner configured with **Cucumber** and **TestNG** to enable parallel execution of scenarios.

## 🚀 Features
- **Parallel Execution**: Runs scenarios in multiple threads.
- **Automatic Retry**: Reruns failed scenarios.
- **Detailed Reporting**: Generates JSON and HTML reports.
- **TestNG Integration**: Uses `TestNGCourgette` for execution.

## 🛠️ Setup & Installation

### 1️⃣ Prerequisites
Ensure you have the following installed:
- **Java** (JDK 8 or later)
- **Maven**


### 4️⃣ Run Tests
Use Maven to execute the tests:

```sh
mvn test
```

## 📊 Test Reports
After execution, reports are generated in:
- **HTML Report**: `target/cucumber-html-report/index.html`
- **JSON Report**: `target/cucumber.json`

## 📜 License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

