// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: query3.proto

package com.assignment2.grpc.query3;

public final class Query3 {
  private Query3() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_assignment2_grpc_query3_EduQueryThreeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_assignment2_grpc_query3_EduQueryThreeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_assignment2_grpc_query3_EduQueryThreeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_assignment2_grpc_query3_EduQueryThreeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014query3.proto\022\033com.assignment2.grpc.que" +
      "ry3\"O\n\024EduQueryThreeRequest\022\014\n\004Year\030\001 \001(" +
      "\005\022\014\n\004Type\030\002 \001(\t\022\016\n\006Length\030\003 \001(\t\022\013\n\003url\030\004" +
      " \001(\t\"(\n\025EduQueryThreeResponse\022\017\n\007message" +
      "\030\001 \001(\t2\221\001\n\024EduQueryThreeService\022y\n\020GetEd" +
      "uQueryThree\0221.com.assignment2.grpc.query" +
      "3.EduQueryThreeRequest\0322.com.assignment2" +
      ".grpc.query3.EduQueryThreeResponseB\037\n\033co" +
      "m.assignment2.grpc.query3P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_assignment2_grpc_query3_EduQueryThreeRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_assignment2_grpc_query3_EduQueryThreeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_assignment2_grpc_query3_EduQueryThreeRequest_descriptor,
        new java.lang.String[] { "Year", "Type", "Length", "Url", });
    internal_static_com_assignment2_grpc_query3_EduQueryThreeResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_assignment2_grpc_query3_EduQueryThreeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_assignment2_grpc_query3_EduQueryThreeResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
