package dictionary;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DictionaryManagement {

    public Dictionary ver1 = new Dictionary();
    public int sizedict = 0;
    private Scanner input = new Scanner(System.in);

    public void insertFromCommandline() {

        System.out.println("Số từ muốn thêm là : ");
        int wordnumber = Integer.parseInt(input.nextLine());
        for (int i = 0; i < wordnumber; i++) {
            String EnglishWord = input.next();
            String VNmean = input.nextLine();
            Word tmp = new Word(EnglishWord, VNmean);
            ver1.addlist(tmp);
            sizedict++;
        }

    }

    public void insertFromFile() throws IOException {
        try{
            File file = new File("dictionaries.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String s;
            while ((s = bufferedReader.readLine())!=null){
                String target = s.substring(0,s.indexOf('\t'));
                String explain = s.substring(s.indexOf('\t')+1);
                ver1.addlist(new Word(target, explain));
                sizedict++;
            }
            bufferedReader.close();

        }catch (Exception e){
            System.out.println(e.toString());
        }
    }

    public int dictionaryLookup(String word) {
//        System.out.println("Bạn muốn tra từ : ");
//        String word = input.next();
        int min = 0;
        int max = sizedict - 1;
        //       String kq;
        while (max >= min) {
            int mid = (max + min) / 2;
            if (ver1.getList().get(mid).getWord_Target().equals(word) == true) {
                //return kq = ver1.getList().get(mid).getWord_Explain();
                return mid;
            } else if (word.compareTo(ver1.getList().get(mid).getWord_Target()) > 0) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }

    public void dictionaryExportToFile() throws IOException {
        File file = new File("fileout.txt");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);) {
            for (int i = 0; i < sizedict; i++) {
                fileOutputStream.write(ver1.getList().get(i).getWord_Target().getBytes());
                String str1 = "\t";
                String str2 = "\r\n";
                fileOutputStream.write(str1.getBytes());
                fileOutputStream.write(ver1.getList().get(i).getWord_Explain().getBytes());
                fileOutputStream.write(str2.getBytes());

            }
            fileOutputStream.flush();
        } catch (Exception e) {
        }

    }

    public void addtodictionary() {
        String add_explain;
        String add_target;
        System.out.println("English word : ");
        add_target = input.next();
        input.nextLine();
        System.out.println("Vietnamese mean : ");
        add_explain = input.nextLine();

        Word addword = new Word(add_target, add_explain);

        if (this.dictionaryLookup(add_target) == -1) {
            for (int i = 0; i < sizedict; i++) {

                if (add_target.compareTo(ver1.getList().get(i).getWord_Target()) > 0 && add_target.compareTo(ver1.getList().get(i + 1).getWord_Target()) < 0) {
                    ver1.getList().add(i + 1, addword);
                    break;
                }
                System.out.println("Success!");
                sizedict++;
            }
        } else {
            System.out.println("This word has been in dictionary before!");
        }
    }

    public void deletefromDictionary(String deleteword) {

        ver1.getList().remove(this.dictionaryLookup(deleteword));
        sizedict--;
    }

    public void repairfromDictionary(String word_target,String repairword) {
//           System.out.println(this.dictionaryLookup(word_target));
        ver1.getList().get(this.dictionaryLookup(word_target)).setWord_Explain(repairword);
    }

}
