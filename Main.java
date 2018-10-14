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
public class Main {
    public static void main(String[] args) {
        DictionaryCommandline dictionaryCommandline=new DictionaryCommandline();
        DictionaryManagement dictionaryManagement=new DictionaryManagement();
        Dictionary dic=new Dictionary();
       dictionaryManagement.insertFromFile(dic);
       dictionaryCommandline.showAllWords(dic);
       dictionaryManagement.dictionarySearcher(dic);
    }
}
