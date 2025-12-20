# DSA Training Progress Tracker & Templates

## 📊 Weekly Progress Tracking Template

### Week Progress Summary

```Markdown
WEEK __: _________________ (Dates: ___/__ to ___/__)

📈 QUANTITATIVE METRICS:
□ Problems Solved: ___/20 target
  - Easy: ___/8
  - Medium: ___/10  
  - Hard: ___/2
□ Study Hours: ___/15 target
□ Mock Interviews: ___/2 target
□ New Patterns Learned: ___

⭐ QUALITATIVE ASSESSMENT (1-5 scale):
□ Pattern Recognition: ___/5
□ Code Implementation Speed: ___/5
□ Problem-Solving Approach: ___/5
□ Time Complexity Analysis: ___/5
□ Communication/Explanation: ___/5

🎯 THIS WEEK'S FOCUS:
Main Pattern: _______________
Secondary Pattern: ___________

✅ COMPLETED SUCCESSFULLY:
- ________________________
- ________________________
- ________________________

⚠️ STRUGGLED WITH:
- ________________________
- ________________________
- ________________________

📝 KEY LEARNINGS:
- ________________________
- ________________________
- ________________________

🎯 NEXT WEEK GOALS:
- ________________________
- ________________________
- ________________________
```

---

## 🎯 Pattern Mastery Checklist

### Core Pattern Status (Check when comfortable)

#### **Month 1 Patterns:**

- [ ] **Arrays & Hashing**: Can solve Two Sum variants quickly
- [ ] **Two Pointers**: Recognize when to use opposite vs same direction
- [ ] **Sliding Window**: Distinguish fixed vs variable window problems
- [ ] **Binary Search**: Write bug-free binary search template
- [ ] **Linked Lists**: Implement reversals and cycle detection

#### **Month 2 Patterns:**

- [ ] **Tree Traversals**: All DFS/BFS variations (recursive/iterative)
- [ ] **BST Operations**: Validate, search, insert, delete
- [ ] **Graph Algorithms**: DFS/BFS for connectivity and shortest paths
- [ ] **Heaps**: Top-K problems and priority queue applications
- [ ] **Advanced Trees**: Path problems and tree DP

#### **Month 3 Patterns:**

- [ ] **1D Dynamic Programming**: Bottom-up and top-down approaches
- [ ] **2D Dynamic Programming**: Grid and string matching problems
- [ ] **Backtracking**: Generate all combinations/permutations
- [ ] **Bit Manipulation**: Single number and bit masking
- [ ] **Advanced Techniques**: Union-Find, Trie, Segment Trees

---

## 🚀 Multi-Language Code Templates for Essential Patterns

### *Choose your preferred language: Python, Java, or C++*

### 1. Binary Search Template

```python
def binary_search(arr, target):
    left, right = 0, len(arr) - 1
    
    while left <= right:
        mid = left + (right - left) // 2
        
        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    
    return -1  # Not found

# For finding first/last occurrence:
def find_first_occurrence(arr, target):
    left, right = 0, len(arr) - 1
    result = -1
    
    while left <= right:
        mid = left + (right - left) // 2
        
        if arr[mid] == target:
            result = mid
            right = mid - 1  # Continue searching left
        elif arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    
    return result
```

### 2. Two Pointers Template

```python
# Opposite direction (for sorted arrays)
def two_sum_sorted(arr, target):
    left, right = 0, len(arr) - 1
    
    while left < right:
        current_sum = arr[left] + arr[right]
        
        if current_sum == target:
            return [left, right]
        elif current_sum < target:
            left += 1
        else:
            right -= 1
    
    return []

# Same direction (fast/slow pointers)
def find_cycle_start(head):
    slow = fast = head
    
    # Find if cycle exists
    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next
        if slow == fast:
            break
    else:
        return None  # No cycle
    
    # Find cycle start
    slow = head
    while slow != fast:
        slow = slow.next
        fast = fast.next
    
    return slow
```

### 3. Sliding Window Template

```python
# Fixed window size
def max_sum_subarray(arr, k):
    if len(arr) < k:
        return 0
    
    # Calculate sum of first window
    window_sum = sum(arr[:k])
    max_sum = window_sum
    
    # Slide the window
    for i in range(k, len(arr)):
        window_sum = window_sum - arr[i - k] + arr[i]
        max_sum = max(max_sum, window_sum)
    
    return max_sum

# Variable window size
def longest_substring_k_distinct(s, k):
    if k == 0:
        return 0
    
    left = 0
    char_count = {}
    max_length = 0
    
    for right in range(len(s)):
        # Expand window
        char_count[s[right]] = char_count.get(s[right], 0) + 1
        
        # Contract window if needed
        while len(char_count) > k:
            char_count[s[left]] -= 1
            if char_count[s[left]] == 0:
                del char_count[s[left]]
            left += 1
        
        max_length = max(max_length, right - left + 1)
    
    return max_length
```

### 4. DFS Tree Traversal Template

```python
# Recursive DFS
def dfs_recursive(root):
    if not root:
        return
    
    # Preorder: process root first
    print(root.val)
    dfs_recursive(root.left)
    dfs_recursive(root.right)

# Iterative DFS
def dfs_iterative(root):
    if not root:
        return
    
    stack = [root]
    
    while stack:
        node = stack.pop()
        print(node.val)
        
        # Add children (right first for preorder)
        if node.right:
            stack.append(node.right)
        if node.left:
            stack.append(node.left)
```

### 5. BFS Template

```python
from collections import deque

def bfs_level_order(root):
    if not root:
        return []
    
    result = []
    queue = deque([root])
    
    while queue:
        level_size = len(queue)
        level = []
        
        for _ in range(level_size):
            node = queue.popleft()
            level.append(node.val)
            
            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)
        
        result.append(level)
    
    return result
```

### 6. Dynamic Programming Template

```python
# 1D DP - Bottom up
def fibonacci(n):
    if n <= 1:
        return n
    
    dp = [0] * (n + 1)
    dp[1] = 1
    
    for i in range(2, n + 1):
        dp[i] = dp[i-1] + dp[i-2]
    
    return dp[n]

# 2D DP - Grid problems
def unique_paths(m, n):
    dp = [[1] * n for _ in range(m)]
    
    for i in range(1, m):
        for j in range(1, n):
            dp[i][j] = dp[i-1][j] + dp[i][j-1]
    
    return dp[m-1][n-1]
```

### 7. Backtracking Template

```python
def backtrack_combinations(nums):
    result = []
    current = []
    
    def backtrack(start):
        # Base case - add current combination
        result.append(current[:])
        
        # Generate all possible next choices
        for i in range(start, len(nums)):
            # Make choice
            current.append(nums[i])
            
            # Recurse with updated state
            backtrack(i + 1)
            
            # Undo choice (backtrack)
            current.pop()
    
    backtrack(0)
    return result
```

---

## 📈 Problem Difficulty Progression Tracker

### Month 1: Foundation Building

```Markdown
Week 1: Arrays & Hashing
Easy: ___/16  Medium: ___/9  Hard: ___/1

Week 2: Two Pointers & Sliding Window  
Easy: ___/10  Medium: ___/14  Hard: ___/2

Week 3: Sorting & Searching
Easy: ___/5   Medium: ___/15  Hard: ___/2

Week 4: Linked Lists & Stacks
Easy: ___/14  Medium: ___/13  Hard: ___/1

Month 1 Total: Easy: ___/45  Medium: ___/51  Hard: ___/6
```

### Month 2: Advanced Data Structures

```Markdown
Week 5-6: Trees & BST
Easy: ___/18  Medium: ___/32  Hard: ___/0

Week 7: Graphs
Easy: ___/5   Medium: ___/15  Hard: ___/3

Week 8: Heaps & Priority Queues
Easy: ___/6   Medium: ___/12  Hard: ___/2

Month 2 Total: Easy: ___/29  Medium: ___/59  Hard: ___/5
```

### Month 3: Advanced Algorithms

```Markdown
Week 9-10: Dynamic Programming
Easy: ___/10  Medium: ___/35  Hard: ___/5

Week 11: Backtracking & Advanced
Easy: ___/8   Medium: ___/15  Hard: ___/4

Week 12: Mock Interviews & Review
Problems: ___/30 (Mixed difficulty)

Month 3 Total: Easy: ___/18  Medium: ___/50  Hard: ___/9
```

### **OVERALL PROGRAM TOTAL:**

**Easy: ___/92  Medium: ___/160  Hard: ___/20**
**Grand Total: ___/272 problems**

---

## 🎯 Mock Interview Performance Tracker

### Interview Practice Log

```Text
Date: ___/___/____
Platform: ________________
Duration: _____ minutes
Interviewer/Mode: _______________

PROBLEMS SOLVED:
1. Problem: ________________________
   Difficulty: _______ Time: ______ mins
   Result: ✅ Solved / ⚠️ Partial / ❌ Failed
   
2. Problem: ________________________
   Difficulty: _______ Time: ______ mins
   Result: ✅ Solved / ⚠️ Partial / ❌ Failed

PERFORMANCE RATINGS (1-5):
□ Problem Understanding: ___/5
□ Approach Discussion: ___/5
□ Code Implementation: ___/5
□ Testing & Edge Cases: ___/5
□ Communication: ___/5
□ Time Management: ___/5

FEEDBACK RECEIVED:
Strengths:
- _________________________
- _________________________

Areas for Improvement:
- _________________________
- _________________________

ACTION ITEMS:
- _________________________
- _________________________
```

---

## 📚 Company-Specific Focus Areas

### **Google/Alphabet**

- **Heavy Focus**: Tree algorithms, graph traversal, system design
- **Common Patterns**: DFS/BFS, dynamic programming, complex tree problems
- **Preparation**: Emphasize explanation and multiple solutions

### **Amazon**

- **Heavy Focus**: Array/string manipulation, OOP design
- **Common Patterns**: Two pointers, sliding window, basic DP
- **Preparation**: Leadership principles + coding balance

### **Microsoft**

- **Heavy Focus**: Balanced across all patterns
- **Common Patterns**: All fundamental patterns equally
- **Preparation**: Clear communication and systematic approach

### **Facebook/Meta**

- **Heavy Focus**: Graph algorithms, tree traversal
- **Common Patterns**: BFS/DFS, graph connectivity, tree problems
- **Preparation**: Scalability discussions

### **Apple**

- **Heavy Focus**: System design + moderate coding
- **Common Patterns**: Clean code, OOP principles
- **Preparation**: Product thinking + technical depth

---

## 🏆 Final Month Checklist

### Week 12 Interview Readiness Assessment

- [ ] Can solve medium problems in < 25 minutes consistently
- [ ] Explain approach clearly before coding
- [ ] Identify time/space complexity immediately
- [ ] Handle edge cases systematically
- [ ] Ask clarifying questions naturally
- [ ] Comfortable with whiteboard/shared screen coding
- [ ] Can discuss trade-offs and optimizations
- [ ] Practiced with preferred programming language syntax
- [ ] Completed 20+ mock interviews
- [ ] Familiar with company-specific question patterns

### Final Week Daily Schedule

- **Monday**: Review top 50 problems from your weak patterns
- **Tuesday**: Full mock interview + system design practice
- **Wednesday**: Company research + behavioral prep
- **Thursday**: Light practice + mental preparation
- **Friday**: Rest day or light review

**Remember**: Confidence comes from consistent practice. Trust your preparation and stay calm during the actual interviews!

---

This comprehensive tracking system will help you stay accountable and measure your progress throughout the 3-month journey. Regular self-assessment is key to identifying areas that need more focus.
