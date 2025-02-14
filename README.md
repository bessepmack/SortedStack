# Project 05: Stack-based Integer Sorter

## Description
This project is a command-line Java program that reads a list of integer numbers from user input, stores them in a `Stack`, sorts them in ascending order, and prints the sorted stack.

It demonstrates the use of:
- Java Collections Framework (`Stack` and `Collections.sort()`)
- Standard input reading with `Scanner`

## Features
- Reads integers from standard input and stores them in a `Stack`.
- Sorts the stack in ascending order using `Collections.sort()`.
- Prints the sorted stack to the console.

## How to Run

### Step 1: Compilation
Use the following command to compile the program:
```sh
javac SortedStack.java
```

### Step 2: Execution
Run the compiled program with:
```sh
java SortedStack
```

### Step 3: Example Input and Output
**Input:**
```
Enter integers separated by spaces (press Enter to finish):
34 12 78 1 56 23
```

**Output:**
```
Sorted Stack:
1 12 23 34 56 78
```

### Step 4: Generating Javadoc
To generate the Javadoc documentation for the project, use the following command:
```sh
javadoc -d docs SortedStack.java
```

This will create a `docs/` directory containing the generated HTML documentation. You can open `index.html` in a web browser to view the documentation.

## How to Access the Project
1. Clone the repository from GitHub:
    ```sh
    git clone https://github.com/bessepmack/SortedStack.git
    ```
2. Navigate to the project directory:
    ```sh
    cd SortedStack
    ```

## License
This project is licensed under the MIT License.

---
