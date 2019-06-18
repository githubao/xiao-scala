class Person(var name: String, var age: Int) {
  // 对应类型的默认值，_为占位符
  private var addr: String = _

  def this(name: String, age: Int, addr: String) {
    this(name, age)
    this.addr = addr
  }

  def greeting(): Unit = {
    printf("name: %s, age: %d, addr: %s\n", name, age, addr)
  }

  def getAddr: String = addr

  def setAddr(newAddr: String): Unit = {
    addr = newAddr
  }

}

//var p = new Person("xiao", 18, "Beijing")
//p = new Person("xiao", 18)

//p.greeting()

class Father(name: String, age: Int, var home: String) extends Person(name, age) {
  override def greeting(): Unit = {
    println("other logic")
  }
}

var f = new Father("a", 40, "bbb")
f.greeting()

// 定义接口
trait HairColor {
  def SetHair()
}

trait EyesColor {
  def SetEyes()
}

class Man extends HairColor with EyesColor {
  override def SetHair(): Unit = ???

  override def SetEyes(): Unit = ???
}

var m = new Man

// case class，不可变数据，使用值比较而不是引用比较
case class Book(isbn: String)

val someBook = Book("123")
println(someBook)

// 单例对象使用object修饰，可以允许存在一个跟单例对象同名的伴生类，此时就相当于单例对象是伴生类的static成员
case class Circle(radius: Double) {

  import Circle._

  def area: Double = calculateArea(radius)
}

object Circle {
  private def calculateArea(radius: Double): Double = math.Pi * math.pow(radius, 2.0)
}

val c = new Circle(5.0)
println(c.area)

// 元组
val ingredient = ("Sugar", 25): (String, Int)
println(ingredient._1)
println(ingredient._2)
