// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: query1.proto

package com.assignment2.grpc.query1;

public final class Query1 {
  private Query1() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_assignment2_grpc_query1_EduQueryOneRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_assignment2_grpc_query1_EduQueryOneRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_assignment2_grpc_query1_EduQueryOneResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_assignment2_grpc_query1_EduQueryOneResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014query1.proto\022\033com.assignment2.grpc.que" +
      "ry1\"m\n\022EduQueryOneRequest\022\014\n\004Year\030\001 \001(\005\022" +
      "\r\n\005State\030\002 \001(\t\022\014\n\004Type\030\003 \001(\t\022\016\n\006Length\030\004" +
      " \001(\t\022\017\n\007Expense\030\005 \001(\t\022\013\n\003url\030\006 \001(\t\"&\n\023Ed" +
      "uQueryOneResponse\022\017\n\007message\030\001 \001(\t2\211\001\n\022E" +
      "duQueryOneService\022s\n\016GetEduQueryOne\022/.co" +
      "m.assignment2.grpc.query1.EduQueryOneReq" +
      "uest\0320.com.assignment2.grpc.query1.EduQu" +
      "eryOneResponseB\037\n\033com.assignment2.grpc.q" +
      "uery1P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_assignment2_grpc_query1_EduQueryOneRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_assignment2_grpc_query1_EduQueryOneRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_assignment2_grpc_query1_EduQueryOneRequest_descriptor,
        new java.lang.String[] { "Year", "State", "Type", "Length", "Expense", "Url", });
    internal_static_com_assignment2_grpc_query1_EduQueryOneResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_assignment2_grpc_query1_EduQueryOneResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_assignment2_grpc_query1_EduQueryOneResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
