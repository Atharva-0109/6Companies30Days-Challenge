//Given two strings str1 and str2. We say that str2 divides str1 if it's possible to concatenate multiple str2 to get str1. For example, ab divides abab. if str2 does not divide str1, return -1. Otherwise, return the smallest string 


class Solution {
    public String gcdOfStrings(String str1, String str2) {
        return stringsGCD(str1,str2);
        }
    private String stringsGCD(String str1,String str2)
    {
        if(str1.length()==0)
            return str2;
        if(str2.length()==0)
            return str1;
        if(str1.equals(str2))
            return str2;
        if(str1.length()>str2.length())
        {
            for(int i=0;i<str2.length();i++)
            {
                if(str1.charAt(i)!=str2.charAt(i))
                    return "";
            }
            String temp = str1.substring(str2.length());
            return stringsGCD(temp,str2);
        }
        if(str1.length()<str2.length())
            return stringsGCD(str2,str1);
        return "";
    }
}
