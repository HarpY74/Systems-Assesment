# Automated Testing Framework for Parabank

## Overview
This project is an automated testing framework designed for testing the Parabank online banking application. The framework uses **Selenium WebDriver** with **TestNG** to automate various functionalities such as registration, login, account services, and fund transfers.

## Technologies Used
- **Java** (Primary programming language)
- **Selenium WebDriver** (Browser automation)
- **TestNG** (Test execution and reporting)
- **Maven** (Dependency management)

## Project Structure
```
├── src/test/java/
│   ├── Pages/
│   │   ├── Runner.java
│   │   ├── OpenBrowser.java
│   │   ├── AccountServices.java
│   │   ├── Register.java
│   │   ├── LogIn.java
├── testng.xml
├── pom.xml
├── README.md
```

## Classes Description
### 1. **Runner.java**
This is the **main test runner** that executes the test cases using **TestNG**. It initializes the browser, executes test cases in a defined order, and verifies application functionalities.

#### **Test Cases:**
- `setCliclregister()`: Registers a new user.
- `setSetligin()`: Logs into the application.
- `setnewaccount()`: Opens a new account.
- `setTranfer()`: Transfers funds.
- `setRequestloan()`: Requests a loan.
- `setlogout()`: Logs out of the application.

### 2. **OpenBrowser.java**
Handles browser setup and initialization using **ChromeDriver**.

- Opens **Parabank website**.
- Maximizes the browser window.

### 3. **AccountServices.java**
Handles different account-related operations:
- `settranferloan()`: Transfers funds.
- `Requestloan()`: Requests a loan.
- `OpenNewacc()`: Opens a new bank account.
- `Logout()`: Logs out of the application.

### 4. **Register.java**
Handles the user registration process by filling out and submitting the registration form.

### 5. **LogIn.java**
Handles the user login process by entering credentials and logging into the system.

## How to Run the Tests
### **1. Using IntelliJ IDEA**
1. Open the project in **IntelliJ IDEA**.
2. Make sure **TestNG** is installed and configured.
3. Right-click on `testng.xml` → **Run 'testng.xml'**.

### **2. Using Maven**
Run the following command in the terminal:
```sh
mvn test
```

## Configuration & Dependencies
Make sure the following **TestNG** dependency is added in `pom.xml`:
```xml
<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.28.1</version>
    </dependency>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.9.0</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>javax.mail</groupId>
        <artifactId>mail</artifactId>
        <version>1.4.7</version>
    </dependency>
</dependencies>
```

## Notes
- Ensure **ChromeDriver** is installed and configured in the system PATH.
- Update the `driver.get("https://parabank.parasoft.com/parabank/index.html");` in `OpenBrowser.java` if the URL changes.

## Author
- Mohamed Elsaeed
- Contact: [muhamed.elsaeed74@gmail.com]


