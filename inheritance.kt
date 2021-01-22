fun main() {
  
val moderator = Moderator()
moderator.userDelete()

}
  // Inheritance
  
class Moderator : User() {
    fun userDelete() {
          println("User Deleted")
      }
}
  // Class
  
open class User{
  var uname : String? = null
  var ulastName : String? = null
  var usalary : Int? = null

  // Encapsulation

  var name : String? = uname
      private set
      get
  var lastName : String? = ulastName
  var salary : Int? = usalary
  
}
