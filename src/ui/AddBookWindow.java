package ui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddBookWindow extends Stage implements LibWindow{
	//fields
	@FXML
	private TextField txtTitle;
	@FXML
	private TextField txtIsbn;
	@FXML
	private ComboBox<String> cboAuthors;
	@FXML
	private TextArea txaAuthorListDisplay;
	@FXML
	private Button btnAddNewAuthor;
	@FXML
	private TextField txtAvailability;
	@FXML
	private TextField txtCopies;
	@FXML
	private Button btnBackMain;
	@FXML
	private Button btnAdd;
	@FXML
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
