import sys
from collections import deque

M, N, L = 0, 0, 0
grid = []
start_state, end_state = None, None

def find_state(target_char, set_L=False):
    global L
    cells = []
    for r in range(M):
        for c in range(N):
            if grid[r][c] == target_char:
                cells.append((r, c))
    
    if not cells:
        return None 

    if set_L:
        L = len(cells)
    elif len(cells) != L:
        return None 

    cells.sort()
    
    r, c = cells[0]
    orient = 0
    if L > 1 and cells[1][0] == r + 1:
        orient = 1
        
    for r_pos, c_pos in cells:
        grid[r_pos][c_pos] = 'E'
        
    return (r, c, orient)

def get_cells(state):
    r, c, orient = state
    cells = []
    for i in range(L):
        if orient == 0:
            cells.append((r, c + i))
        else:
            cells.append((r + i, c))
    return cells

def is_position_valid(state):
    cells = get_cells(state)
    for r, c in cells:
        if not (0 <= r < M and 0 <= c < N and grid[r][c] != 'B'):
            return False
    return True

def is_square_valid(r, c):
    for i in range(L):
        for j in range(L):
            rr, cc = r + i, c + j
            if not (0 <= rr < M and 0 <= cc < N and grid[rr][cc] != 'B'):
                return False
    return True

def solve():
    global M, N, grid, start_state, end_state
    
    try:
        M, N = map(int, sys.stdin.readline().split())
        grid = []
        for _ in range(M):
            grid.append(sys.stdin.readline().split())
    except Exception:
        return

    start_state = find_state('l', set_L=True)
    end_state = find_state('L', set_L=False)
    
    if start_state is None or end_state is None:
        print("Impossible")
        return
    
    queue = deque([(start_state, 0)])
    visited = {start_state}
    
    dr = [-1, 1, 0, 0]
    dc = [0, 0, -1, 1]
    
    while queue:
        current_state, steps = queue.popleft()
        
        if current_state == end_state:
            print(steps)
            return
            
        r, c, orient = current_state
        
        for i in range(4):
            next_state = (r + dr[i], c + dc[i], orient)
            if next_state not in visited and is_position_valid(next_state):
                visited.add(next_state)
                queue.append((next_state, steps + 1))
                
        new_orient = 1 - orient
        
        next_states_to_check = [] 
        
        if orient == 0:
            next_states_to_check.append(((r, c, new_orient), (r, c)))
            next_states_to_check.append(((r - L + 1, c, new_orient), (r - L + 1, c)))
            next_states_to_check.append(((r, c + L - 1, new_orient), (r, c)))
            next_states_to_check.append(((r - L + 1, c + L - 1, new_orient), (r - L + 1, c)))
        else:
            next_states_to_check.append(((r, c, new_orient), (r, c)))
            next_states_to_check.append(((r, c - L + 1, new_orient), (r, c - L + 1)))
            next_states_to_check.append(((r + L - 1, c, new_orient), (r, c)))
            next_states_to_check.append(((r + L - 1, c - L + 1, new_orient), (r, c - L + 1)))

        for next_state, (sr, sc) in next_states_to_check:
            if next_state not in visited and is_square_valid(sr, sc) and is_position_valid(next_state):
                 visited.add(next_state)
                 queue.append((next_state, steps + 1))

    print("Impossible")

if __name__ == "__main__":
    solve()