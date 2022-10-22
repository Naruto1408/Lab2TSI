package Polibia;

public class Des {
    public String outString(String s){
        s = s.replaceAll(" ", "");

        String rez = "";
        int x, y;

        for(int i = 0; i < s.length(); ++i){
            if(i % 2 == 0) {
                x = Integer.parseInt(String.valueOf(s.charAt(i)));
                y = Integer.parseInt(String.valueOf(s.charAt(i+1)));

                rez += Enc.key[x][y];
            }
        }
        return rez;
    }
}
