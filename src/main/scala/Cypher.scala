/**
  * Created by Administrator on 19/07/2017.
  */
object Cypher extends App{
  val atbash = (word: String) => word.map(c=>if(c>='a'&&c<='z'){('z'-(c-'a')).toChar}else{c})
}
