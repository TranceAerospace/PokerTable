import com.sun.javafx.accessible.utils.ToggleState;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

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

	
	
	
	@FXML
	private void initialize() {
	}


	

	public PokerTableController() {	
		
		
	}


	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;

	}


	public boolean isSitToggled(){
		return isSitToggled;
	}

	

	@FXML
	private void toggleSit(ActionEvent event) {
	if (((ToggleButton)event.getTarget()).isSelected()) {
		((ToggleButton)event.getTarget()).textProperty().set("Leave");
	}
		else ((ToggleButton)event.getTarget()).textProperty().set("Sit");
	}
	
	
	
}
