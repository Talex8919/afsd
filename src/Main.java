public class Main {
    public static void main(String[] args)  throws CloneNotSupportedException {// 4)  use
        // throws CloneNotSupportedException to prevent  this  error in future
        ObjectClone person = new ObjectClone();        // create a person
       ObjectClone person1 = (ObjectClone) person.clone(); // create the second person   and initialised  as  ObjectClone
                                 // .clone(); method
        System.out.println(person != (person1)); /// then  print out person != (person1) the result  is true  because   it  fullly copy  with current  id
        System.out.println((person.clone() .getClass()==person1.getClass()) ); // equalise original and  clone
        System.out.println(person.equals (person1)); // print out if  original  and clone equal

    }
}
