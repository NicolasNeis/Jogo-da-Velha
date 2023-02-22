package com.example.ogo_da_velha;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SampleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnReset;

    @FXML
    private Label labelPlayer;

    @FXML
    private Button pos0;

    @FXML
    private Button pos1;

    @FXML
    private Button pos2;

    @FXML
    private Button pos3;

    @FXML
    private Button pos4;

    @FXML
    private Button pos5;

    @FXML
    private Button pos6;

    @FXML
    private Button pos7;

    @FXML
    private Button pos8;


    final static int jogador_1 = 1;
    final static int jogador_2 = 2;
    int Player = jogador_1;
    int contador = 0;


    public boolean vencedor() {
        if(pos0.getText() == "X" && pos1.getText() == "X" && pos2.getText() == "X") {
            labelPlayer.setText("JOGADOR 1 VENCEU!!");
            return true;
        } else if(pos0.getText() == "O" && pos1.getText() == "O" && pos2.getText() == "O") {
            labelPlayer.setText("JOGADOR 2 VENCEU!!");
            return true;
        } else if(pos3.getText() == "X" && pos4.getText() == "X" && pos5.getText() == "X") {
            labelPlayer.setText("JOGADOR 1 VENCEU!!");
            return true;
        } else if(pos3.getText() == "O" && pos4.getText() == "O" && pos5.getText() == "O") {
            labelPlayer.setText("JOGADOR 2 VENCEU!!");
            return true;
        } else if(pos6.getText() == "X" && pos7.getText() == "X" && pos8.getText() == "X") {
            labelPlayer.setText("JOGADOR 1 VENCEU!!");
            return true;
        } else if(pos6.getText() == "O" && pos7.getText() == "O" && pos8.getText() == "O") {
            labelPlayer.setText("JOGADOR 2 VENCEU!!");
            return true;
        } else if(pos0.getText() == "X" && pos3.getText() == "X" && pos6.getText() == "X") {
            labelPlayer.setText("JOGADOR 1 VENCEU!!");
            return true;
        } else if(pos0.getText() == "O" && pos3.getText() == "O" && pos6.getText() == "O") {
            labelPlayer.setText("JOGADOR 2 VENCEU!!");
            return true;
        } else if(pos1.getText() == "X" && pos4.getText() == "X" && pos7.getText() == "X") {
            labelPlayer.setText("JOGADOR 1 VENCEU!!");
            return true;
        } else if(pos1.getText() == "O" && pos4.getText() == "O" && pos7.getText() == "O") {
            labelPlayer.setText("JOGADOR 2 VENCEU!!");
            return true;
        } else if(pos2.getText() == "X" && pos5.getText() == "X" && pos8.getText() == "X") {
            labelPlayer.setText("JOGADOR 1 VENCEU!!");
            return true;
        } else if(pos2.getText() == "O" && pos5.getText() == "O" && pos8.getText() == "O") {
            labelPlayer.setText("JOGADOR 2 VENCEU!!");
            return true;
        } else if(pos0.getText() == "X" && pos4.getText() == "X" && pos8.getText() == "X") {
            labelPlayer.setText("JOGADOR 1 VENCEU!!");
            return true;
        } else if(pos0.getText() == "O" && pos4.getText() == "O" && pos8.getText() == "O") {
            labelPlayer.setText("JOGADOR 2 VENCEU!!");
            return true;
        } else if(pos2.getText() == "X" && pos4.getText() == "X" && pos6.getText() == "X") {
            labelPlayer.setText("JOGADOR 1 VENCEU!!");
            return true;
        } else if(pos2.getText() == "O" && pos4.getText() == "O" && pos6.getText() == "O") {
            labelPlayer.setText("JOGADOR 2 VENCEU!!");
            return true;
        }
        return false;
    }

    public void desabilitar() {
        if (labelPlayer.getText() == "JOGADOR 1 VENCEU!!") {
            pos0.setDisable(true);
            pos1.setDisable(true);
            pos2.setDisable(true);
            pos3.setDisable(true);
            pos4.setDisable(true);
            pos5.setDisable(true);
            pos6.setDisable(true);
            pos7.setDisable(true);
            pos8.setDisable(true);
        } else if (labelPlayer.getText() == "JOGADOR 2 VENCEU!!") {
            pos0.setDisable(true);
            pos1.setDisable(true);
            pos2.setDisable(true);
            pos3.setDisable(true);
            pos4.setDisable(true);
            pos5.setDisable(true);
            pos6.setDisable(true);
            pos7.setDisable(true);
            pos8.setDisable(true);
        }
    }

    public void verificaEmpate() {
        if(vencedor() == false) {
            if (contador == 9) {
                labelPlayer.setText("EMPATE!!");
                pos0.setDisable(true);
                pos1.setDisable(true);
                pos2.setDisable(true);
                pos3.setDisable(true);
                pos4.setDisable(true);
                pos5.setDisable(true);
                pos6.setDisable(true);
                pos7.setDisable(true);
                pos8.setDisable(true);
            }
        }
    }


    @FXML
    void selectPos0(ActionEvent event) {
        if (Player == 1) {
            pos0.setText("X");
            labelPlayer.setText("JOGADOR 2");
            Player = 2;
        } else {
            pos0.setText("O");
            labelPlayer.setText("JOGADOR 1");
            Player = 1;
        }
        contador += 1;
        vencedor();
        verificaEmpate();
        desabilitar();
    }

    @FXML
    void selectPos1(ActionEvent event) {
        if (Player == 1) {
            pos1.setText("X");
            labelPlayer.setText("JOGADOR 2");
            Player = 2;
        } else {
            pos1.setText("O");
            labelPlayer.setText("JOGADOR 1");
            Player = 1;
        }
        contador += 1;
        vencedor();
        verificaEmpate();
        desabilitar();
    }

    @FXML
    void selectPos2(ActionEvent event) {
        if (Player == 1) {
            pos2.setText("X");
            labelPlayer.setText("JOGADOR 2");
            Player = 2;
        } else {
            pos2.setText("O");
            labelPlayer.setText("JOGADOR 1");
            Player = 1;
        }
        contador += 1;
        vencedor();
        verificaEmpate();
        desabilitar();
    }

    @FXML
    void selectPos3(ActionEvent event) {
        if (Player == 1) {
            pos3.setText("X");
            labelPlayer.setText("JOGADOR 2");
            Player = 2;
        } else {
            pos3.setText("O");
            labelPlayer.setText("JOGADOR 1");
            Player = 1;
        }
        contador += 1;
        vencedor();
        verificaEmpate();
        desabilitar();
    }

    @FXML
    void selectPos4(ActionEvent event) {
        if (Player == 1) {
            pos4.setText("X");
            labelPlayer.setText("JOGADOR 2");
            Player = 2;
        } else {
            pos4.setText("O");
            labelPlayer.setText("JOGADOR 1");
            Player = 1;
        }
        contador += 1;
        vencedor();
        verificaEmpate();
        desabilitar();
    }

    @FXML
    void selectPos5(ActionEvent event) {
        if (Player == 1) {
            pos5.setText("X");
            labelPlayer.setText("JOGADOR 2");
            Player = 2;
        } else {
            pos5.setText("O");
            labelPlayer.setText("JOGADOR 1");
            Player = 1;
        }
        contador += 1;
        vencedor();
        verificaEmpate();
        desabilitar();
    }

    @FXML
    void selectPos6(ActionEvent event) {
        if (Player == 1) {
            pos6.setText("X");
            labelPlayer.setText("JOGADOR 2");
            Player = 2;
        } else {
            pos6.setText("O");
            labelPlayer.setText("JOGADOR 1");
            Player = 1;
        }
        contador += 1;
        vencedor();
        verificaEmpate();
        desabilitar();
    }

    @FXML
    void selectPos7(ActionEvent event) {
        if (Player == 1) {
            pos7.setText("X");
            labelPlayer.setText("JOGADOR 2");
            Player = 2;
        } else {
            pos7.setText("O");
            labelPlayer.setText("JOGADOR 1");
            Player = 1;
        }
        contador += 1;
        vencedor();
        verificaEmpate();
        desabilitar();
    }

    @FXML
    void selectPos8(ActionEvent event) {
        if (Player == 1) {
            pos8.setText("X");
            labelPlayer.setText("JOGADOR 2");
            Player = 2;
        } else {
            pos8.setText("O");
            labelPlayer.setText("JOGADOR 1");
            Player = 1;
        }
        contador += 1;
        vencedor();
        verificaEmpate();
        desabilitar();
    }

    @FXML
    void selectReset(ActionEvent event) {
        pos0.setText("");
        pos1.setText("");
        pos2.setText("");
        pos3.setText("");
        pos4.setText("");
        pos5.setText("");
        pos6.setText("");
        pos7.setText("");
        pos8.setText("");
        pos0.setDisable(false);
        pos1.setDisable(false);
        pos2.setDisable(false);
        pos3.setDisable(false);
        pos4.setDisable(false);
        pos5.setDisable(false);
        pos6.setDisable(false);
        pos7.setDisable(false);
        pos8.setDisable(false);
        labelPlayer.setText("JOGO DA VELHA");
        contador = 0;
    }

    @FXML
    void initialize() {
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Sample.fxml'.";
        assert labelPlayer != null : "fx:id=\"labelPlayer\" was not injected: check your FXML file 'Sample.fxml'.";
        assert pos0 != null : "fx:id=\"pos0\" was not injected: check your FXML file 'Sample.fxml'.";
        assert pos1 != null : "fx:id=\"pos1\" was not injected: check your FXML file 'Sample.fxml'.";
        assert pos2 != null : "fx:id=\"pos2\" was not injected: check your FXML file 'Sample.fxml'.";
        assert pos3 != null : "fx:id=\"pos3\" was not injected: check your FXML file 'Sample.fxml'.";
        assert pos4 != null : "fx:id=\"pos4\" was not injected: check your FXML file 'Sample.fxml'.";
        assert pos5 != null : "fx:id=\"pos5\" was not injected: check your FXML file 'Sample.fxml'.";
        assert pos6 != null : "fx:id=\"pos6\" was not injected: check your FXML file 'Sample.fxml'.";
        assert pos7 != null : "fx:id=\"pos7\" was not injected: check your FXML file 'Sample.fxml'.";
        assert pos8 != null : "fx:id=\"pos8\" was not injected: check your FXML file 'Sample.fxml'.";

    }

}
