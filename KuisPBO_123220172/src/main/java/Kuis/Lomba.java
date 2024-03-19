/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Lomba extends JFrame {
    private JPanel mainPanel;
    private JButton buttonAnimasi;
    private JButton buttonSurat;
    
    public void Daftar () {
    setTitle ("Daftar");
    setSize (400, 250);
    setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    mainPanel = new JPanel();
    mainPanel.setLayout(new FlowLayout());
    buttonAnimasi = new JButton ("Animasi");
    buttonSurat = new JButton("Surat");
    buttonAnimasi.addActionListener(new ActionListener (){
        @Override
        public void actionPerformed(ActionEvent e) {
            openDetailFrame();
        }
    });
    mainPanel.add (buttonAnimasi);
    add(mainPanel);
    setVisible (true);
    }
    
    private void openDetailFrame(){
        JFrame detailFrame = new JFrame ("Bio");
        detailFrame.setSize(400, 250);
        detailFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout (new GridLayout(5,2));
        JLabel bioLabel = new JLabel("Bio");
        JComboBox<String>BioComboBox = new JComboBox<>();
        BioComboBox.addItem ("surat");
        JTextField daysfield = new JTextField(10);
        JButton saveButton = new JButton
        saveButton.addActionListener (new ActionListener()
         
    });
    
    public void actionPerformed(ActionEvent e) {
        String nama = namaField.getText();
        String sekolah = sekolahField.getText();
    }
    
    public static void main(String[] args) {
        
    }
    
}
