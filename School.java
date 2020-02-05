//the new array class made for all the students
class School {
 //the main list that holds all the data
 private Student[] list;
 
 //boundaries for the elements of the list in play
 private int size;
 
 //default constructor
 public School(){
   list = new Student[size];
   this.size = 0;
 }
 
 //expands the list if the person tries to insert and they reach the end of the list
 public void expand(){
  Student[] tempList = new Student[size*2 + 1];
  for (int i = 0; i < list.length; i++){
   tempList[i] = list[i];
  }
  
  list = tempList;
 }
 
 //sets the value of the student at position index as long as the index is within the bounds of the array
 public boolean set(int index, Student student){
   if (index < 0 || index >= size){
     return false;
   }
   else {
     list[index] = student;
   }
   return true; 
 }
 
 //compares the elements of the list to get the corresponding student with a certain name
 public Student get(String key){
     for (int i = 0; i < size; i++){
       if (key.equals(list[i].getName())){
        return list[i];
       }
     }
     
     return null;
 }
 
 //insertion method that takes in the index to replace
 //it moves all the other elements up the list
 public boolean insert(int index, Student student){
   if (size < list.length){
     for (int i = size; i > index; i--){
       list[i] = list[i-1];
     }
     size += 1;
     
     list[index] = student;
     
     return true; 
   } 
   //the case if the length of the list is too long then it will expand and then add accordingly
   else {
     expand();
     
     for (int i = size; i > index; i--){
       list[i] = list[i-1];
     }
     size += 1;
     
     list[index] = student;
     
     return true; 
   }
 }

//removes the specified element and shifts all the items down the list
public boolean delete(int index){
  for (int i = index; i < size; i++){
    list[i] = list[i+1];
  }
  size -= 1;
     
  return true; 
}

//getter method to get size
public int size(){
 return size; 
}

//iterates through list and prints out all the values of the school list.
public void print(){
  System.out.println("----------------");
  for (int i = 0; i < size; i++){
   System.out.println(list[i]); 
  }
 }
}