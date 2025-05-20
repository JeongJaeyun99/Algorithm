import math

def solution(n):
    answer = 0
    if int(math.sqrt(n)) * int(math.sqrt(n)) == n:
        answer = 1
    else :
        answer = 2
    return answer

print(solution(144))