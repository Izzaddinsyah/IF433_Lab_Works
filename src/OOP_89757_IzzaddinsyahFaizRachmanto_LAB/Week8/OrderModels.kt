package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week8

class City(val name: String)
class Address(val city: City?)
class DeliveryDetails(val address: Address?)
class Order(val deliveryDetails: DeliveryDetails?, val totalPrice: Int?)
