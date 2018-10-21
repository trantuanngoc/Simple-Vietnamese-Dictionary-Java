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
public class Dictionary  {

       private int n;
        public Word[] words;
        public Dictionary (){};
        
        public void Dictionary(int n){
            this.n=n;
             //this.words =new Word[n];
        }
      
       public int getN() {
        return n;
        }
       public void setN(int n){
           this.n=n;
       }
    public void Dictionary(Word[] words) {
		
		this.words = words;
	}
}
