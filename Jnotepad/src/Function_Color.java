import java.awt.Color;

public class Function_Color {
		GUI gui;
	public Function_Color(GUI gui) {
				this.gui = gui;
	}

	public void changeColor(String color) {
				switch(color) {
		case "White":
			gui.window.getContentPane().setBackground(Color.white);
			gui.menuBar.setBackground(Color.white);
			gui.menuFile.setBackground(Color.white);
			gui.menuEdit.setBackground(Color.white);
			gui.menuFormat.setBackground(Color.white);
			gui.menuColor.setBackground(Color.white);
			gui.menuAbout.setBackground(Color.white);
			gui.textArea.setBackground(Color.white);
			gui.menuBar.setForeground(Color.black);		    
			gui.textArea.setForeground(Color.black);
			gui.menuBar.setOpaque(true);
			break;
		case "Black":
			gui.window.getContentPane().setBackground(Color.black);
			gui.menuBar.setBackground(Color.black);
			gui.menuFile.setBackground(Color.black);
			gui.menuEdit.setBackground(Color.black);
			gui.menuFormat.setBackground(Color.black);
			gui.menuColor.setBackground(Color.black);
			gui.menuAbout.setBackground(Color.black);
			gui.textArea.setBackground(Color.black);
			gui.menuBar.setForeground(Color.green);		    
			gui.textArea.setForeground(Color.green);
			gui.menuBar.setOpaque(true);
			break;		
		case "Gray":
			gui.window.getContentPane().setBackground(Color.gray);
			gui.menuBar.setBackground(Color.gray);
			gui.menuFile.setBackground(Color.gray);
			gui.menuEdit.setBackground(Color.gray);
			gui.menuFormat.setBackground(Color.gray);
			gui.menuColor.setBackground(Color.gray);
			gui.menuAbout.setBackground(Color.gray);
			gui.textArea.setBackground(Color.gray);
			gui.menuBar.setForeground(Color.black);		    
			gui.textArea.setForeground(Color.black);
			gui.menuBar.setOpaque(true);
			break;
		}
	}
}