public class UserValidator {
void validateName(User user){
if (user.getName() == null) {
System.out.println("Users's name is incorrect";
 }
}

void validateAge(User user) {
 if (user.getage() > 30) {
  System.out.println("User is older than 30");
 } else {
  System.out.println("User is younger than 30");
 }
}
 void validateHeight(User user) {
  if (user.getHeight() > 160) {
   System.out.println("User is higher than 160");
  } else {
   System.out.println("User is shorter than 160");
  }
 }
}
