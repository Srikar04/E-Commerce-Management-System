# E-Commerce-Management-System

Project Name: E-Commerce Management System

Team Type: Individual

Name and Id Number: Mellachervu Srikar (21MCME19)

Technologies Used: Java

Commands to Run the files: 
    • javac *. java
    • java Login

Passwords :
Password for Administrator is 123456

Project Description :
    In this project, I have designed an e-commerce application that allows customers to browse and purchase products from the inventory. The application is divided into five main classes: Login, Customer, Administrator, Inventory and Cart Class. Inventory consists of a Collection of Product objects. The Product class is the base class, while the Electronics, Food, Book and Clothing classes inherit from it and product class implements an interface called Discountable.

Login Class: This is the Main class that again redirects users to Customer and Administrator Classes.

Administrator Class: The Administrator class is a crucial component of the project, responsible for managing and controlling the inventory of products

    • Manage the inventory of the online store.
    • Add new products to the inventory.
    • Remove existing products from the inventory.
    • Display all products in the inventory.
    • Restock items in the inventory.
    • Change prices of products in the inventory.
    • Apply discounts to products in the inventory.

Customer Class: As its name suggests it contains everything a customer can do.
    • Add a product to Cart
    • Remove a product from the Cart
    • View all the items in the cart
    • CheckOut

Inventory Class:  This class contains the collection of products and is used by administrator to perform operations. 

Cart Class: The Cart class manages the customer's shopping cart and keeps track of the products and their quantities. It also allows customers to remove items from their cart and display the total cost of their order.


Usage of Inheritance And polymorphism:

I have used inheritance in this project to define specialized classes for Electronics, Food, Clothing, Book and so on that they inherit common properties and behaviors from the Product class. This approach allowed me to avoid code duplication and reduce complexity.

	Furthermore, I have used polymorphism in this project to create a flexible and extensible system.  In Inventory Class all different children of Product class are stored in a collection of Products. The Product class is a generic class that can be used to represent any product, while the specialized classes like Electronics and Food add additional properties and methods specific to their respective types of products. 

I have also used encapsulation in this project to hide the implementation details of the classes from other parts of the application. This approach promotes code reusability, improves maintainability, and makes it easier to debug issues.

Conclusion : 

 In conclusion, this e-commerce application demonstrates the use of object-oriented programming concepts such as inheritance, polymorphism, and encapsulation to create a flexible and extensible system.



























                   
