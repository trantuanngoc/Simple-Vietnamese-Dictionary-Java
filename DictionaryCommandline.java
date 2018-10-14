/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary1;

/**
 *
 * @author DELL
 */
public class DictionaryCommandline extends  DictionaryManagement{
    public void showAllWords(Dictionary dic){
        System.out.println("No   | English          | Vietnamese");
        for (int j=0;j<dic.getN();j++){    
            System.out.println((j+1)+"    |" +dic.words[j].getWordTarget() +"              |"+dic.words[j].getWordExplain());
        }
    }
    public void dictionaryBasic(Dictionary dic){
        insertFromCommandline(dic);
        showAllWords(dic);
    }
    public void dictionaryAdvanced(Dictionary dic){
        insertFromFile(dic);
        showAllWords(dic);
        dictionaryLookup(dic);
    }
}
