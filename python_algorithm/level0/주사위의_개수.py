def solution(box, n):
    answer = int(box[0] / n) * int(box[1] / n) * int(box[2] / n)
    return answer

print(solution([1, 1, 1],1))
print(solution([10, 8, 6],3))