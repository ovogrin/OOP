package Model_MVC;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
/**
 * @author Otto Vogrincic
 */
public class Model {
    
    private ArrayList<Person> PersonList;
    private String fileName;
    
    public Model(String fileName) throws FileNotFoundException, IOException, ParseException{
        this.fileName = fileName;
        PersonList = new ArrayList<>();
        FileInputStream fis;
        fis = new FileInputStream(new File(fileName));
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String line;
        br.readLine();
        
        while((line = br.readLine()) !=null){
            String delims = "[,]";
            String[] tokens = line.split(delims);
            String lastName = tokens[0];
            String firstName = tokens[1];
            double height = Double.parseDouble(tokens[2]);
            double weight = Double.parseDouble(tokens[3]);
            PersonList.add(new Person(lastName, firstName, height, weight));
        }
    }
    
    /**
     * @return the PersonList
     */
    @SuppressWarnings("ReturnOfCollectionOrArrayField")
    public ArrayList<Person> getPersonList() {
        return PersonList;
    }
    
    /**
     * @param PersonList the PersonList to set
     */
    @SuppressWarnings("AssignmentToCollectionOrArrayFieldFromParameter")
    public void setPersonList(ArrayList<Person> PersonList) {
        this.PersonList = PersonList;
    }
    
    public ArrayList<Person> getPersonByName(String lname, String fname){
        ArrayList<Person> pList =new ArrayList<>();
        for(Person p: PersonList){
            if(p.getLastName().toLowerCase().equals(lname.toLowerCase())){
                pList.add(p);
            }
        }
        return pList;      
    }
}
