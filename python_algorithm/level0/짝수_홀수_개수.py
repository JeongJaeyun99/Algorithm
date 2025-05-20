def solution(num_list):
    answer = [0,0]
    answer[0] = len(list(filter(lambda x : x % 2 == 0,num_list)))
    answer[1] = len(list(filter(lambda x : x % 2 != 0,num_list)))
    return answer