class Solution {
    public String trimTrailingVowels(String s) { 
        StringBuilder str=new StringBuilder();
        int i=s.length()-1;
          if (s.charAt(i)!='a' && s.charAt(i)!='e' && 
            s.charAt(i)!='i' && s.charAt(i)!='o' && 
            s.charAt(i)!='u') {
            return s;
        }
       
        int j=s.length()-1;
        while (j >= 0 && 
              (s.charAt(j)=='a' || s.charAt(j)=='e' || 
               s.charAt(j)=='i' || s.charAt(j)=='o' || 
               s.charAt(j)=='u')) { 
            j--;
        }

        for (int k = 0; k <= j; k++) {
            str.append(s.charAt(k));
        }

        return str.toString();
    }
}