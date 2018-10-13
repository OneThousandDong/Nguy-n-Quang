import java.io.BufferedReader;
import java.io.FileReader;

import java.util.*;
public class Dictionary {
    public void saveWord(Map<String,String> map)
    {
        Word w = new Word();
        try{
            FileReader fr = new FileReader("dictionaries.txt");
            BufferedReader br = new BufferedReader(fr);
            String readWord;
            while ((readWord = br.readLine()) != null) {
                int j=0;
                for(int i=0; i<readWord.length(); i++) {
                    j++;
                    if(Character.isSpaceChar(readWord.charAt(i))) {
                        break;
                    }
                }
                String tmpWord = readWord;
                w.word_target = tmpWord.substring(0,j-1);
                w.word_explain= readWord.substring(j);
                // w.word_target = String.valueOf(w.word_target.charAt(0)).toUpperCase() + w.word_target.substring(1,j-1);
                map.put(w.word_target, w.word_explain);
            }
            br.close();
            fr.close();
        }catch (Exception e){
            System.out.println("ERROR");
        }

    }
}
