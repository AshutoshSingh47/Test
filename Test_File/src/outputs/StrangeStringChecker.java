package outputs;

public class StrangeStringChecker {
    public static void main(String[] args) {
        String input = "sdsdsdtcbjnacbhbndugxcxe";
        String result = isStrangeString(input);
        System.out.println(result);
    }
  
    public static String isStrangeString(String input) {
        String target = "strange";
        int targetIndex = 0;
      
        for (char c : input.toCharArray()) {
            if (c == target.charAt(targetIndex)) {
                targetIndex++;
                if (targetIndex == target.length()) {
                    return "Yes"; 
                }
            }
        }
      
        return "No"; 
    }
}