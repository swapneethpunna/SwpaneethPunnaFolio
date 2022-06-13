public class anagram {
    public static void main(String[] args) {
        String string1="build";
        String string2="dubli";
        if(string1.length() != string2.length()){
            System.out.println(false);
        }
        char Str1Array[] = new char[string1.length()];
        char Str2Array[] = new char[string2.length()];
        for (int i=0; i<string1.length();i++){
            Str1Array[i]= string1.charAt(i);
        }
        for (int x=0; x<string1.length();x++){
            Str2Array[x]= string2.charAt(x);
        }

        for(int y=0; y<Str1Array.length;y++){
            if(Str1Array[y]!=Str2Array[y]){
                System.out.println(false);
                break;
            }
            else{
                System.out.println(true);
            }
        }


    }   
}
