package ui;

import java.io.Serializable;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CheckoutBookWindow extends Stage implements LibWindow{
	//fields
	@FXML
	private TextField txtMemberID;
	@FXML
	private TextField txtISBN;
	@FXML
	private Button btnCheckout;
	@FXML
	private ListView<String> lvRecords;
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isInitialized() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void isInitialized(boolean val) {
		// TODO Auto-generated method stub
		
	}

}
