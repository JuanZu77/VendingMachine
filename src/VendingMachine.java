import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VendingMachine extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf1;
	private JButton boton100;
	private JButton boton50;
	private JButton boton10;
	private JButton boton5;
	private JButton botonBalance;
	
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	
	private JLabel labelTotal;
	
	private int bA=0; 
	private int bB=0;
	private int bC=0;
	private int bD=0;
	
	private int suma=0;
	private int balance=0;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VendingMachine frame = new VendingMachine();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	                                   
	public VendingMachine() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label1 = new JLabel("Producto A");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label1.setBounds(45, 139, 82, 14);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("Producto B");
		label2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label2.setBounds(153, 139, 82, 14);
		contentPane.add(label2);
		
		JLabel label3 = new JLabel("Producto C");
		label3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label3.setBounds(268, 139, 82, 14);
		contentPane.add(label3);
		
		JLabel label4 = new JLabel("Producto D");
		label4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label4.setBounds(374, 139, 82, 14);
		contentPane.add(label4);
		
		boton1 = new JButton("$175");              
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				int valor=Integer.parseInt(tf1.getText());
				
				if(valor==175) 
				{
					bA++;
					balance=balance+valor;
					suma=0;
					tf1.setText("");
				}
				else 
				{
					suma=0;
					tf1.setText("Monto $175");
				}
				
						
				if (bA==10)
				{
					boton1.setEnabled(false);
				}
								
				repaint();
				
			}
		});
		boton1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		boton1.setBounds(27, 170, 100, 20);
		contentPane.add(boton1);
		
		boton2 = new JButton("$260");
		boton2.addActionListener(new ActionListener() {         
			public void actionPerformed(ActionEvent e) {
				
				int valor=Integer.parseInt(tf1.getText());
				if(valor==260) 
				{
					bB++;
					balance=balance+valor;
					suma=0;
					tf1.setText("");
				}
				else 
				{
					suma=0;
					tf1.setText("Monto $260");
				}
				
				
				if (bB==10)
				{
					boton2.setEnabled(false);
				}
								
				repaint();
			}
		});
		boton2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		boton2.setBounds(135, 170, 100, 20);
		contentPane.add(boton2);
		
		boton3 = new JButton("$80");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {       
				
				int valor=Integer.parseInt(tf1.getText());
				if(valor==80) 
				{
					bC++;
					balance=balance+valor;
					suma=0;
					tf1.setText("");
				}
				else 
				{
					suma=0;
					tf1.setText("Monto $80");
				}
				
				
				if (bC==10)
				{
					boton3.setEnabled(false);
				}
								
				repaint();				
			}
		});
		boton3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		boton3.setBounds(245, 170, 100, 20);
		contentPane.add(boton3);
		
		boton4 = new JButton("$305");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {       
				
				int valor=Integer.parseInt(tf1.getText());
				if(valor==305) 
				{
					bD++;
					balance=balance+valor;
					suma=0;
					tf1.setText("");
				}
				else 
				{	
					suma=0;
					tf1.setText("Monto $305");
				}
				
				
				if (bD==10)
				{
					boton4.setEnabled(false);
				}
								
				repaint();	
			}
		});
		boton4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		boton4.setBounds(355, 170, 100, 20);
		contentPane.add(boton4);
		
		boton100 = new JButton("$100");             	    
		boton100.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int valor=100;
				suma=suma+valor;
				tf1.setText(String.valueOf(suma));
				
			}
		});
		boton100.setFont(new Font("Tahoma", Font.PLAIN, 11));
		boton100.setBounds(27, 240, 100, 20);
		contentPane.add(boton100);
		
		boton50 = new JButton("$50");
		boton50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {     
				
				int valor=50;
				suma=suma+valor;
				tf1.setText(String.valueOf(suma));
			}
		});
		boton50.setFont(new Font("Tahoma", Font.PLAIN, 11));
		boton50.setBounds(135, 239, 100, 20);
		contentPane.add(boton50);
		
		boton10 = new JButton("$10");
		boton10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {   
				
				int valor=10;
				suma=suma+valor;
				tf1.setText(String.valueOf(suma));
			}
		});
		boton10.setFont(new Font("Tahoma", Font.PLAIN, 11));
		boton10.setBounds(245, 239, 100, 20);
		contentPane.add(boton10);
		
		boton5 = new JButton("$5");
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {    
				
				int valor=5;
				suma=suma+valor;
				tf1.setText(String.valueOf(suma));
			}
		});
		boton5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		boton5.setBounds(356, 239, 100, 20);
		contentPane.add(boton5);
		
		JLabel label5 = new JLabel("IMPORTE TOTAL");
		label5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label5.setBounds(85, 309, 100, 14);
		contentPane.add(label5);
		
		tf1 = new JTextField();
		tf1.setBounds(195, 307, 149, 20);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		botonBalance = new JButton("Balance");
		botonBalance.addActionListener(new ActionListener() {    
			public void actionPerformed(ActionEvent e) {
				
				labelTotal.setText("$ "+String.valueOf(balance));
							
			}
		});
		botonBalance.setFont(new Font("Tahoma", Font.PLAIN, 11));
		botonBalance.setBounds(27, 376, 89, 23);
		contentPane.add(botonBalance);
		
		labelTotal = new JLabel("$...");
		labelTotal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelTotal.setBounds(135, 380, 50, 14);
		contentPane.add(labelTotal);
	
	}       

	
	
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		                        
		g.setColor(Color.black);
		g.drawRect(20, 40, 460, 200);
		
		                       
		g.setColor(Color.white);
		g.fillRect(35, 50, 100, 100);

		
		g.setColor(Color.white);
		g.fillRect(145, 50, 100, 100);
		
		g.setColor(Color.white);
		g.fillRect(255, 50, 100, 100);

		
		g.setColor(Color.white);
		g.fillRect(365, 50, 100, 100);

		
		if (bA<10)
		{
		g.setColor(Color.green);
		g.fillOval(35, 50, 100, 100);
		}
		if (bA==10)
		{
			g.setColor(Color.red);
			g.fillOval(35, 50, 100, 100);
		}
				
		if (bB<10)
		{
			g.setColor(Color.green);
			g.fillOval(145, 50, 100, 100);		
		}
		if (bB==10)
		{
			g.setColor(Color.red);
			g.fillOval(145, 50, 100, 100);		
		}
			
		if (bC<10)
		{
			g.setColor(Color.green);
			g.fillOval(255, 50, 100, 100);	
		}
		if (bC==10)
		{
			g.setColor(Color.red);
			g.fillOval(255, 50, 100, 100);
		}
				
		if (bD<10)
		{
			g.setColor(Color.green);
			g.fillOval(365, 50, 100, 100);
		}
		if (bD==10)
		{
			g.setColor(Color.red);
			g.fillOval(365, 50, 100, 100);
		}
		
		if(bA==10&&bB==10&&bC==10&&bD==10)
		{
			setTitle("FUERA DE SERVICIO");
		}
			
	}      
	
				
	}   



