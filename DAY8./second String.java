class Solution {
    public char secondMost(String s) {
        int n=s.length();
        int max=0,secondMax=0;
        char maxChar=0,secondChar=0;
        for (int i=0;i<n;i++) {
            char ch=s.charAt(i);
            int count=0;
            for (int j=0;j<n;j++) {
                if (s.charAt(j)==ch) {
                    count++;
                }
            }
            if(count>max) {
                secondMax=max;
                secondChar=maxChar;
                max=count;
                maxChar=ch;
            } else if (count>secondMax&&ch!=maxChar) {
                secondMax=count;
                secondChar=ch;
            }
        }
        return secondChar;
    }
}