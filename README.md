# Data Structures & Algorithms (DSA) Learning Repository

Welcome to my comprehensive Data Structures & Algorithms learning repository! This repository serves as a structured guide for mastering DSA concepts and preparing for technical interviews at top tech companies.

## 🎯 Overview

This repository contains a meticulously organized 3-month DSA training program with:

- 300+ handpicked LeetCode problems
- Pattern-based learning approach
- Weekly progress tracking templates
- Implementation examples in Java
- Interview preparation strategies
- Unit tests for verifying implementations
- Complexity analysis for all algorithms
- Comprehensive DSA cheatsheet
- Automated progress tracking scripts
- Curated video resources for enhanced learning
- Enhanced documentation with detailed explanations

## 📚 Repository Structure

```markdown
├── Java + DSA + Interview Preparation/
│   ├── V1-V34: Progressive DSA topics from basics to advanced
│   │   ├── Fundamentals (V3-V10): Basics, conditionals, loops, switches
│   │   ├── Core DSA (V11-V29): Functions, Arrays, Searching, Sorting, Strings, Recursion
│   │   └── Advanced Concepts (V30-V34): Backtracking, OOP, Linked Lists
│
├── Strivers A2Z Sheet/
│   ├── 1. Basics: Language fundamentals and logical thinking
│   ├── 2. Sorting Techniques: Various sorting algorithms
│   ├── 3. Arrays: Array problems across difficulty levels
│   ├── 4. Binary Search: 1D arrays, answers, and 2D arrays
│   ├── 5. Strings: Basic to medium string problems
│   └── 6. Linked List: Comprehensive linked list coverage
│
├── src/
│   ├── main/java/dsa/: Main implementations with complexity analysis
│   └── test/java/: Unit tests for verifying implementations
│
├── lib/
│   └── JUnit testing framework
│
├── docs/
│   ├── DSA_3_Month_Training_Program.md
│   ├── DSA_Problem_Lists_by_Week.md
│   ├── DSA_Progress_Tracker.md
│   ├── DSA_Cheatsheet.md
│   └── DSA_Video_Resources.md
│
├── scripts/
│   ├── progress_tracker.py
│   ├── track_progress.sh
│   ├── track_progress.bat
│   ├── build.sh
│   └── build.bat
│
├── data/
│   └── dsa_progress.csv
│
└── README.md
```

## 🗓️ 3-Month Training Program

### Month 1: Foundation & Core Patterns

- **Week 1**: Arrays & Hashing Fundamentals
- **Week 2**: Two Pointers & Sliding Window
- **Week 3**: Sorting & Searching (Binary Search)
- **Week 4**: Linked Lists & Stacks/Queues

### Month 2: Trees, Graphs & Advanced Patterns

- **Week 5-6**: Trees & Tree Traversals, Binary Search Trees
- **Week 7**: Graph Algorithms
- **Week 8**: Heaps & Priority Queues

### Month 3: Dynamic Programming & Mock Interviews

- **Week 9-10**: Dynamic Programming (1D & 2D)
- **Week 11**: Backtracking & Advanced Techniques
- **Week 12**: Mock Interviews & Final Preparation

## 🛠️ Key Resources

### Documentation

- [`DSA_3_Month_Training_Program.md`](DSA_3_Month_Training_Program.md) - Complete curriculum with weekly breakdown
- [`DSA_Problem_Lists_by_Week.md`](DSA_Problem_Lists_by_Week.md) - Detailed problem lists organized by week
- [`DSA_Progress_Tracker.md`](DSA_Progress_Tracker.md) - Templates for tracking progress and mock interviews
- [`DSA_Cheatsheet.md`](DSA_Cheatsheet.md) - Quick reference guide for common algorithms and data structures
- [`DSA_Video_Resources.md`](DSA_Video_Resources.md) - Curated list of educational video resources
- [`IMPROVEMENTS_SUMMARY.md`](IMPROVEMENTS_SUMMARY.md) - Summary of enhancements made to this repository

### Code Examples

- **Java Implementations**: Each concept includes practical Java code examples
- **Pattern Templates**: Ready-to-use templates for common algorithmic patterns
- **Problem Solutions**: Solutions to popular DSA problems
- **Complexity Analysis**: Time and space complexity documented for each algorithm

## 🎥 Video Resources

This repository includes a curated collection of high-quality video resources to supplement your DSA learning:

### Categories Covered

- Foundational Concepts
- Data Structures (Arrays, Linked Lists, Trees, Graphs, etc.)
- Algorithms (Sorting, Searching, Dynamic Programming, etc.)
- Problem Solving Techniques
- Interview Preparation
- Advanced Topics

### Accessing Video Resources

View the complete list in [`DSA_Video_Resources.md`](DSA_Video_Resources.md), which organizes videos by topic and includes direct links to educational content from renowned educators and platforms.

## 🧪 Unit Testing

This repository includes unit tests for verifying the correctness of implementations:

### Running Tests

#### On Linux/macOS

```bash
./build.sh
```

#### On Windows

```cmd
build.bat
```

### Test Structure

- Tests are written using JUnit 5
- Each algorithm implementation has corresponding test cases
- Edge cases and boundary conditions are thoroughly tested

## 💻 Setting Up Input/Output in VS Code

To efficiently work with input/output in your Java programs within VS Code:

### Method 1: Using Scanner with Console Input

Most Java files in this repository use `Scanner` for console input:

```java
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        sc.close();
    }
}
```

### Method 2: Creating Input Files for Testing

1. Create a text file (e.g., `input.txt`) in your project root or problem directory
2. Add your test input data to this file
3. Modify your Java program to read from the file:

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        // Your code here
        sc.close();
    }
}
```

### Method 3: VS Code Launch Configuration

Create a `.vscode/launch.json` file in your repository with:

```json
{
    "version": "0.2.0",
    "configurations": [
        {
            "type": "java",
            "name": "Current File",
            "request": "launch",
            "mainClass": "${file}",
            "args": ""
        }
    ]
}
```

### Method 4: Using Code Runner Extension

1. Install the "Code Runner" extension in VS Code
2. Configure it to run Java files with input redirection:
   - Go to Settings (Ctrl+,)
   - Search for "code runner executor map"
   - Modify the Java entry to: `"java": "cd $dir && javac $fileName && java $fileNameWithoutExt < input.txt"`

## 🏆 Success Metrics

By completing this program, you will:

- Solve 300+ LeetCode problems across all difficulty levels
- Master 15+ essential coding patterns
- Achieve consistent performance in mock interviews
- Build confidence for system design discussions

---

*This repository is actively maintained as part of a structured approach to DSA mastery and technical interview preparation. Regular updates include new problems, improved solutions, and enhanced tracking mechanisms.*
