/**
  * Created by Administrator on 19/07/2017.
  */
object Cypher{

  val atbash = (word: String) => word.toLowerCase.map(c=>if(c>='a'&&c<='z'){('z'-(c-'a')).toChar}else{c})
}
