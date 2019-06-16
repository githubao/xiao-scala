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
