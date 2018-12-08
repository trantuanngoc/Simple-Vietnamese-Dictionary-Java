/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;

/**
 *
 * @author DELL
 */
public class Word {
    private String word_target;
    private String word_explain;
    public Word(String word_target,String word_explain){
        this.word_target=word_target;
        this.word_explain=word_explain;
    }
    public void setWordTarget(String word_target){
        this.word_target=word_target;
    }
    public void setWordExplain(String word_explain){
        this.word_explain=word_explain;
    }
    public String getWordTarget(){
        return word_target;
    }
    public String getWordExplain(){
        return word_explain;
    }
}
