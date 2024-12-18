package level2;

import java.util.*;

class 롤케이크_자르기 {
    public int solution(int[] topping) {
        int answer = 0;
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        map1.put(topping[0],map1.getOrDefault(topping[0],0) + 1);
        for(int i = 1;i < topping.length;i++){
            map2.put(topping[i],map2.getOrDefault(topping[i],0) + 1);
        }
        for(int i = 1;i < topping.length;i++){
            if(map1.size() == map2.size()){
                answer++;
            }
            map2.put(topping[i],map2.get(topping[i])-1);
            if(map2.get(topping[i]) == 0) map2.remove(topping[i]);
            map1.put(topping[i],map1.getOrDefault(topping[i],0) + 1);
        }
        return answer;
    }
}
