import java.awt.*;

import javax.swing.*;

public class HomeScreen extends Panel {
	JButton buttonStructureManager;
	JButton buttonStats;
	
	public HomeScreen(Application app){
		//Cr�ation des trois bouttons de l'�cran d'accueil
		buttonStructureManager = new JButton("Gestionnaire de cat�gories et produits");
		buttonStructureManager.setVisible(true);
		buttonStructureManager.addActionListener(app);
		this.add(buttonStructureManager);
		
		buttonStats = new JButton("Statistiques");
		buttonStats.setVisible(true);
		buttonStats.addActionListener(app);
		this.add(buttonStats);
	}
	
	public JButton getGoToStructureManagerButton(){
		return buttonStructureManager;
	}

	public JButton getGoToStatsButton() {
		return buttonStats;
	}
}
