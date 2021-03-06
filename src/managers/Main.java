package managers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/views/login/login.fxml"));

        primaryStage.setScene(new Scene(root));

        primaryStage.setResizable(false);

        primaryStage.initStyle(StageStyle.UNDECORATED);

        primaryStage.getIcons().add(new Image("/icons/icone.png"));

        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
