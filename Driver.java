//By Erik Nilsson
//the driver class to test all of the individual functions
class Driver {
  public static void main(String args[]){
    School school = new School();
    
    for (int i = 0; i < 8; i++){
      //System.out.println(i);
      school.insert(i, new Student("Joe", i, 4));
    }
    
    school.print();
    school.insert(4, new Student("jenifer", 9, 3));
                 
                
    System.out.println("------------");
    System.out.println("Getting an item(jenifer) in the List");
    System.out.println(school.get("jenifer"));
                 
    school.delete(4);
    school.print();
  }
}