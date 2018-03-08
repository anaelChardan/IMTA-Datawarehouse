package com.imta.datawarehouse

case class Hospital(
                     patients: Set[Patient] = Set.empty,
                     nurses: Set[Nurse] = Set(Nurse("Sacha"), Nurse("Madison"), Nurse("Tori")),
                     doctors: Set[Doctor] = Set(Doctor("Greg"), Doctor("Rocco"), Doctor("Manuel")),
                     receptionists: Set[Receptionist] = Set(Receptionist("Lisa"), Receptionist("Flora"), Receptionist("Florine"))
                   ) {

  private val roomsNumber: Set[Int] = (0 to 100).toSet

  def admission(person: Person): Hospital = {
    this.copy(patients = this.patients + Patient.fromPerson(person, availableRoom))
  }

  def staffNames: Set[HospitalStaff] = (nurses ++ doctors ++ receptionists).toSet

  def staffByName(name: String): Option[HospitalStaff] = {
    val nurse: Option[HospitalStaff] = nurses.find(_.name == name)

    if (nurse.isDefined) {
      return nurse
    }

    val doctor: Option[HospitalStaff] = doctors.find(_.name == name)

    if (doctor.isDefined) {
      return doctor
    }

    receptionists.find(_.name == name)
  }

  private def availableRoom: Int = {
    roomsNumber.diff(patients.map(_.roomNumber)).head
  }
}