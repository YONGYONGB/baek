import math
def solution(n):
    return find(n-1, int(math.sqrt(n)))

def find(n, limit):
    for i in range(2, limit + 1):
        if n % i == 0:
            return i
    return n
