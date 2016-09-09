import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public class StudentViewer{
  static HashMap<String,ArrayList<Student>> studentsByGroups = new HashMap<>();
  static HashMap<String,ArrayList<Student>> studentsByClubs = new HashMap<>();
  static HashMap<String,Club> clubs = new HashMap<>();
  static HashMap<String,Group> groups = new HashMap<>();
  //static ArrayList<Group> groups = new ArrayList<>();
  static ArrayList<Student> students = new ArrayList<>();

  public static void main(String args[]){
    loadFromFile(); // Read from file and fill groups and clubs values
    listWithProfileInfo(groups.get("A03").students);
    /*
     * Output students
     * Arman Baymyshev Clubs:Shapagat,Sana;17 years old
     * Samat Zhamanov Clubs:Sport,Shapagat;18 years old
     * Almas Nurhozhaev Clubs:Sport,Shapagat,Sana;16 years old
     */
    ArrayList<Student> studentsFound = filterStudents("nameandsurname","zhan");
    System.out.println(studentsFound);
    /*
     * Output: ['S. Bakytzhanov B03','Z. Tolegenov B03']
     */
    ArrayList<Student> studentsBornBefore1999 = filterStudents("birthyear","<1999");
    System.out.println(studentsBornBefore1999);
    /*
     * Output: ['S. Zhamanov A03','Z. Argynbayev C03']
     */
    HashSet<Club> clubsOfB03 = clubs.get("B03").clubsOfStudents();
    System.out.println(clubsOfB03);
    /*
     * ['Sport','Sana','Dance']
     */
    
  }
  public static void loadFromFile(){
  
  }
  public static void listWithProfileInfo(ArrayList<Student> students){
  
  }
  public static ArrayList<Student> filterStudents(String type,String input){
    
  }
}