# Product Management System

Day 2 of 10 Days Coding Challenge

What I have learned in day 2 ? 

   How to thing for create a application like for which action we need to create a class and so on.
   Main Class of our appplication is like Manager so that we don't dump any punch of code in Main class.
   We have do some self learning for improve our process of learning

Assignment 2

- Write a method that returns all the items(products) in the given place.
- Write a method that returns all the items(products) which are out of warranty year.
- Use Stream API for above two methods.

I learned Stream API from Telusko YT channel and researched more things through online so that i can get clarity of Stream API

What is Stream API ?

   The Stream API is a powerful feature introduced in Java 8 that allows you to process collections of data in a functional and declarative manner. It provides a set of operations that can be chained together to perform complex data processing tasks on collections, such as filtering, mapping, sorting, and reducing. Eg : Water flow inside the pipe.

### `getPlace(String place)`<br/>
- This is method(function) get place as parameter and return the product list at that place.
- I made this get place from user and convert into lowercase, so that we can easly find the place without case sensitive.

### `getProductsOutOfWarranty(int year)` <br/>
- This is method get the product of warranty product list.
- Here I have used time package to get current year and find the out of warrenty products list.
