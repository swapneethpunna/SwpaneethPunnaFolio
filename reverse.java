import java.util.Arrays;

public class reverse{


public static void main(String[] args) {
    String orginal="My name is khan";
    String []words = orginal.split("\\s");
    String [] ans = new String[words.length];
    for (int i=0; i<words.length; i++ ){
        ans[i]=words[i];
    }
    for(int x=ans.length-1; x>=0;x--){
        System.out.print(ans[x]+" ");
    }
   
}
}