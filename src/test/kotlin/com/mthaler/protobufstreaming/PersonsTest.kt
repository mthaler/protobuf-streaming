package com.mthaler.protobufstreaming

import com.google.protobuf.CodedOutputStream
import com.google.protobuf.WireFormat
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

    @Test
    fun testSerializeStreaming() {
        val out = ByteArrayOutputStream()
        val cout = CodedOutputStream.newInstance(out)
        val p0 = PersonOuterClass.Person.newBuilder().setName("Richard Feynman").setId(42).setEmail("feynman@caltech.edu").build()
        val p1 = PersonOuterClass.Person.newBuilder().setName("Hans Bethe").setId(42).setEmail("bethe@caltech.edu").build()
        val persons = PersonsOuterClass.Persons.newBuilder().addPerson(p0).addPerson(p1).build()
        for (p in persons.personList) {
            cout.writeMessage(1, p)
        }
        cout.flush()
        val data = out.toByteArray()
        val result = PersonsOuterClass.Persons.parseFrom(data)
        assertEquals(persons, result)
    }
}