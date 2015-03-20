import com.sun.javafx.accessible.utils.ToggleState;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

public class PokerTableController {


	@FXML
	private ToggleButton togButton;

	@FXML
	private ToggleButton togButton2;
	
	@FXML
	private ToggleButton togButton3;
	
	@FXML
	private ToggleButton togButton4;

	private boolean isSitToggled = false;
	private MainApp mainApp;

	
	
	// not used yet
	private void initialize() {
	}


	
	//not used yet
	public PokerTableController() {	
		while (!isSitToggled) {
			((ImageView).
		}
		
	}

	

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;

	}

	// not used yet
	public boolean isSitToggled(){
		return isSitToggled;
	}

	
	// event listener on toggle
	@FXML
	private void toggleSit(ActionEvent event) {
	if (((ToggleButton)event.getTarget()).isSelected()) {
		((ToggleButton)event.getTarget()).textProperty().set("Leave");
		isSitToggled = true;
	}
		else ((ToggleButton)event.getTarget()).textProperty().set("Sit");
		isSitToggled = false;
	}
	
	
	
}
