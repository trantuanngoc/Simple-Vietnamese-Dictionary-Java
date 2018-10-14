/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary1;


import java.io.File;
import java.util.Scanner;


/**
 *
 * @author DELL
 */
public class DictionaryManagement {
    
    public void insertFromCommandline(Dictionary dic){
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap vao ban phim so luong tu vung");
        int n = Integer.parseInt(sc.nextLine());
        dic.setN(n);
       
        for (int i=0;i<dic.words.length;i++){
            String wordtarget = sc.nextLine();		
            String wordexplain = sc.nextLine();		
	
           dic.words[i]=new  Word(wordtarget,wordexplain);
        }     
    }
    public void insertFromFile(Dictionary dic){
        File file =new File("F:\\netbean_program\\dictionary\\src\\dictionary1\\newpackage\\dictionaries.txt");
        try(Scanner  sc = new Scanner(file)){
        String str;
        Word words[] = new Word[30000] ;
        int i=0;
        while(sc.hasNext()){
            str=sc.nextLine();
            String[] word =str.split("\t",2);
            words[i]=new Word(word[0], word[1]);
           i++;
        }
        dic.setN(i);
        dic.Dictionary(words);
        
        }catch(Exception e){     }     
    }
    
    public void dictionaryLookup(Dictionary dic) {
		System.out.println(" nhập từ bạn muốn tra");
		 Scanner scan = new Scanner(System.in);
		 String wordTranslate = scan.nextLine();
		 for(int i = 0; i< dic.words.length;i++) {
			 if(wordTranslate.equals(dic.words[i].getWordTarget())) {
				 System.out.println("| English          | Vietnamese");
				 System.out.println("| "+dic.words[i].getWordTarget()+"        |"+dic.words[i].getWordExplain());
			     break;
			 }
                         else if(i==dic.words.length-1)
                             System.out.println("Từ điển chưa có từ bạn muốn tìm");
                         
		 }
	}	
    public void dictionarySearcher(Dictionary dic){
            Scanner sc= new Scanner(System.in);
            System.out.println("nhập từ bạn muốn tra");
            String s=sc.nextLine();
            System.out.println("No |  English \t\t |Vietnamese");
            for (int i=0;i<dic.getN();i++){
                        String tudautien=dic.words[i].getWordTarget();
                        if(tudautien.startsWith(s)){
                            System.out.println((i+1)+"    |"+dic.words[i].getWordTarget()+"    |"+dic.words[i].getWordExplain());
                        }
            }
    }
	
}
