package ui;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddBookWindow extends Stage implements LibWindow{
	//fields
	private TextField txtTitle;
	private TextField txtIsbn;
	private ComboBox<String> cboAuthors;
	private TextField txtAvailability;
	private TextField txtCopies;
	private Button btnBackMain;
	private Button btnAdd;
	private Button btnCancel;
	

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
