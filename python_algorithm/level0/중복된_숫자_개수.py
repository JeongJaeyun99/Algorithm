def solution(array, n):
    answer = 0
    if n in array:
        answer = array.count(n)
    return answer


print(solution([1, 1, 2, 3, 4, 5],1))
print(solution([0, 2, 3, 4],1))