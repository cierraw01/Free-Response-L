import java.util.ArrayList;
import java.util.List;

public class Scramble
{
	
	public static String scrambleWord(String word)
	{
	    String ord = "";
	    boolean toAdd = false;
      for(int l = 0; l < word.length()-1; l++){
        char a = word.charAt(l);
        char b = word.charAt(l+1);
        if(a == 'A' && b != 'A'){
          //word = word.substring(0,1) + b + 'A' + word.substring(l+2);
        //  word.setCharAt(l,b);
         // word.setCharAt(l+1,'A');
          ord = ord + b + 'A';
          if(l==word.length()-2){
            toAdd = true;
          }
          l++;
        }
        else{
          ord = ord + a;
        }
      }
      if(!toAdd){
        ord = ord + word.substring(word.length()-1);
      }
    return ord;
	}
	

	public static void scrambleOrRemove(List<String> wordList)
	{
	  for(int w = 0; w<wordList.size(); w++){
	    boolean toRemove = true;
	    String word = wordList.get(w);
	    String ord = "";
	    boolean toAdd = false;
      for(int l = 0; l < word.length()-1; l++){
        char a = word.charAt(l);
        char b = word.charAt(l+1);
        if(a == 'A' && b != 'A'){
          toRemove = false;
          ord = ord + b + 'A';
          if(l==word.length()-2){
            toAdd = true;
          }
          l++;
        }
        else{
          ord = ord + a;
        }
      }
      if(!toAdd){
        ord = ord + word.substring(word.length()-1);
      }
      if(toRemove){
        wordList.remove(w);
        w--;
      }
      else{
        wordList.set(w,ord);
      }
	  }
	}  
	
}
