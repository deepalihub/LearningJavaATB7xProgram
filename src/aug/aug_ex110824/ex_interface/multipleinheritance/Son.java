package aug.aug_ex110824.ex_interface.multipleinheritance;

class Son implements Father,Mother{


 @Override
 public void loan() {
  System.out.println("There is a only one function");
 }

 @Override
 public void loan(String b, String c) {
  System.out.println("String b ,String c");
 }

 @Override
 public void loan(String a) {
  System.out.println("String a ");
 }

 @Override
 public void home() {

 }
}
