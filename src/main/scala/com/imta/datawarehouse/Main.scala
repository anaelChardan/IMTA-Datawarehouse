package com.imta.datawarehouse

object Main extends App {
  override def main(args: Array[String]): Unit = {
    var currentHosptialStaff = Option[HospitalStaff]

    var hopital = Hopital

    while (true) {
      var entry = scala.io.StdIn.readLine("> ")

      entry match {
        case ":h" => displayHelp(),
        case ":user" => ,
        case ":whoami" => ,
        case ":admit_patient" => ,
      }

    }
    /*
    while (true) {
            System.out.print("> ");
            String line = scanner.nextLine().trim();

            Match(line).of(
                Case($(":q"), o -> API.run(this::endProgram)),
                Case($(":log"), o -> API.run(this::toggleLog)),
                Case($(":h"), o -> API.run(this::showHelp)),
                Case($(), o -> API.run(() -> this.process(line)))
            );
        }
     */
  }

  def displayHelp(): Unit = {
    println(":h -- Afficher l'aide")
    println(":user -- Se logguer, usage: :user [monnom] [montype IN (Nurse, Doctor, Receptionist]")
    println(":whoami -- Dit qui je suis")
    println(":admit_patient -- [Nom] [Prenom]")
  }

  def changeUser(): Unit {

  }




}