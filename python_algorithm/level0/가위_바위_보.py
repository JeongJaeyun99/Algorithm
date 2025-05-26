def solution(rsp):
    answer = ''
    li = list(rsp)
    for i in li:
        if i == '2' :
            answer += '0'
        elif i == '0':
            answer += '5'
        elif i == '5':
            answer += '2'
    return answer

print(solution("2"))
print(solution("205"))