package UI;

import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

public class MainWindow implements ActionListener {
	JFrame frame;
	JMenuBar menuBar;
	JMenu menu,menu2,menu3;
	JMenuItem menuItem1,menuItem2,menuItem3,menuItem4,menuItem5,menuItem6,menuItem7
	,menuItem8,menuItem9,menuItem10;
	JButton JButton1,JButton2,JButton3;
	
	
	public MainWindow() {
		menuBar=new JMenuBar();
		
		menu= new JMenu("File");
		menuBar.add(menu);
		
		menu2= new JMenu("Simulation");
		menuBar.add(menu2);
		
		menu3= new JMenu("Help");
		menuBar.add(menu3);
		
		/// add to File options.
		menuItem1 = new JMenuItem("Load");
		menuItem1.addActionListener(this);
		menu.add(menuItem1);
		
		menuItem2 = new JMenuItem("Statistics");
		menuItem2.addActionListener(this);
		menu.add(menuItem2);
		
		menuItem3 = new JMenuItem("Edit Mutations");
		menuItem3.addActionListener(this);
		menu.add(menuItem3);
		
		menuItem4 = new JMenuItem("Exit");
		menuItem4.addActionListener(this);
		menu.add(menuItem4);
		
		/// add to Simulation options.
		menuItem5 = new JMenuItem("Play");
		menuItem5.addActionListener(this);
		menu2.add(menuItem5);
		
		menuItem6 = new JMenuItem("Pause");
		menuItem6.addActionListener(this);
		menu2.add(menuItem6);
		
		menuItem7 = new JMenuItem("Stop");
		menuItem7.addActionListener(this);
		menu2.add(menuItem7);
		
		menuItem8 = new JMenuItem("Day Per Ticks S");
		menuItem8.addActionListener(this);
		menu2.add(menuItem8);
		
		/// add to Help options.
		menuItem9 = new JMenuItem("Help");
		menuItem9.addActionListener(this);
		menu3.add(menuItem9);
		
		menuItem10 = new JMenuItem("About");
		menuItem10.addActionListener(this);
		menu3.add(menuItem10);		
		
		JButton1=new JButton("Menu");
		JButton1.addActionListener(this);


		JButton2=new JButton("Map Panel");
		JButton2.addActionListener(this);
		

		JButton3=new JButton("Simulation Speed Slider");
		JButton3.addActionListener(this);
		
		
		frame=new JFrame("Main Window");
		BorderLayout myBorderLayout = new BorderLayout();
		myBorderLayout.setHgap(20);
		myBorderLayout.setVgap(20);
		frame.setLayout(myBorderLayout);
		frame.add(JButton1, BorderLayout.CENTER);
		frame.add(JButton2, BorderLayout.NORTH);
		frame.add(JButton3, BorderLayout.SOUTH);

		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(420,420);
		frame.setJMenuBar(menuBar);
	

		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==menuItem1) {
			System.out.println("LOAD");
		}
		if(e.getSource()==menuItem2) {
			System.out.println("Statistics");
		}
		if(e.getSource()==menuItem3) {
			System.out.println("Mutations Edit –");
		}
		if(e.getSource()==menuItem4) {
			System.out.println("Exit");
		}
		if(e.getSource()==menuItem5) {
			System.out.println("Play");
		}
		if(e.getSource()==menuItem6) {
			System.out.println("Pause");
		}
		if(e.getSource()==menuItem7) {
			System.out.println("Stop");
		}
		if(e.getSource()==menuItem8) {
			System.out.println("y Per Ticks S");
		}
		if(e.getSource()==menuItem9) {
			System.out.println("Help");
		}
		if(e.getSource()==menuItem10) {
			System.out.println("About");
		}
		if(e.getSource()==JButton1) {
			System.out.println("Menu");
		}
		if(e.getSource()==JButton2) {
			System.out.println("Map Panel");
		}
		if(e.getSource()==JButton3) {
			SliderDemo sliderDemo= new SliderDemo();
			
		}
	}
	public static void main(String[] args) {
		MainWindow main=new MainWindow();
	}
	
}




