import sys

def apply_gravity(grid, m, n):
    for j in range(n):
        empty_spot = m - 1
        for i in range(m - 1, -1, -1):
            if grid[i][j] == '*':
                grid[empty_spot][j] = '*'
                empty_spot -= 1
        
        for i in range(empty_spot, -1, -1):
            grid[i][j] = '.'

def rotate(grid, m, n, direction):
    new_m = n
    new_n = m
    
    new_grid = [['.' for _ in range(new_n)] for _ in range(new_m)]
    
    if direction == 'right':
        for r in range(m):
            for c in range(n):
                new_grid[c][m - 1 - r] = grid[r][c]
    else:
        for r in range(m):
            for c in range(n):
                new_grid[n - 1 - c][r] = grid[r][c]
                
    return new_grid, new_m, new_n

def solve():
    m, n = map(int, sys.stdin.readline().split())
    
    grid = []
    for _ in range(m):
        grid.append(sys.stdin.readline().split())
        
    k = int(sys.stdin.readline())
    
    apply_gravity(grid, m, n)
    
    for _ in range(k):
        instruction = sys.stdin.readline().strip()
        grid, m, n = rotate(grid, m, n, instruction)
        apply_gravity(grid, m, n)
        
    for r in range(m):
        print(" ".join(grid[r]), end="")
        if r < m - 1:
            print() 

if __name__ == "__main__":
    solve()