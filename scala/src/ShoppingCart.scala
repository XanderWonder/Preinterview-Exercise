import scala.collection.mutable.ArrayBuffer

class ShoppingCart{
  val appleCost = 0.60
  val orangeCost = 0.25
  val appleOffer: Double = appleCost / 2
  val orangeOffer:Double = orangeCost * 3 * 2 * orangeCost%3 * 3
  val shoppingBag: ArrayBuffer[Double] = scala.collection.mutable.ArrayBuffer[Double]()
  def mainMenu(): Unit ={
    println("\nWhich one do you want\n1.normal price\n2.special offer price")
    readInt match {
      case 1 => shoppingList()
      case 2 => specialOffer()
    }
  }
  def shoppingList(): Unit ={
      println("\nhow many apple and oranges do you want")
      for(numberofitems <- 0 until  readInt()){
        println("\nChoose your product\n1.Apple\n2.Oranges")
        readInt match {
          case 1 => shoppingBag.append(appleCost)
          case 2 => shoppingBag.append(orangeCost)
        }
      }
      checkout(shoppingBag)
  }
  def specialOffer(): Unit ={
    println("\nhow many apple and oranges do you want")
    for(numberofitems <- 0 until  readInt()){
      println("\nChoose your product\n1.Apple\n2.Oranges")
      readInt match {
        case 1 => shoppingBag.append(appleOffer)
        case 2 => shoppingBag.append(orangeOffer)
      }
    }
    checkout(shoppingBag)
  }
  def checkout(list:ArrayBuffer[Double]): Unit ={
    var sum = 0.toDouble

    list.foreach(plus => sum += plus)
    print(f"this is the total price £$sum%2.2f")
  }
}
