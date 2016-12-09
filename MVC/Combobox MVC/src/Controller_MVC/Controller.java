/*
 * Controller to join the Model and View.
 * 
 */
package Controller_MVC;

import Model_MVC.Model;
import Model_MVC.Person;
import View_MVC.View;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;


/**
 *
 * @author Otto Vogrincic
 */
public class Controller {
    private ArrayList<Person> PersonList;
    public Controller() throws IOException, FileNotFoundException, ParseException{
        Model model = new Model("fileData.txt");
        View view = new View();
        setPersonList(model);
        view.setPersonList(PersonList);
        java.awt.EventQueue.invokeLater(() -> {
            view.setVisible(true);
        });
    }
    public static void main(String[] args) throws IOException, FileNotFoundException, ParseException{
        Controller controller = new Controller();
    }
    public void setPersonList(Model model){
        this.PersonList = model.getPersonList();
    }
}
