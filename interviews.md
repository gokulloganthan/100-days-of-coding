# Interview Questions and Answers

## Company: taff

### 1. What is the difference between method overloading and overriding?

- **Method Overloading:** This is when multiple methods in the same class have the same name but different parameters (different type, number, or both).
- **Method Overriding:** This occurs when a subclass has a method with the same name, return type, and parameters as a method in its superclass. The method in the subclass provides a specific implementation for the method in the superclass.

### 2. Is Java String mutable or immutable?

- **Immutable:** Java Strings are immutable, meaning that once a String object is created, its value cannot be changed. Any modification to a String results in the creation of a new String object.

### 3. Which String method do you prefer when you are working with threads?

- When working with threads, it’s preferred to use `StringBuffer` or `StringBuilder`. `StringBuffer` is synchronized and thus thread-safe, whereas `StringBuilder` is not synchronized but can be used in a single-threaded environment for better performance.

### 4. What is middleware and Node.js? How are they both interlinked?

- **Middleware:** Middleware refers to software that acts as an intermediary, enabling communication and data management for distributed applications. It handles tasks such as authentication, logging, and session management.
- **Node.js:** Node.js is a runtime environment that allows developers to execute JavaScript code server-side. It's known for its non-blocking, event-driven architecture.
- **Interlink:** Middleware in Node.js is often used in web frameworks like Express.js, where middleware functions can intercept requests, process them, and pass them on to the next middleware or route handler.

## Coding Questions in JavaScript

### 1. Sort the employee name and place based on place

```javascript
let employees = [
  { name: 'John', place: 'New York' },
  { name: 'Jane', place: 'California' },
  { name: 'Doe', place: 'New York' },
  { name: 'Smith', place: 'Florida' }
];

employees.sort((a, b) => a.place.localeCompare(b.place));

console.log(employees);
