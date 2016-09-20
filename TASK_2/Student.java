
public class Student{
  String name,surname;
  int BY = 0; // Birth year
Student(String name,String surname,int BY){
	this.name = name;
	this.surname = surname;
	this.BY = BY;
}
  public String toString(){
	  return name+" "+surname;
  }
}
