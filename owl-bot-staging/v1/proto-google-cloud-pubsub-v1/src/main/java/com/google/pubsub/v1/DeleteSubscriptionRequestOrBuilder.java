// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface DeleteSubscriptionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.DeleteSubscriptionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The subscription to delete.
   * Format is `projects/{project}/subscriptions/{sub}`.
   * </pre>
   *
   * <code>string subscription = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The subscription.
   */
  java.lang.String getSubscription();
  /**
   * <pre>
   * Required. The subscription to delete.
   * Format is `projects/{project}/subscriptions/{sub}`.
   * </pre>
   *
   * <code>string subscription = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for subscription.
   */
  com.google.protobuf.ByteString
      getSubscriptionBytes();
}
