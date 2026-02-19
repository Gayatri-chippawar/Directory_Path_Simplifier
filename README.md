# 📁 Directory Path Simplifier (Using Stack in Java)
## 📌 Overview

This project implements a Unix-style directory path simplifier using the Stack data structure in Java.

It converts a given absolute path into its canonical (simplified) form by handling:

. → Current directory (ignored)

.. → Parent directory (pop from stack)

Multiple / → Treated as single separator

Trailing / → Removed in final output

## 🧠 Problem Statement

Given a string representing an absolute Unix-style path, simplify it.

Example

Input:

/a/./b/../../c/


Output:

/c

## ⚙️ Approach
🔹 Data Structure Used: Stack<String>

The stack helps simulate directory traversal:

Push valid directory names

Pop when encountering ..

Ignore .

## 🔎 Algorithm Steps

Initialize an empty stack.

Traverse the string manually (character by character).

Extract directory names between /.

Apply rules:

".." → Pop from stack (if not empty)

"." → Ignore

Valid directory → Push to stack

Reconstruct the path from stack.

Return final simplified path.

## 🧾 Code Explanation
✔ Method: getPath(String A)

Parses input path

Uses stack to maintain valid directories

Builds final canonical path

✔ main() Method

Tests the function with:

String str = "/a/./b/../../c/";

## 🧪 Sample Execution

Input:

/a/./b/../../c/


Step-by-step stack operations:

Operation	Stack
push a	[a]
ignore .	[a]
push b	[a, b]
pop (..)	[a]
pop (..)	[]
push c	[c]

Final Output:

/c

## ⏱ Time & Space Complexity
⏳ Time Complexity:

O(n)
Each character in the string is processed once.

📦 Space Complexity:

O(n)
In worst case, all directories are stored in stack.

## 🏗 Key Concepts Used

Stack Data Structure

String Traversal

Parsing

Simulation of Unix File System

Edge Case Handling

## 🎯 Edge Cases Handled

Multiple consecutive /

Root directory input ("/")

Excess .. beyond root

Trailing /

"." current directory references

## 🚀 Learning Outcomes

Practical use of Stack in real-world problems

Understanding canonical path normalization

String parsing without using split()

Clean handling of edge cases

## 🏁 Final Output Format

Always returns:

A valid absolute path

Starts with /

No trailing /

No . or ..
