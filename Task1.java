class Solution {
    public String solution(int T) {
        
        //whatever remains from calculating each field is used to calculate the next field
        //one hour has 60x60 seconds = 3600 seconds
        int hours = T / 3600;
        int afterHour = T % 3600;
        
        int minutes = afterHour / 60;
        int seconds = afterHour % 60;
        
        return hours + "h" + minutes + "m" + seconds + "s";
    }
}