//Given a string, Your task is to  complete the function encode that returns the run length encoded string for the given string. eg if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6″.
class GfG
 {
	String encode(String str)
	{
          //Your code here
          String str1 = "";
          char[] ch = str.toCharArray();
          int count = 1;
          str1 += ch[0];
          for(int i = 1;i<str.length();i++)
          {
              if(ch[i]==ch[i-1])
              {
                  count++;
              }
              else
              {
                  str1 += String.valueOf(count);
                  str1 += ch[i];
                  count = 1;
              }
          }
          str1 += String.valueOf(count);
          return str1;
	}
	
 }
