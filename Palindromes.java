public class Palindromes {
    public static void main(String[] args){
        String[] testPalindromes = {"radar","a","","Able was I ere I saw Elba","A man, a plan, a canal, Panama!","Hello","abcdba"};
        for(int i = 0;i < testPalindromes.length;i++){
            if(isPalindrome(testPalindromes[i])){
                System.out.println("Yes!\t" + "\"" + testPalindromes[i] + "\"");
                }
            else{
                System.out.println("No...\t" + "\"" + testPalindromes[i] + "\"");
            }
        }

    }

    public static boolean isPalindrome(String s){
        int n = s.length();
        String formattedStr = "";

        for(int i = 0; i < n ; i++) {
            if (s.charAt(i) <= 'z' && s.charAt(i) >= 'A') {
                formattedStr += s.charAt(i);
                formattedStr = formattedStr.toLowerCase();
            }
        }
        if(n == 0){
            return true;
        }

        return isPalindrome(formattedStr,0);
        }

    private static boolean isPalindrome(String s, int index){
        int n = s.length();
        if(s.charAt(index) != s.charAt((n - 1) - index)){
            return false;
        }

        if(index < (n - 1) - index){
            return isPalindrome(s,index + 1);
        }

        return true;
    }
}
