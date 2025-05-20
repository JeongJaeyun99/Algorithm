def solution(array, height):
    cnt = 0
    array.sort()
    answer = sum(1 for i in array if height < i)
    return answer

if __name__ == "__main__":
    print(solution([149, 180, 192, 170],167))
    print(solution([180, 120, 140],190))