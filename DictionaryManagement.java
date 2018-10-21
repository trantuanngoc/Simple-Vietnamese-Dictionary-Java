/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;


import java.io.File;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.print.DocFlavor;
import javax.swing.DefaultListModel;
import javax.swing.text.Utilities;


/**
 *
 * @author DELL
 */
public class DictionaryManagement {
    DefaultListModel<String> model = new DefaultListModel<>();
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
     InputStream stream = DictionaryManagement.class.getResourceAsStream("/miniproject/dictionaries.txt");
        try(Scanner sc = new Scanner(stream)){
       // File file =new File("dictionaries.txt");
        String str;
        Word words[] = new Word[30000] ;
        int i=0;
        while(sc.hasNext()){
            str=sc.nextLine();
            String[] word =str.split("\t",2);
            words[i]=new Word(word[0], word[1]);
            model.addElement(word[0]);
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
    public String searcher(Dictionary dic,String s){ 
           String d = null;
           for(int i = 0; i< dic.getN();i++) {
			 if(s.equals(dic.words[i].getWordTarget())) {
				 d=dic.words[i].getWordExplain();
			    break;
			 } 
                    
		 }
           if(d==null)d = "Từ điển không có từ bạn tìm";
      return d;
    }
    
   
    
    public String deleteWord(Dictionary dic,String wordString){
           String d = null;
           for(int i = 0; i< dic.getN();i++) {
			 if(wordString.equals(dic.words[i].getWordTarget())) {
				 d="đã xóa";
                                 for(int j=i;j<dic.getN();j++)
                                 {
                                     dic.words[i]=dic.words[i+1];
                                    
                                 }
			    break;
			 } 
                    
		 }
           if(d==null)d = "Từ điển không có từ bạn tìm";
      return  d;
    }
    
    public String editWord(Dictionary dic,String inputWord,String outputTarget,String outputExplain){
         String d = null;
        

           for(int i = 0; i< dic.getN();i++) {
			 if(inputWord.equals(dic.words[i].getWordTarget())) {
				 
                                 if (outputTarget!=null) {
                                     dic.words[i].setWordTarget(outputTarget);
                                     d="Đã sửa";
                                 }
                                 else if (outputExplain!=null){
                                     dic.words[i].setWordExplain(outputExplain);
                                     d="Đã sửa";
                                 }
                                 else d="Bạn chưa điền ";
			         
                                 break;
			 } 
                    
		 }
           if(d==null)d = "Từ điển không có từ bạn tìm";
      return d;
    }
    
    public String insertWord(Dictionary dic,String inputWord){
         String d="đã thêm";
        
       
      return  d;
    }
   
    public void dictionaryExportToFile(Dictionary dic){
        File f = new File("");
        File file = new File (f.getAbsolutePath()+"\\dictionary.txt");
        try(PrintWriter pw = new PrintWriter(file)) {
           for(int i = 0;i < dic.getN();i ++){
               pw.println(  dic.words[i].getWordTarget());
               pw.println("\t"+dic.words[i].getWordExplain());
           }
        } catch (Exception e) {
        }
    }
    
}