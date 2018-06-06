


object HelloWorld {


  def main(args: Array[String]): Unit = {
//  println("Hello World!!!!!")
//    println(P01.last_element(List(1,2,3,4,54,6,7)))
//    println(P02.penultimate(List(1,2,3,4,5,6,7,8,10,11)))
//    println(P03.nth(3, List(1,23,34,2,4,2,4,2,3)))
//    println(P04.len(List(1,2,3,4,5,23,2,3,2,4,5343,34)))
//    println(P05.reverse(List(1,2,3,4,5,23,2,3,2,4,5343,34)))
//    println(P06.isPalindrome(List(1,2,1, 3)))

//   println(P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))))

    val temp: List[Any] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

    def compress(inputList: List[Any]): List[Any] = {

    var timebeing: List[Any] = List()

      inputList match {
        case Nil => List()
        case head => {
          println(inputList)
          if(inputList.head == inputList.tail.head) {
            timebeing =  timebeing :: inputList.tail
            println("value of timebeing is as follows - " +timebeing)
            compress(inputList.tail)
          }
          else {
            compress(inputList.tail.tail)
          }

        }


      }


//      case inputList.head != inputList.tail.head =>  compress(List(inputList.head, inputList.tail.head))
    }

    val temping = compress(temp)
    println(temping)

  }
}
