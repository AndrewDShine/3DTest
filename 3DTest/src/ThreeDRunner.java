import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.Timer;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

@SuppressWarnings({ "serial", "unused" })
public class ThreeDRunner extends JPanel
	{
		static Cube cube;
		public static void main(String[] args)
			{
				JFrame frame = new JFrame("3D");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(1000, 880);
				ThreeDRunner game = new ThreeDRunner();
				frame.add(game);
				frame.setVisible(true);
				frame.setResizable(false);
				game.setFocusable(true);
			}
		public ThreeDRunner()
		{
			setBackground(Color.BLACK);
			cube = new Cube();
			Timer timer = new Timer(10, new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
					{
						repaint();
					}
			});
		}
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.setColor(Color.WHITE);
			Vector[] vects = cube.getPoints();
			for(int i = 1; i < vects.length; i++)
				{
					
				}
		}

	}
