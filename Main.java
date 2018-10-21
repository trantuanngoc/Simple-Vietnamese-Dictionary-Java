/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary1;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


/**
 *
 * @author DELL
 */
  public class Main {
      static Dictionary dic=new Dictionary(); 
      static DictionaryManagement dictionaryManagement=new DictionaryManagement();
 public static void main(String[] args) {
        
       //DictionaryCommandline dictionaryCommandline=new DictionaryCommandline();
       
       dictionaryManagement.insertFromFile(dic);
       GiaoDien giaoDien=new GiaoDien(("abc"));


            giaoDien.setSize(600,200);
            giaoDien.setVisible(true);
            giaoDien.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            giaoDien.setLocationRelativeTo(null);
    }

    

        
   }
    
