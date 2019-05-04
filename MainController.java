package app.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import java.io.IOException;



public class MainController {

	Parent parent;
	
    @FXML
   void grupa1klik(MouseEvent event) {
    	try {
    	Stage stageGrupa1 = new Stage();
		parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/Grupa1.fxml"));
        Scene scene = new Scene(parent);
        stageGrupa1.setScene(scene);
        stageGrupa1.setTitle("PKS Mustangi: 2001-2003");
        stageGrupa1.show();
        
    	} catch (Exception e) {
			e.printStackTrace();
		}

    }

    @FXML
    void grupa2klik(MouseEvent event) {
    	try {
        	Stage stageGrupa2 = new Stage();
    		parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/Grupa2.fxml"));
            Scene scene = new Scene(parent);
            stageGrupa2.setScene(scene);
            stageGrupa2.setTitle("PKS Mustangi: 2003");
            stageGrupa2.show();
            
        	} catch (Exception e) {
    			e.printStackTrace();
    }
}
    @FXML
    void grupa3klik(MouseEvent event) {
    	try {
        	Stage stageGrupa3 = new Stage();
    		parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/Grupa3.fxml"));
            Scene scene = new Scene(parent);
            stageGrupa3.setScene(scene);
            stageGrupa3.setTitle("PKS Mustangi: 2007");
            stageGrupa3.show();
            
        	} catch (Exception e) {
    			e.printStackTrace();
    }
}
    @FXML
    void grupa4klik(MouseEvent event) {
    	try {
        	Stage stageGrupa4 = new Stage();
    		parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/Grupa4.fxml"));
            Scene scene = new Scene(parent);
            stageGrupa4.setScene(scene);
            stageGrupa4.setTitle("PKS Mustangi: 2009");
            stageGrupa4.show();
            
        	} catch (Exception e) {
    			e.printStackTrace();
    }
}
    
    @FXML
    void treningiklik(MouseEvent event) {
    	try {
        	Stage stageTreningi = new Stage();
    		parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/Treningi.fxml"));
            Scene scene = new Scene(parent);
            stageTreningi.setScene(scene);
            stageTreningi.setTitle("Treningi");
            stageTreningi.show();
            
        	} catch (Exception e) {
    			e.printStackTrace();
    }
}
    @FXML
    void meczeklik(MouseEvent event) {
    	try {
        	Stage stageMecze = new Stage();
    		parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/Mecze.fxml"));
            Scene scene = new Scene(parent);
            stageMecze.setScene(scene);
            stageMecze.setTitle("Mecze");
            stageMecze.show();
            
        	} catch (Exception e) {
    			e.printStackTrace();
    }
}
    @FXML
    void kontaktyklik(MouseEvent event) {
    	try {
        	Stage stageKontakty = new Stage();
    		parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/Kontakty.fxml"));
            Scene scene = new Scene(parent);
            stageKontakty.setScene(scene);
            stageKontakty.setTitle("Kontakty");
            stageKontakty.show();
            
        	} catch (Exception e) {
    			e.printStackTrace();
    }
}
    @FXML
    void finanseklik(MouseEvent event) {
    	try {
        	Stage stageFinanse = new Stage();
    		parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/Finanse.fxml"));
            Scene scene = new Scene(parent);
            stageFinanse.setScene(scene);
            stageFinanse.setTitle("Finanse");
            stageFinanse.show();
            
        	} catch (Exception e) {
    			e.printStackTrace();
    }
}
}
