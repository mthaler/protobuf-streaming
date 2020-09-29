# protobuf-streaming

Sample code that demonstrates streaming of repeated fields in protobuf messages.

## Large data sets

Protocol buffers are not designed to handle large data sets. The documentation recommends to consider alternative strategies when dealing with messages that are larger then a megabyte each.
One of the problems with large messages is, that protocol buffers does not support streaming. This means the complete message has to be serialized / deserialized in one go, which might need a lot of memory.
