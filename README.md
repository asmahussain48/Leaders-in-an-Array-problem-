# 📊 Leaders in an Array
Difficulty: Easy
Accuracy: 29.94%
Submissions: 469K+
Points: 2

# 🧩 Problem Statement
Given an array A of positive integers, your task is to find the leaders in the array.

An element of the array is a leader if it is greater than or equal to all the elements to its right side.
The rightmost element is always considered a leader.

# 🧠 Example
Input
makefile
Copy
Edit
n = 6  
A[] = {16, 17, 4, 3, 5, 2}
Output
Copy
Edit
17 5 2
# Explanation
The first leader is 17, since it is greater than all elements to its right.

The next leader is 5.

The last element 2 is always a leader by definition.

# 🚀 How to Solve
You can solve this using a reverse traversal of the array while keeping track of the maximum element seen so far.
