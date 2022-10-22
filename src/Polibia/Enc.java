package Polibia;

public class Enc {
    private String text = "";
    protected static  char[][] key = {{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'},
            {'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T'},
            {'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd'},
            {'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n'},
            {'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x'},
            {'y', 'z'}};

    public String findInArr(String text){
        String encText = "";
        for(int i=0; i<text.length(); ++i)
            encText += charIn(text.charAt(i));
        return encText;
    }

    public String charIn(char c){
        String rez = "";
        for(int i=0; i<key.length; ++i){
            for(int j=0; j<key[i].length; ++j){
                if(key[i][j] == c){
                    rez = rez + (i+""+j+" ");
                }
            }
        }
        return rez;
    }
}
