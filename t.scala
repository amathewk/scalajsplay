/**
  * Created by amathew on 11/20/16.
  */

object T {

  case class Car(make:String, model:String)

  def main(args: Array[String]): Unit = {
    val car = Car("ford", "echo")
    println(car.make)
  }

}


