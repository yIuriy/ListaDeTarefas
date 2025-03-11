module org.example.listadetarefas {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.listadetarefas to javafx.fxml;
    exports org.example.listadetarefas;
}