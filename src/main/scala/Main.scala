import Server.TCPServer

object Main {

  def main(args: Array[String]): Unit = {
    val server = new TCPServer(9999)
    server.host()
  }

}
