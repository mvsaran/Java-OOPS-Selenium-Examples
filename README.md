# Java OOPS Selenium Examples

This repository demonstrates how core **Object-Oriented Programming (OOP)** principles can be implemented practically using **Java** and **Selenium WebDriver** for test automation.

---

## 📌 **What’s Included**

The examples in this project cover:

- **Encapsulation**: Restrict direct access to WebDriver instances and page elements.
- **Inheritance**: Use base classes for common functionality and extend them in page classes.
- **Abstraction**: Hide low-level Selenium calls behind clean, reusable methods.
- **Polymorphism**
  - **Method Overriding**: Customize or replace base class methods in child classes.
  - **Method Overloading**: Same method name with different parameters in utility classes.
- **Constructors**: Initialize WebDriver and page object dependencies with constructors.

---

## 📂 **Project Structure**

SeleniumOOPSUsage/
├── InheritedBasePage.java
├── EncapsulationLoginPage.java
├── MethodOverridingBaseTest.java
├── MethodOverloadingBrowserUtils.java
├── AbstractionDemo.java
├── ConstructorExample.java

- **Base classes**: Foundation for reuse (e.g., `InheritedBasePage`).
- **Page classes**: Implement real actions (e.g., `EncapsulationLoginPage`).
- **Utility classes**: Reusable helper methods (e.g., `MethodOverloadingBrowserUtils`).
- **Test classes**: Show how to use base classes and override methods.
