
import TranslatingNumbers.{english, french, split}
import org.scalatest._

class BaseTest extends FlatSpec with Matchers {

  "any number as long as it is not too big" should "be changed into short and long notations" in {
    val long = split("123456789101", french)
    val short = split("123456789101", english)
    long should be("123 milliard 456 million 789 thousand 101")
    short should be("123 billion 456 million 789 thousand 101")
  }

  "111" should "return 111" in {
    val long = split("111", french)
    val short = split("111", english)
    long should be("111")
    short should be("111")
  }

  "111111" should "return 111111 in long and short" in {
    val long = split("111111", french)
    val short = split("111111", english)
    long should be("111 thousand 111")
    short should be("111 thousand 111")
  }

  "111111111" should "return 111111111 in long and short" in {
    val long = split("111111111", french)
    val short = split("111111111", english)
    long should be("111 million 111 thousand 111")
    short should be("111 million 111 thousand 111")
  }

  "111111111111" should "return 111111111111 in long and short" in {
    val long = split("111111111111", french)
    val short = split("111111111111", english)
    long should be("111 milliard 111 million 111 thousand 111")
    short should be("111 billion 111 million 111 thousand 111")
  }


  "any number including 0s" should "work but not include leading 0s for any block of numbers but keep non leading 0s" in {
    val long = split("001022333440500", french)
    val short = split("001022333440500", english)
    long should be("1 billion 22 milliard 333 million 440 thousand 500")
    short should be("1 trillion 22 billion 333 million 440 thousand 500")
  }

  "any string given that includes non numbers" should "remove all of the non numbers and continue as normal" in {
    val long = split("1a2b3c4d5f", french)
    val short = split("1a2b3c4d5f", english)
    long should be("12 thousand 345")
    short should be("12 thousand 345")
  }


}
