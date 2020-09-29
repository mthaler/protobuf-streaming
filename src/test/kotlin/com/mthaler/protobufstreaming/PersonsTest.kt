package com.mthaler.protobufstreaming

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import java.io.ByteArrayOutputStream

class PersonsTest {

    @Test
    fun testSerializeDeserialize() {
        val out = ByteArrayOutputStream()
        val p0 = PersonOuterClass.Person.newBuilder().setName("Richard Feynman").setId(42).setEmail("feynman@caltech.edu").build()
        val p1 = PersonOuterClass.Person.newBuilder().setName("Hans Bethe").setId(42).setEmail("bethe@caltech.edu").build()
        val persons = PersonsOuterClass.Persons.newBuilder().addPerson(p0).addPerson(p1).build()
        persons.writeTo(out)
        val data = out.toByteArray()
        val result = PersonsOuterClass.Persons.parseFrom(data)
        assertEquals(persons, result)
    }
}