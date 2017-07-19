
import Cypher.atbash

class AtbashTest extends BaseTest{

  "atbash of abcdefghijklmnopqrstuvwxyz" should "return zyxwvutsrqponmlkjihgfedcba" in {
    atbash("abcdefghijklmnopqrstuvwxyz") should be("zyxwvutsrqponmlkjihgfedcba")
  }

  "atbash of wizard" should "return draziw" in {
    atbash("wizard") should be("draziw")
  }

  "atbash of word" should "return dliw" in {
    atbash("word") should be("dliw")
  }

  "123456789 of word" should "return 123456789" in {
    atbash("123456789") should be("123456789")
  }

  "123456789 of word" should "return 123456789" in {
    atbash("123456789") should be("123456789")
  }

}
