package examples.fileexample

import java.io.File

abstract class fileBrowser() {
  def listFiles : Array[File]
  private def fileMatching(matcher: String => Boolean) = {
    listFiles.filter{ file => matcher(file.getName)}
  }

  def endWith(query: String): Array[File] = {
    fileMatching(_.endsWith(query))
  }

  def startsWith(query: String): Array[File] = {
    fileMatching(_.startsWith(query))
  }

  def contains(query: String): Array[File] = {
    fileMatching(_.contains(query))
  }
}

object fileBrowser{
  private class filesearch(filename: String) extends fileBrowser{
    override def listFiles: Array[File] = new File(filename).listFiles()
  }

  def elem(line: String): fileBrowser = new filesearch(line)
}
