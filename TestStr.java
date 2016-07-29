import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;



public class TestStr {
public static void main(String args[]){
	/*Scanner scan = new Scanner(System.in);
	String str = scan.next();
	//int n = scan.nextInt();
	 String str = scan.nextString();
*/	
	
	System.out.println("welcome");
	/*String str="NikithaSrinivasan";
	int index = str.indexOf("Srinivasan");
	System.out.println("index value:"+index);
	System.out.println(str.substring(0,index));
	*/
	
/*	String A = "hello";
	String B= "java";
    int len = A.length()+B.length();
	   System.out.println(len);
       if(A.compareTo(B) >=1){
           System.out.println("Yes");
       }else if(A.compareTo(B) <=-1){
            System.out.println("No");
       }else if(A.compareTo(B) == 0){
            System.out.println("same");
       }
      System.out.println(Character.toUpperCase(A.charAt(0))+A.substring(1)+" "+Character.toUpperCase(B.charAt(0))+B.substring(1)); 
       */
	
	TestStr test = new TestStr();

	//test.findLexoString(str,n);
	//System.out.println(test.IsPalindrome(str));

 /*  String 	firstStr = "crat";
   String  secondStr ="tcea";
	boolean result = test.isAnagram(firstStr, secondStr);*/
	
	//String Tokenizer
	//String s = "He is a very very good boy, isn't he?";
/*	StringTokenizer token = new StringTokenizer(s, "!,\\?._'@ ");
	System.out.println("length:"+token.countTokens());
	while(token.hasMoreTokens()){
		System.out.println(token.nextToken());
	}
	*/
	/*s = s.trim();
    if (s.length()>400000){
        return ;
    }else if (s.length()==0){
        System.out.println(0);
        return ;
    }else{   
    String[] words = s.split("[!,?.*_'@\\ ]+");
    int count = words.length;
    System.out.println(count);
    for(String word : words){
        System.out.println(word);
    }
    }*/
	
	 Scanner in = new Scanner(System.in);
     while(in.hasNext())
     {
         String IP = in.next();
         System.out.println(IP.matches(new myRegex().pattern));
         
     }
}
/*Scanner scan = new Scanner(System.in);
int testcases = scan.nextInt();
while(testcases>0){
     int totalN = scan.nextInt();
     int m = scan.nextInt();
    int[] arrN = new int[totalN];
    for(int j=0;j<totalN;j++){
        arrN[j]=scan.nextInt();
    }
    int i=0;
   boolean result = isPossible(m,arrN,i);
    System.out.println(result);
   testcases--; 
}
}
static boolean isPossible(int m,int[] arrN, int i){
if((i<0) || (arrN[i]==1)) return false;
if ((i == arrN.length - 1) || i + m > arrN.length - 1) return true;
arrN[i]=1;
return isPossible(m,arrN,i-1)|| isPossible(m,arrN,i+1) || isPossible(m,arrN,i+m);
}
*/

public boolean isAnagram(String firstStr,String secondStr){
	if(firstStr.length()!= secondStr.length()){
		return false;
	}
	
	HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
	firstStr = firstStr.toLowerCase();
	char[] arrCh = firstStr.toCharArray();
	Integer firstNum=0;

	secondStr = secondStr.toLowerCase();
	char[] arrSecondch = secondStr.toCharArray();
	Integer secondNum=0;
	
	for(int i=0; i<arrCh.length;i++){
		char cfirst = arrCh[i];
		firstNum = hmap.containsKey(cfirst)?hmap.get(cfirst):0;
		hmap.put(cfirst,++firstNum);
	

		char cSecond = arrSecondch[i];
		secondNum = hmap.containsKey(cSecond)?hmap.get(cSecond):0;
		hmap.put(cSecond,--secondNum);
	}
	
	for(int value:hmap.values()){
	  if(value!=0){
		return false;
	  }
	}
return true;
}
public boolean IsPalindrome(String str){
	char[] arrCh= str.toCharArray();
	int i =0;
	int j=arrCh.length-1;
	while(i<arrCh.length){
		if(arrCh[i]!=arrCh[j]){
		 return false;	
		}
		i++;
		j--;
	}
	return true;
}
public void findLexoString(String str,int n){
	
List<String> stringList = new ArrayList<String>();
	String temp;
	
	for(int i=0;i<str.length();i++){
		if(n+i <=str.length()){
		temp = str.substring(i, n+i);
		stringList.add(temp);
		}
	}
	Collections.sort(stringList);
	
	String[] stringArr = stringList.toArray( new String[] {} );
	
	System.out.println(stringArr[0]);
	System.out.println(stringArr[stringArr.length-1]);
	
	/*for(String element:stringArr){
		System.out.println(element);
	}*/
	
	
}
  
}
class myRegex{
	String zeroTo255 ="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
	public String pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255;
	
}
