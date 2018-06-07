


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


      def interrimFunction(list: List[Any], seqValue: Int): List[Any] = {
        println(list)
        if (list.lift(seqValue) == list.lift(seqValue + 1)) {
          println("Its inside the if statement")
          println("value of sequence is as follows - " +seqValue)

          //remove item from the list instead of sending the tail of it

          interrimFunction(list, seqValue)
        }
        else if (seqValue == list.length) {
          println("Its inside the else if statement")
          println("value of sequence is as follows - " +seqValue)
          list
        }
        else {
          println("Its inside the else statement")
          println("value of sequence is as follows - " +seqValue)
          interrimFunction(list, seqValue + 1)
        }
      }
     compress(interrimFunction(inputList, 0))
    }


    println(compress(temp))
  }


  //      case inputList.head != inputList.tail.head =>  compress(List(inputList.head, inputList.tail.head))



  }

