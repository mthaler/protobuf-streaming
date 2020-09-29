package com.mthaler.protobufstreaming

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import java.io.ByteArrayOutputStream

class PersonTest {

    @Test
    fun testSerializeDeserialize() {
        val out = ByteArrayOutputStream()
        val p = PersonOuterClass.Person.newBuilder().setName("Richard Feynman").setId(42).setEmail("feynman@caltech.edu").build()
        p.writeTo(out)
        val data = out.toByteArray()
        val result = PersonOuterClass.Person.parseFrom(data)
        assertEquals(p, result)
    }
}