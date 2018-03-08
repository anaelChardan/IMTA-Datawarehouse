package com.imta.datawarehouse

import com.github.nscala_time.time.Imports._

case class Patient(
                    firstName: String,
                    lastName: String,
                    roomNumber: Int,
                    admissionDate: DateTime = DateTime.now(),
                    exitDate: Option[DateTime] = None,
                    dateOperations : List[DateTime] = List.empty,
                    injectedDrugs : List[String] = List.empty
                  )

object Patient {
  def fromPerson(person: Person, room: Int): Patient = {
    new Patient(
      firstName = person.firstName,
      lastName = person.lastName,
      roomNumber = room
    )
  }
}
