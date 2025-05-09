def solution(n):
    answer = 0
    a = 2
    while(a <= n):
        if(a % 2 == 0) : 
            answer+= a
        a+=2
    
    return answer
if __name__ == "__main__":
    print(solution(10))