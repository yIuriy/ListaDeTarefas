package org.example.listadetarefas;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class Note {
    private final Label labelForNotes;

    Note(String text){
        Border border = new Border( new BorderStroke(
                Color.BLACK,
                BorderStrokeStyle.SOLID,
                new CornerRadii(1),
                new BorderWidths(1)
        ));
        this.labelForNotes = new Label();
        labelForNotes.setText(text);
        labelForNotes.setBorder(border);
        labelForNotes.setMinWidth(530);
        labelForNotes.setTextFill(Color.BLACK);
        labelForNotes.setBackground(Background.fill(Color.WHITE));
        labelForNotes.setPadding(new Insets(3));
    }

    public Label getLabel(){
        return labelForNotes;
    }
}
