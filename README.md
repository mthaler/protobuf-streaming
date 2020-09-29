# protobuf-streaming

Sample code that demonstrates streaming of repeated fields in protobuf messages.

## Large data sets

Protocol buffers are not designed to handle large data sets. The documentation recommends to consider alternative strategies when dealing with messages that are larger then a megabyte each.
One of the problems with large messages is, that protocol buffers does not support streaming. This means the complete message has to be serialized / deserialized in one go, which might need a lot of memory.

## Streaming messages

Although there is no native support for streaming messages, for repeated fields it can be done relatively easily:

The sample code uses a list of persons:

```protobuf
message Person {
  required string name = 1;
  required int32 id = 2;
  optional string email = 3;
}

message Persons {
  repeated Person person = 1;
}
```

To serialize a persons message, all we need to do is to serialize the indiviual persons and prepend the tag. Thus, in this case we don't need to serialize the persons message in one go. To deserialize a persons message, we first read the tag and then deserialize the individual person messages.

## Sample code

PersonsTest contains test code that serializes and deserializes a list of persons both non-streaming and streaming. This code can be used as a template for more complex messages.
