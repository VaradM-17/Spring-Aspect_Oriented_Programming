# Spring AOP Practice Example: Message Aspects

## Overview

This project is a simple **Spring AOP (Aspect-Oriented Programming)** practice example aimed at demonstrating the basic concepts of AOP within a Spring application. The primary focus is on using **@Before**, **@After**, and **@Around** advice types to simulate sending SMS messages during method executions, specifically for an account recharge and deactivation process.

The objective of this practice is to get hands-on experience with AOP concepts such as aspects, join points, advice, and weaving in Spring.

## Key Concepts

- **Aspect**: A module that encapsulates a cross-cutting concern, such as sending notifications or messages (in this case, SMS).
- **Join Point**: A point in the program where an aspect can be applied. Here, it is method execution.
- **Advice**: Defines the action to be taken at a join point. In this practice, three types of advice are used:
  - **@Before**: Executes before a method is run.
  - **@After**: Executes after a method finishes running.
  - **@Around**: Allows you to control the execution of a method, executing custom behavior before and after.
- **ProceedingJoinPoint**: Used in **@Around** advice to control the flow of method execution.
- **Weaving**: The process of linking the aspect to the target methods at runtime.

## Project Structure

1. **MessageAspects**: This is the aspect class that defines the cross-cutting concern (sending SMS messages before and after certain methods).
   - **@Around** advice is used to simulate sending messages before and after the `recharge` method of the `Account` class is executed.
   
2. **SpringConfigureFile**: The configuration class that enables Spring AOP and component scanning to ensure the aspect works properly.

3. **Account**: A simple class that represents a user account. The `recharge` method simulates a scenario where a user needs to recharge their account.

4. **Controller**: The main class where the Spring context is initialized and the `Account` bean is retrieved to call the `recharge` method.

## How It Works

1. The `recharge` method of the `Account` class is intercepted by the `MessageAspects` class.
   
2. The **@Around** advice runs:
   - **Before**: A message is printed indicating that the account is deactivated and the user needs to recharge.
   - The actual `recharge` method is executed.
   - **After**: Once the method execution is complete, a message is printed indicating that the account has been reactivated and the recharge is successful.

## Steps to Run the Project

1. **Clone the Repository**: Clone the repository to your local machine to begin working with the code.
   
2. **Build the Project**: 
   - Use **Maven** or **Gradle** to build the project and ensure all Spring AOP dependencies are included.
   - Ensure that you have Spring Framework set up properly.
   
3. **Run the Application**:
   - Execute the `Controller` class to see the AOP advice in action.
   - Observe the console output for the messages before and after the `recharge` method is executed.

4. **Expected Output**:
   - When you run the application, you should see messages indicating:
     - The account is deactivated and the user needs to recharge.
     - After the method runs, the account is reactivated, and the recharge is successful.

## Dependencies

- **Spring Framework**: Version 5.x or higher to support AOP functionality.
- **Java**: JDK 8 or higher.

## Conclusion

This project serves as a hands-on practice for learning and understanding **Spring AOP**. It demonstrates how to use AOP to modularize concerns like logging, messaging, and transactions without modifying the core logic of the application. By using aspects, advice, and join points, you can cleanly separate cross-cutting concerns and make your code easier to maintain.

For further information on Spring AOP, refer to the official [Spring AOP Documentation](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#aop).


