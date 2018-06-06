import scala.collection.GenTraversable

object P07 {
  def flatten(inputList: List[Any]): List[Any] = inputList.flatMap {
    case valueList: List[Any] => flatten(valueList)
    case valueOnly => List(valueOnly)
  }
}
