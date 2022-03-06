/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.awt.Color;
import static java.awt.Color.BLUE;
import java.awt.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import static javafx.print.PrintColor.COLOR;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import static javafx.scene.text.Font.font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariam
 */
public class Example extends Application {
    
    @Override
    public void start(Stage primaryStage) {
     
       /* Label l1=new Label("Hello to java");
        g.getChildren().add(l1);
        l1.setPrefWidth(300);
        l1.setPrefHeight(300);
        l1.setAlignment(Pos.BOTTOM_LEFT);
        l1.setWrapText(true);
       // l1.setTextFill(BLUE);
       l1.setTooltip(new Tooltip("HELLO JAVAFX"));*/
       
        // Label l1=new Label("Username");
         //  g.getChildren().add(l1);
        // l1.setFont(Font.font("Tahoma", FontWeight.BOLD, 18));
        //l1.setBorder(new Border(new BorderStroke(Color.BLUE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT,new Insets(15,0,0,15))));
       /* TextField t1=new TextField("Hello");
        t1.setLayoutX(100);
        t1.setPrefHeight(50);
        t1.setAlignment(Pos.CENTER);
        g.getChildren().add(t1);*/
       /* ImageView imgV=new ImageView("M.jpg");
        imgV.setFitWidth(300);
        imgV.setFitHeight(300);
        Label l=new Label("ADD");
        l.setGraphic(imgV);
        l.setContentDisplay(ContentDisplay.LEFT);
        g.getChildren().add(l);*/
      /* Button btn=new Button("OK");
       btn.setLayoutX(150);
       btn.setLayoutY(150);
       g.getChildren().add(btn);*/
      /*
      PasswordField pass=new PasswordField();
      g.getChildren().add(pass);
      pass.setText("123");
      pass.setPrefWidth(50);
      pass.setLayoutX(50);
      pass.setDisable(true);*/
      
        /*
          HBox hb=new HBox(10);
          hb.setPadding(new Insets(15));
          Button b1=new Button("B1");
          b1.setPrefWidth(120);
            Button b2=new Button("B2");
             b2.setPrefWidth(120);
              Button b3=new Button("B3");
               b3.setPrefWidth(120);
                Button b4=new Button("B4");
                 b4.setPrefWidth(120);
          hb.getChildren().add(b1);
            hb.getChildren().add(b2);
              hb.getChildren().add(b3);
                hb.getChildren().add(b4);*/
        /*
       VBox vb=new VBox(15);
       vb.setAlignment(Pos.CENTER);
       vb.setPadding(new Insets(15));
       Button b1=new Button("B1");
          b1.setPrefWidth(120);
            Button b2=new Button("B2");
             b2.setPrefWidth(120);
              Button b3=new Button("B3");
               b3.setPrefWidth(120);
                Button b4=new Button("B4");
                 b4.setPrefWidth(120);
          vb.getChildren().addAll(b1,b2,b3,b4);*/
        /*
       FlowPane fb=new FlowPane();
       fb.setHgap(10);
       fb.setVgap(15);
       fb.setPadding(new Insets(10));
       fb.setAlignment(Pos.CENTER);
       for(int i=0;i<=10;i++){
           Button b=new Button("Button"+i);
           b.setPrefWidth(100);
           fb.getChildren().add(b);
           
       }*/
        /*
        BorderPane bp =new BorderPane();
        TextField t1=new TextField("Top");
        bp.setTop(t1);
        PasswordField pass=new PasswordField();
        pass.setText("Bottom");
        bp.setBottom(pass);
        VBox vb=new VBox();
          for(int i=0;i<=10;i++){
          vb.getChildren().add(new Button("Button"+i));
          }
       bp.setLeft(vb);
       Label l=new Label("Welcome");
       l.setFont(Font.font("Tahoma",FontWeight.BOLD,FontPosture.ITALIC,24));
       bp.setCenter(l);
       Button b=new Button("Right");
       bp.setRight(b);*/
        /*
        GridPane gp=new GridPane();
        gp.setHgap(10);
        gp.setVgap(10);
        gp.setAlignment(Pos.CENTER);
        Label login =new Label("Login") ;
        login.setFont(Font.font("Tahoma", FontWeight.BOLD,14));
        gp.add(login,0,0);
        Label l1=new Label("username");
        TextField t1=new TextField();
        gp.add(l1, 0, 1);
        gp.add(t1, 1, 1);
         Label l2=new Label("password");
        TextField t2=new TextField();
         gp.add(l2, 0, 2);
        gp.add(t2, 1, 2);
        Button btn =new Button("Login");
        GridPane.setHalignment(btn, HPos.RIGHT);
        gp.add(btn,1,3);*/
        /*
        Pane p=new Pane();
        Button b1 =new Button("button3");
        b1.setLayoutX(0);
        Button b2 =new Button("button2");
        b2.setLayoutX(100);
        p.getChildren().addAll(b1,b2);*/
        /*
        Pane p =new Pane();
        Button b=new Button("OK");
        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                JOptionPane.showMessageDialog(null, "Welcome"); //To change body of generated methods, choose Tools | Templates.
            }
        });
        p.getChildren().add(b);*/
        /*
        VBox vb=new VBox();
        ToggleGroup tg=new ToggleGroup();
        
        RadioButton r1=new RadioButton("r1");
        r1.setSelected(true);
        RadioButton r2=new RadioButton("r2");
        RadioButton r3=new RadioButton("r3");
        RadioButton r4=new RadioButton("r4");
        tg.getToggles().addAll(r1,r2,r3,r4);
        vb.getChildren().addAll(r1,r2,r3,r4);*/
        /*
        HBox hb=new HBox();
        ToggleGroup tg=new ToggleGroup();
        ToggleButton t1=new ToggleButton("Success");
        t1.setSelected(true);
         ToggleButton t2=new ToggleButton("fail");
         hb.getChildren().addAll(t1,t2);
        tg.getToggles().addAll(t1,t2);*/
        /*
        VBox vb=new VBox();
        CheckBox c1=new CheckBox("burgeer");
         CheckBox c2=new CheckBox("fish");
          CheckBox c3=new CheckBox("cheese burgeer");
        vb.getChildren().addAll(c1,c2,c3);*/
                
        Scene scene=new Scene(vb,300,300);
       
        
       
        primaryStage.setTitle("Example");
        primaryStage.setWidth(300);
        primaryStage.setHeight(300);
        primaryStage.setX(900);
        primaryStage.setY(0);
        //primaryStage.setOpacity(0.8);
        primaryStage.setResizable(true);
        primaryStage.setScene(scene);
    
        
        primaryStage.show();
        
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
