package codewars;

import java.awt.image.ReplicateScaleFilter;

public class RenameChars {
	   public static String makeComplement(String str) {
		   String s=str.toUpperCase();
		   char[] ch=s.toCharArray();
           StringBuilder builder = new StringBuilder();

           /*for(int i=0;i<dna.length();i++){
                char c = dna.charAt(i);
                if(dna.charAt(i) == 'T'){
                    builder.append('A');
                }
                if(dna.charAt(i) == 'A'){
                    builder.append('T');
                }
                if(dna.charAt(i) == 'C'){
                    builder.append('G');
                }
                if(dna.charAt(i) == 'G'){
                    builder.append('T');
                }   
           }*/
           for(int i=0;i<s.length();i++) {
        	   if(ch[i]=='A') {
        		   builder.append('T');
        	   }
        	   if(ch[i]=='T') {
        		   builder.append('A');
        	   }
        	   if(ch[i]=='C') {
        		   builder.append('G');
        	   }
        	   if(ch[i]=='G') {
        		   builder.append('C');
        	   }
        	  
           }
           return builder.toString();
      }
public static void main(String[] args) {
	System.out.println(makeComplement("Aryav"));
}
}//i/p:ATTGC o/p:TAACG ,i/p:CATA o/p:GTAT
