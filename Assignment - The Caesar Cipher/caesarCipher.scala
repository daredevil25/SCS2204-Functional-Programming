// Index : 19000413
// Name  : N.D.Dissanayake

import scala.io.StdIn._

object caesarCipher extends App {
  val a = "abcdefghijklmnopqrstuvwxyz"

  //   Encrypt function
  val e = (c: Char, a: String, k: Int) => a((a.indexOf(c.toLower) + k) % a.size)

  //   Decryption function
  val d = (c: Char, a: String, k: Int) =>
    a((a.indexOf(c.toLower) - k + a.size) % a.size)

  //   Cipher function
  val Cipher =
    (algo: (Char, String, Int) => Char, s: String, k: Int, a: String) =>
      s.map(algo(_, a, k))

  //  Reading values
  print("Enter text: ")
  val ot = readLine()

  print("Enter key: ")
  val k = readInt()

  //   Encrypting Text
  val et = Cipher(e, ot, k, a)
  printf("Encrypted text: %s\n", et)

  //   Decrypting Text
  val dt = Cipher(d, et, k, a)
  printf("Decrypted text: %s\n", dt)
}
