package Server

import java.net._
import java.io._
import scala.io._
import scala.util.control.Breaks._

class TCPServer(val port: Int) {

  val server = new ServerSocket(port)

  def host(): Unit = {

    println("Server " + server.getInetAddress + " listening to " + port)

      val s = server.accept()
      val in = new BufferedSource(s.getInputStream).getLines()
      val out = new PrintStream(s.getOutputStream)

      var read = in.next()
      println("Server received: ")

      while(true) {

        println(read)
        if(!in.hasNext) break()
        if(read.isEmpty) break()
        read = in.next()

      }

      out.flush()
      s.close()

  }
}
