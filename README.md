# 🔍 Smart Syntax Validator (Java)

A lightweight Java application that validates mathematical and code expressions for balanced brackets using the **Stack Data Structure (LIFO)**.

## 📌 Features
- Validates standard bracket pairs: `()`, `{}`, and `[]`.
- Detects mismatched, unclosed, or misplaced brackets.
- Handles custom expressions with numbers, variables, and operators.
- Provides informative feedback when no brackets are present.

## 🛠️ Data Structure & Logic
- **Stack (LIFO):** Pushes opening brackets onto the stack and pops them to verify against corresponding closing brackets.
- **Time Complexity:** $O(N)$ where $N$ is the length of the expression.
- **Space Complexity:** $O(N)$ auxiliary stack space in the worst case.

## 🚀 How to Run
1. Clone the repository or download `SyntaxValidator.java`.
2. Open terminal and compile:
   ```bash
   javac SyntaxValidator.java
