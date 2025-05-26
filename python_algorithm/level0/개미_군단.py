def solution(hp):
    answer = 0
    li = [5,3,1]
    for i in li:
        answer += int(hp / i)
        hp %= i
    return answer

print(solution(23))
print(solution(24))
print(solution(999))