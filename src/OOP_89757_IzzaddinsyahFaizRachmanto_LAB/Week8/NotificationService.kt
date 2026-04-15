package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week8

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Mengirim Email ke: $emailAddress")
    }

    fun processUser(user: UserProfile){

        if (user.email != null){
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}
