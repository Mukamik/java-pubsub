/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface CreateSnapshotRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.CreateSnapshotRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. User-provided name for this snapshot. If the name is not provided
   * in the request, the server will assign a random name for this snapshot on
   * the same project as the subscription. Note that for REST API requests, you
   * must specify a name.  See the &lt;a
   * href="https://cloud.google.com/pubsub/docs/admin#resource_names"&gt; resource
   * name rules&lt;/a&gt;. Format is `projects/{project}/snapshots/{snap}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. User-provided name for this snapshot. If the name is not provided
   * in the request, the server will assign a random name for this snapshot on
   * the same project as the subscription. Note that for REST API requests, you
   * must specify a name.  See the &lt;a
   * href="https://cloud.google.com/pubsub/docs/admin#resource_names"&gt; resource
   * name rules&lt;/a&gt;. Format is `projects/{project}/snapshots/{snap}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The subscription whose backlog the snapshot retains.
   * Specifically, the created snapshot is guaranteed to retain:
   *  (a) The existing backlog on the subscription. More precisely, this is
   *      defined as the messages in the subscription's backlog that are
   *      unacknowledged upon the successful completion of the
   *      `CreateSnapshot` request; as well as:
   *  (b) Any messages published to the subscription's topic following the
   *      successful completion of the CreateSnapshot request.
   * Format is `projects/{project}/subscriptions/{sub}`.
   * </pre>
   *
   * <code>
   * string subscription = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The subscription.
   */
  java.lang.String getSubscription();
  /**
   *
   *
   * <pre>
   * Required. The subscription whose backlog the snapshot retains.
   * Specifically, the created snapshot is guaranteed to retain:
   *  (a) The existing backlog on the subscription. More precisely, this is
   *      defined as the messages in the subscription's backlog that are
   *      unacknowledged upon the successful completion of the
   *      `CreateSnapshot` request; as well as:
   *  (b) Any messages published to the subscription's topic following the
   *      successful completion of the CreateSnapshot request.
   * Format is `projects/{project}/subscriptions/{sub}`.
   * </pre>
   *
   * <code>
   * string subscription = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for subscription.
   */
  com.google.protobuf.ByteString getSubscriptionBytes();

  /**
   *
   *
   * <pre>
   * See &lt;a href="https://cloud.google.com/pubsub/docs/labels"&gt; Creating and
   * managing labels&lt;/a&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * See &lt;a href="https://cloud.google.com/pubsub/docs/labels"&gt; Creating and
   * managing labels&lt;/a&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * See &lt;a href="https://cloud.google.com/pubsub/docs/labels"&gt; Creating and
   * managing labels&lt;/a&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * See &lt;a href="https://cloud.google.com/pubsub/docs/labels"&gt; Creating and
   * managing labels&lt;/a&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */

  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * See &lt;a href="https://cloud.google.com/pubsub/docs/labels"&gt; Creating and
   * managing labels&lt;/a&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);
}
