/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary1;


import static dictionary1.Main.dic;
import static dictionary1.Main.dictionaryManagement;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class GiaoDien extends JFrame  implements ActionListener{
   
      
    private JTextField txt_search; 
    private JButton enter,addButton,insertButton,editButton;
    private JLabel lb_search;
    private JPanel panelMain;
    public GiaoDien (String tieuDe){
        super(tieuDe);
        txt_search=new JTextField("",20);
        enter=new JButton("Search");
        addButton=new JButton("add");
        insertButton =new JButton("insert");
        editButton=new JButton("edit");
        lb_search= new JLabel("word");
        panelMain=new JPanel();
      panelMain.setLayout(new GridLayout(3,2));
      this.add(panelMain);
      panelMain.add(lb_search);
      panelMain.add(txt_search);
      panelMain.add(enter);
      panelMain.add(addButton);
      panelMain.add(insertButton);
      panelMain.add(editButton);
      
      enter.setActionCommand("enter");
      enter.addActionListener(this);
    }
   
    
    
    
   
   @Override
    public void actionPerformed(ActionEvent e) {
        if ("enter".equals(e.getActionCommand())) {
             String tu=txt_search.getText();
            JOptionPane.showMessageDialog(rootPane,dictionaryManagement.searcher(dic, tu));
        }
        
    }  
    
}
