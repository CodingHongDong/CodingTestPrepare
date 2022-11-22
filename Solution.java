package codingtest;

class Solution {
    
	public String solution(String my_string, String letter) {
        String answer = my_string.toString();
        
        if(answer.indexOf(letter) != -1) {
        	answer = my_string.replace(letter, "");
        }
        
        return answer;
    }
	
}