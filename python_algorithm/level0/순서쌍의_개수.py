def solution(n):
    answer = 0
    a = 1
    b = n
    while a <= n:
        if n % a == 0:
            answer += 1
        a += 1
    return answer

print(solution(100))