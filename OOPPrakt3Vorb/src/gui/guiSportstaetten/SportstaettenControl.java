package gui.guiSportstaetten;

import business.FreizeitbaederModel;
import javafx.stage.Stage;

public class SportstaettenControl {
	
	private FreizeitbaederModel freizeitbaederModel;
	private SportstaettenView sportstaettenView;
	
	public SportstaettenControl( Stage primaryStage) {
//		this.freizeitbaederModel = new FreizeitbaederModel();
		this.freizeitbaederModel = FreizeitbaederModel.getInstance();
		this.sportstaettenView = new SportstaettenView(this,primaryStage,freizeitbaederModel);
		}

}
