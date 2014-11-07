import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class GameGUI {
	
	public void start(){
		JFrame window = new JFrame ("_-- Pokedeck --_");
		window.setSize (800, 100);
		window.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		MenuGUI menu = new MenuGUI();
		JMenuBar menuBar = menu.menuBar;
		window.setJMenuBar (menuBar);
		window.setVisible (true);
	}
}
