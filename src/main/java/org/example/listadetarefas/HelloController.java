package org.example.listadetarefas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.*;


public class HelloController {
    public TextField noteTextField;
    public AnchorPane anchorPaneMain;
    public AnchorPane notesAnchorPane;
    public VBox notesVBox;
    public ScrollPane notesScrollPane;
    @FXML
    protected Button btnAddNote;
    private int noteCounter = 1;

    @FXML
    protected void showMessage(ActionEvent event) {
        if (!noteTextField.getText().trim().isEmpty()) {
            Note note = new Note((noteCounter + ": " + noteTextField.getText()));
            noteCounter++;
            notesVBox.getChildren().add(note.getLabel());
            noteTextField.setText(" ");
            note.getLabel().setOnMouseClicked(mouseEvent -> {
                notesVBox.getChildren().remove(note.getLabel());
                noteCounter--;
            });
        }
    }
}
