//the node class for school
public class Student{
  //data in the struct
  private String name;
  private int idNum;
  private float gpa;
  
  //initializer method
  public Student(String name, int idNum, float gpa){
    this.name = name;
    this.idNum = idNum;
    this.gpa = gpa;
  }
  
  //test if the two name and inputed mode equal eachother
  public boolean equals(String mode){
    if (name.equals(mode)){
      return true;
    } else {
      return false;
    }
  }
  
  //make a deeepcopy in memory of the student
  public Student deepCopy(){
    Student node = new Student(name,idNum,gpa);
    return node;
  }
  
  //getters
  public String getName(){
    return name;
  }
  
  public int getID(){
   return idNum; 
  }
  
  public float getGpa(){
    return gpa;
  }
  
  //simple tostring method 
  public String toString(){
   return "Name: " + name + ", ID: " + idNum + ", GPA: " + gpa;
  }
}