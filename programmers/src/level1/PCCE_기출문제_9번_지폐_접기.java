package level1;


class PCCE_���⹮��_9��_����_����  {
	class Solution {
	    public int solution(int[] wallet, int[] bill) {
	        int answer = 0;
	        while(true){
	            if(bill[0] <= wallet[0] && bill[1] <= wallet[1] || bill[0] <= wallet[1] && bill[1] <= wallet[0]) break;
	            if(bill[0] > bill[1]){
	                bill[0] = bill[0] / 2;
	                answer++;
	                if(bill[0] <= wallet[0] && bill[1] <= wallet[1] || bill[0] <= wallet[1] && bill[1] <= wallet[0]) break;
	            }else{
	                bill[1] = bill[1] / 2;
	                answer++;
	                if(bill[0] <= wallet[0] && bill[1] <= wallet[1] || bill[0] <= wallet[1] && bill[1] <= wallet[0]) break;
	            }
	        }
	        return answer;
	    }
	}
}