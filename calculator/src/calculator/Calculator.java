/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author ASUS
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    double angka1 = 0;
    double angka2 = 0;
    String jenisOperasi = "";
    double hasil = 0;

    JTextField nama = new JTextField();
    Button cb1 = new Button("1");
    Button cb2 = new Button("2");
    Button cb3 = new Button("3");
    Button cb4 = new Button("+");
    Button cb5 = new Button("4");
    Button cb6 = new Button("5");
    Button cb7 = new Button("6");
    Button cb8 = new Button("-");
    Button cb9 = new Button("7");
    Button cb10 = new Button("8");
    Button cb11 = new Button("9");
    Button cb12 = new Button("*");
    Button cb13 = new Button("0");
    Button cb14 = new Button("c");
    Button cb15 = new Button("=");
    Button cb16 = new Button("/ ");

    Calculator() {
        setTitle("kalkulatorku");
        setSize(450, 400);
        setLocation(450, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void objek1() {
        getContentPane().setLayout(null);
        getContentPane().add(nama);
        getContentPane().add(cb1);
        getContentPane().add(cb2);
        getContentPane().add(cb3);
        getContentPane().add(cb4);
        getContentPane().add(cb5);
        getContentPane().add(cb6);
        getContentPane().add(cb7);
        getContentPane().add(cb8);
        getContentPane().add(cb9);
        getContentPane().add(cb10);
        getContentPane().add(cb11);
        getContentPane().add(cb12);
        getContentPane().add(cb13);
        getContentPane().add(cb14);
        getContentPane().add(cb15);
        getContentPane().add(cb16);
        nama.setBounds(40, 30, 350, 50);
        cb1.setBounds(40, 100, 80, 50);
        cb2.setBounds(130, 100, 80, 50);
        cb3.setBounds(220, 100, 80, 50);
        cb4.setBounds(310, 100, 80, 50);
        cb5.setBounds(40, 160, 80, 50);
        cb6.setBounds(130, 160, 80, 50);
        cb7.setBounds(220, 160, 80, 50);
        cb8.setBounds(310, 160, 80, 50);
        cb9.setBounds(40, 220, 80, 50);
        cb10.setBounds(130, 220, 80, 50);
        cb11.setBounds(220, 220, 80, 50);
        cb12.setBounds(310, 220, 80, 50);
        cb13.setBounds(40, 280, 80, 50);
        cb14.setBounds(130, 280, 80, 50);
        cb15.setBounds(220, 280, 80, 50);
        cb16.setBounds(310, 280, 80, 50);
        setVisible(true);
    }

    void reaksi() {
        cb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nama.setText(nama.getText() + "1");
            }
        });
        cb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nama.setText(nama.getText() + "2");
            }
        });
        cb3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nama.setText(nama.getText() + "3");
            }
        });
        cb5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nama.setText(nama.getText() + "4");
            }
        });
        cb6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nama.setText(nama.getText() + "5");
            }
        });
        cb7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nama.setText(nama.getText() + "6");
            }
        });
        cb9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nama.setText(nama.getText() + "7");
            }
        });
        cb10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nama.setText(nama.getText() + "8");
            }
        });
        cb11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nama.setText(nama.getText() + "9");
            }
        });
        cb13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nama.setText(nama.getText() + "0");
            }
        });
        cb4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                angka1 = Double.parseDouble(nama.getText());
                nama.setText("");
                jenisOperasi = "+";
            }
        });
        cb8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                angka1 = Double.parseDouble(nama.getText());
                nama.setText("");
                jenisOperasi = "-";
            }
        });
        cb12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                angka1 = Double.parseDouble(nama.getText());
                nama.setText("");
                jenisOperasi = "*";
            }
        });
        cb16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                angka1 = Double.parseDouble(nama.getText());
                nama.setText("");
                jenisOperasi = "/";
            }
        });
        cb15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                angka2 = Double.parseDouble(nama.getText());
                try {
                    if (jenisOperasi.equals("+")) {
                        hasil = angka1 + angka2;
                        nama.setText(Double.toString(hasil));
                    }
                    if (jenisOperasi.equals("-")) {
                        hasil = angka1 - angka2;
                        nama.setText(Double.toString(hasil));
                    }
                    if (jenisOperasi.equals("*")) {
                        hasil = angka1 * angka2;
                        nama.setText(Double.toString(hasil));
                    }
                    if (jenisOperasi.equals("/")) {
                        hasil = angka1 / angka2;
                        nama.setText(Double.toString(hasil));
                    }
                } catch (ArithmeticException z) {
                    System.out.println("error");
                }
            }
        });
        cb14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                nama.setText("");
            }
        });
    }

    public static void main(String[] args) {
        Calculator zz = new Calculator();
        zz.objek1();
        zz.reaksi();
    }
}
