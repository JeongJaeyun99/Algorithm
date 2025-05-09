def solution(s1, s2):
    answer = 0
    if len(s1) == len(s2):
        for i in range(len(s1)):
            if s1[i] in s2:
                answer+=1
    elif len(s1) > len(s2):
        for i in range(len(s2)):
            if s2[i] in s1:
                answer+=1
    elif len(s1) < len(s2):
        for i in range(len(s1)):
            if s1[i] in s2:
                answer+=1
    return answer


if __name__ == "__main__":
    print(solution(["a", "b", "c"],["com", "b", "d", "p", "c"]))
    print(solution(["n", "omg"],["m", "dot"]))