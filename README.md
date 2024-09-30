# SOLID Principles in object-oriented design

This repository contains examples and explanations of the SOLID design principles using Java. SOLID principles are essential guidelines for writing clean, maintainable, and scalable code. Each principle is demonstrated with clear code examples, showing both good and bad implementations.

## Table of Contents
- [Introduction](#introduction)
- [Single Responsibility Principle (SRP)](#single-responsibility-principle-srp)
- [Open/Closed Principle (OCP)](#openclosed-principle-ocp)
- [Liskov Substitution Principle (LSP)](#liskov-substitution-principle-lsp)
- [Interface Segregation Principle (ISP)](#interface-segregation-principle-isp)
- [Dependency Inversion Principle (DIP)](#dependency-inversion-principle-dip)
- [Conclusion](#conclusion)

## Introduction
SOLID is an acronym that represents five principles of object-oriented design. These principles help developers to create more understandable, flexible, and maintainable systems. The goal of this repository is to demonstrate how to apply these principles using practical examples in Java. Each example includes a brief explanation, code, and common mistakes to avoid.


## Single Responsibility Principle (SRP)

The Single Responsibility Principle states that a class should have one, and only one, reason to change. This means that every class should only have one job or responsibility.

### Example:
```java
public class User {
    private String name;
    private String email;

    // Methods to get and set user data
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}

public class EmailService {
    public void sendEmail(String emailAddress, String message) {
        // Code to send an email
    }
}
```


## Open/Closed Principle (OCP)
The Open/Closed Principle states that software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.

### Example :
```java
public abstract class Shape {
    public abstract double calculateArea();
}

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
```


## Liskov Substitution Principle (LSP)
The Liskov Substitution Principle states that objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program.

### Example :
```java
public abstract class Shape {
    public abstract double area();
}

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    @Override
    public double area() {
        return  this.width * this.height;
    }
    
}

public class Square extends Rectangle {

    public Square(double side){
        super(side, side);
    }

    @Override
    public void setWidth(double width){
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(double height){
        super.setHeight(height);
        super.setWidth(height);
    }
    
}
```


## Interface Segregation Principle (ISP)
The Interface Segregation Principle states that no client should be forced to implement methods it does not use. Instead of having one large interface, it's better to have multiple smaller ones.

### Example :
```java
public interface Printer {
    void print(Document document);
}

public interface Scanner {
    void scan(Document document);
}

public interface Fax {
    void fax(Document document);
}

public interface DuplexPrinter {
    void printDuplex(Document document);
}

public class SimplePrinter implements Printer {
    @Override
    public void print(Document document) {
        // Implementation for printing
    }
}

public class MultiFunctionPrinter implements Printer, Scanner, Fax, DuplexPrinter {
    @Override
    public void print(Document document) {
        // Implementation for printing
    }

    @Override
    public void scan(Document document) {
        // Implementation for scanning
    }

    @Override
    public void fax(Document document) {
        // Implementation for faxing
    }

    @Override
    public void printDuplex(Document document) {
        // Implementation for duplex printing
    }
}
```


## Dependency Inversion Principle (DIP)
The Dependency Inversion Principle states that high-level modules should not depend on low-level modules. Both should depend on abstractions.

### Example :
```java
public interface UserRepository {
    User getUserById(int id);
}

public class DatabaseUserRepository implements UserRepository {
    @Override
    public User getUserById(int id) {
        // Code to fetch user from database
    }
}

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(int id) {
        return userRepository.getUserById(id);
    }
}
```


## Conclusion
By applying the SOLID principles, developers can create systems that are more maintainable, scalable, and flexible. This repository provides a detailed understanding of how to use these principles with practical examples in Java.

## Learn More

For detailed explanations and articles on software development, design principles, and best practices, feel free to visit my [dev.to solid principles](https://dev.to/muzammilnm).
