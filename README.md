# 📽️ MovieApp-Backend Project  

This project is a backend system similar to IMDb, designed to store movie and actor information while allowing users to search, rate, and retrieve data efficiently. Various data structures have been implemented to enhance performance and ensure efficient data management.  

## 🚀 Technologies & Data Structures Used  

- **📌 Binary Search Tree (BST)**  
  - Separate BSTs are used for storing actors (`Actor`) and movies (`Film`).  
  - Enables fast searching of actors and movies by name.  

- **📌 AVL Tree**  
  - Ensures that the BST remains balanced.  
  - Guarantees **O(log n)** time complexity for search, insertion, and deletion operations.  

- **📌 Hash Table**  
  - Stores user reviews and ratings for fast retrieval.  
  - Enables quick access to feedback for movies and actors.  

- **📌 Priority Queue**  
  - Used to rank and display the highest-rated movies dynamically.  

- **📌 Heap (Min-Heap & Max-Heap)**  
  - **Max-Heap** is used for listing the most popular movies, while **Min-Heap** helps identify the lowest-rated ones.  

## 🎯 Features  

✔ **Movie & Actor Search** → Users can search for movies and actors by name or ID. *(BST)*  
✔ **Dynamic Movie Rating** → Users can rate movies, and scores are updated instantly. *(Heap, Hash Table)*  
✔ **Top 10 Movies** → Displays the highest-rated movies in real time. *(Max-Heap, Priority Queue)*  

This project provides a **scalable** structure capable of handling **large datasets efficiently** by leveraging **advanced data structures**.
