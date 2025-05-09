def solution(n, k):
    service = int(n/10)
    answer = (n*12000) + (k * 2000) - (service * 2000)
    return answer

if __name__ == "__main__":
    print(solution(64,6))