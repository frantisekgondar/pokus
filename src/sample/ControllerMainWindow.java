package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class ControllerMainWindow {

    int cislo1;

    @FXML
    TextField display;

    @FXML
    public void napisSedem() {

        String Napis = "Sedem";
        System.out.println(Napis);
    }

    @FXML
    public void napisOsem() {

        String Napis = "Osem";
        System.out.println(Napis);
    }

    @FXML
    public void napisDevet() {

        String Napis = "devet";
        System.out.println(Napis);
    }

    @FXML
    public void napisDeleno() {
        String Napis = "Deleno";
        System.out.println(Napis);
    }

    @FXML
    public void napisStyri() {

        String Napis = "Styri";
        System.out.println(Napis);
    }

    @FXML
    public void napisPet() {

        String Napis = "Pet";
        System.out.println(Napis);
    }

    @FXML
    public void napisSest() {

        String Napis = "Sest";
        System.out.println(Napis);
    }

    @FXML
    public void napisKrat() {

        String Napis = "Krat";
        System.out.println(Napis);
    }

    @FXML
    public void napisJedna() {

        String Napis = "Jedna";
        System.out.println(Napis);
    }

    @FXML
    public void napisDva() {

        String Napis = "Dva";
        System.out.println(Napis);
    }

    @FXML
    public void napisTri() {

        String Napis = "Tri";
        System.out.println(Napis);
    }

    @FXML
    public void napisMinus() {

        String Napis = "Minus";
        System.out.println(Napis);
    }

    @FXML
    public void napisNula() {

        String Napis = "Nula";
        System.out.println(Napis);
    }

    @FXML
    public void napisSqrt() {

        String Napis = "Sqrt";
        System.out.println(Napis);
    }

    @FXML
    public void napisRovnasa() {

        String Napis = "Rovnasa";
        System.out.println(Napis);
    }

    @FXML
    public void napisPlusMinus() {

        String Napis = "PlusMinus";
        System.out.println(Napis);
    }

    @FXML
    public void napisBackspace() {

        String Napis = "Backspace";
        System.out.println(Napis);
    }

    @FXML
    public void napisC() {

        String Napis = "C";
        System.out.println(Napis);
    }

    @FXML
    public void vypisanieTextu() {
        display.getText();
        System.out.println(display.getText());

    }

    @FXML
    public void napisPlus() {

        String Napis = "Plus";
        System.out.println(Napis);

    }


    @FXML
    public void napisSedem(ActionEvent a) {
        Object mujobjecktTlacidlo = a.getSource();
        Button pomocne = (Button) mujobjecktTlacidlo;
        pomocne.getText();
        System.out.println(pomocne.getText());
        display.setText("7");

    }

    @FXML
    public void napisOsem(ActionEvent a) {
        Object mujobjecktTlacidlo = a.getSource();
        Button pomocne = (Button) mujobjecktTlacidlo;
        pomocne.getText();
        System.out.println(pomocne.getText());
        display.setText("8");
    }

    @FXML
    public void napisCislo(ActionEvent a) {
        Object mujobjecktTlacidlo = a.getSource();
        Button pomocne = (Button) mujobjecktTlacidlo;
        pomocne.getText();
        System.out.println(pomocne.getText());
        display.setText(pomocne.getText());
    }

    @FXML
    public void napisDeleno(ActionEvent a) {
        Object mujobjecktTlacidlo = a.getSource();
        Button pomocne = (Button) mujobjecktTlacidlo;
        pomocne.getText();
        System.out.println(pomocne.getText());
        display.setText("/");
    }

    @FXML
    public void napisStyri(ActionEvent a) {
        Object mujobjecktTlacidlo = a.getSource();
        Button pomocne = (Button) mujobjecktTlacidlo;
        pomocne.getText();
        System.out.println(pomocne.getText());
        display.setText("4");
    }

    @FXML
    public void napisPet(ActionEvent a) {
        Object mujobjecktTlacidlo = a.getSource();
        Button pomocne = (Button) mujobjecktTlacidlo;
        pomocne.getText();
        System.out.println(pomocne.getText());
        display.setText("5");
    }

    @FXML
    public void napisSest(ActionEvent a) {
        Object mujobjecktTlacidlo = a.getSource();
        Button pomocne = (Button) mujobjecktTlacidlo;
        pomocne.getText();
        System.out.println(pomocne.getText());
        display.setText("6");
    }

    @FXML
    public void napisKrat(ActionEvent a) {
        Object mujobjecktTlacidlo = a.getSource();
        Button pomocne = (Button) mujobjecktTlacidlo;
        pomocne.getText();
        System.out.println(pomocne.getText());
        display.setText("*");
    }

    @FXML
    public void napisJedna(ActionEvent a) {
        Object mujobjecktTlacidlo = a.getSource();
        Button pomocne = (Button) mujobjecktTlacidlo;
        pomocne.getText();
        System.out.println(pomocne.getText());
        display.setText("1");
    }

    @FXML
    public void napisDva(ActionEvent a) {
        Object mujobjecktTlacidlo = a.getSource();
        Button pomocne = (Button) mujobjecktTlacidlo;
        pomocne.getText();
        System.out.println(pomocne.getText());
        display.setText("2");
    }

    @FXML
    public void napisTri(ActionEvent a) {
        Object mujobjecktTlacidlo = a.getSource();
        Button pomocne = (Button) mujobjecktTlacidlo;
        pomocne.getText();
        System.out.println(pomocne.getText());
        display.setText("3");
    }

    @FXML
    public void napisMinus(ActionEvent a) {
        Object mujobjecktTlacidlo = a.getSource();
        Button pomocne = (Button) mujobjecktTlacidlo;
        pomocne.getText();
        System.out.println(pomocne.getText());
        display.setText("-");
    }

    @FXML
    public void napisNula(ActionEvent a) {
        Object mujobjecktTlacidlo = a.getSource();
        Button pomocne = (Button) mujobjecktTlacidlo;
        pomocne.getText();
        System.out.println(pomocne.getText());
        display.setText("0");
    }

    @FXML
    public void napisRovnasa(ActionEvent a) {
        Object mujobjecktTlacidlo = a.getSource();
        Button pomocne = (Button) mujobjecktTlacidlo;
        pomocne.getText();
        System.out.println(pomocne.getText());
        display.setText("=");
    }

    @FXML
    public void napisPlus(ActionEvent a) {
        Object mujobjecktTlacidlo = a.getSource();
        Button pomocne = (Button) mujobjecktTlacidlo;
        pomocne.getText();
        System.out.println(pomocne.getText());
        display.setText("+");
    }

    @FXML
    public void napisSqrt(ActionEvent a) {
        Object mujobjecktTlacidlo = a.getSource();
        Button pomocne = (Button) mujobjecktTlacidlo;
        pomocne.getText();
        System.out.println(pomocne.getText());
        display.setText("SQRT");
    }

    @FXML
    public void napisPlusMinus(ActionEvent a) {
        Object mujobjecktTlacidlo = a.getSource();
        Button pomocne = (Button) mujobjecktTlacidlo;
        pomocne.getText();
        System.out.println(pomocne.getText());
        display.setText("+/-");
    }

    @FXML
    public void napisBackspace(ActionEvent a) {
        Object mujobjecktTlacidlo = a.getSource();
        Button pomocne = (Button) mujobjecktTlacidlo;
        pomocne.getText();
        System.out.println(pomocne.getText());
        display.setText("Backspace");
    }

    @FXML
    public void napisC(ActionEvent a) {
        Object mujobjecktTlacidlo = a.getSource();
        Button pomocne = (Button) mujobjecktTlacidlo;
        pomocne.getText();
        System.out.println(pomocne.getText());
        display.setText("C");
    }


    public class Scitanie {
        public Scitanie() {

        }

        public void Scitanie() {

            String scitanie;

        }

        public class Main {
            public Main() {
                //GIT TEST

            }
        }
           public int Scitanie(int x,int y ){return x+y;}
    }
}

