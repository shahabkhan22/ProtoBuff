# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: name.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
from google.protobuf import descriptor_pb2
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='name.proto',
  package='',
  syntax='proto3',
  serialized_pb=_b('\n\nname.proto\"3\n\x04Name\x12\r\n\x05\x66name\x18\x01 \x01(\t\x12\r\n\x05mname\x18\x02 \x03(\t\x12\r\n\x05lname\x18\x03 \x01(\tb\x06proto3')
)




_NAME = _descriptor.Descriptor(
  name='Name',
  full_name='Name',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='fname', full_name='Name.fname', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='mname', full_name='Name.mname', index=1,
      number=2, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='lname', full_name='Name.lname', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=14,
  serialized_end=65,
)

DESCRIPTOR.message_types_by_name['Name'] = _NAME
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Name = _reflection.GeneratedProtocolMessageType('Name', (_message.Message,), dict(
  DESCRIPTOR = _NAME,
  __module__ = 'name_pb2'
  # @@protoc_insertion_point(class_scope:Name)
  ))
_sym_db.RegisterMessage(Name)


# @@protoc_insertion_point(module_scope)
