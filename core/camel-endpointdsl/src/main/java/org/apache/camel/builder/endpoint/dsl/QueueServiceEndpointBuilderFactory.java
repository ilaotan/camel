/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The azure-queue component is used for storing and retrieving messages from
 * Azure Storage Queue Service.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface QueueServiceEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Azure Storage Queue Service
     * component.
     */
    public interface QueueServiceEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedQueueServiceEndpointConsumerBuilder advanced() {
            return (AdvancedQueueServiceEndpointConsumerBuilder) this;
        }
        /**
         * The queue service client.
         * 
         * The option is a:
         * <code>com.microsoft.azure.storage.queue.CloudQueue</code> type.
         * 
         * Group: common
         */
        default QueueServiceEndpointConsumerBuilder azureQueueClient(
                Object azureQueueClient) {
            doSetProperty("azureQueueClient", azureQueueClient);
            return this;
        }
        /**
         * The queue service client.
         * 
         * The option will be converted to a
         * <code>com.microsoft.azure.storage.queue.CloudQueue</code> type.
         * 
         * Group: common
         */
        default QueueServiceEndpointConsumerBuilder azureQueueClient(
                String azureQueueClient) {
            doSetProperty("azureQueueClient", azureQueueClient);
            return this;
        }
        /**
         * Set the storage credentials, required in most cases.
         * 
         * The option is a:
         * <code>com.microsoft.azure.storage.StorageCredentials</code> type.
         * 
         * Group: common
         */
        default QueueServiceEndpointConsumerBuilder credentials(
                Object credentials) {
            doSetProperty("credentials", credentials);
            return this;
        }
        /**
         * Set the storage credentials, required in most cases.
         * 
         * The option will be converted to a
         * <code>com.microsoft.azure.storage.StorageCredentials</code> type.
         * 
         * Group: common
         */
        default QueueServiceEndpointConsumerBuilder credentials(
                String credentials) {
            doSetProperty("credentials", credentials);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default QueueServiceEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default QueueServiceEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Azure Storage Queue
     * Service component.
     */
    public interface AdvancedQueueServiceEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default QueueServiceEndpointConsumerBuilder basic() {
            return (QueueServiceEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedQueueServiceEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedQueueServiceEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedQueueServiceEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedQueueServiceEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedQueueServiceEndpointConsumerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedQueueServiceEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedQueueServiceEndpointConsumerBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedQueueServiceEndpointConsumerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Azure Storage Queue Service
     * component.
     */
    public interface QueueServiceEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedQueueServiceEndpointProducerBuilder advanced() {
            return (AdvancedQueueServiceEndpointProducerBuilder) this;
        }
        /**
         * The queue service client.
         * 
         * The option is a:
         * <code>com.microsoft.azure.storage.queue.CloudQueue</code> type.
         * 
         * Group: common
         */
        default QueueServiceEndpointProducerBuilder azureQueueClient(
                Object azureQueueClient) {
            doSetProperty("azureQueueClient", azureQueueClient);
            return this;
        }
        /**
         * The queue service client.
         * 
         * The option will be converted to a
         * <code>com.microsoft.azure.storage.queue.CloudQueue</code> type.
         * 
         * Group: common
         */
        default QueueServiceEndpointProducerBuilder azureQueueClient(
                String azureQueueClient) {
            doSetProperty("azureQueueClient", azureQueueClient);
            return this;
        }
        /**
         * Set the storage credentials, required in most cases.
         * 
         * The option is a:
         * <code>com.microsoft.azure.storage.StorageCredentials</code> type.
         * 
         * Group: common
         */
        default QueueServiceEndpointProducerBuilder credentials(
                Object credentials) {
            doSetProperty("credentials", credentials);
            return this;
        }
        /**
         * Set the storage credentials, required in most cases.
         * 
         * The option will be converted to a
         * <code>com.microsoft.azure.storage.StorageCredentials</code> type.
         * 
         * Group: common
         */
        default QueueServiceEndpointProducerBuilder credentials(
                String credentials) {
            doSetProperty("credentials", credentials);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default QueueServiceEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default QueueServiceEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Message Time To Live in seconds.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default QueueServiceEndpointProducerBuilder messageTimeToLive(
                int messageTimeToLive) {
            doSetProperty("messageTimeToLive", messageTimeToLive);
            return this;
        }
        /**
         * Message Time To Live in seconds.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default QueueServiceEndpointProducerBuilder messageTimeToLive(
                String messageTimeToLive) {
            doSetProperty("messageTimeToLive", messageTimeToLive);
            return this;
        }
        /**
         * Message Visibility Delay in seconds.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default QueueServiceEndpointProducerBuilder messageVisibilityDelay(
                int messageVisibilityDelay) {
            doSetProperty("messageVisibilityDelay", messageVisibilityDelay);
            return this;
        }
        /**
         * Message Visibility Delay in seconds.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default QueueServiceEndpointProducerBuilder messageVisibilityDelay(
                String messageVisibilityDelay) {
            doSetProperty("messageVisibilityDelay", messageVisibilityDelay);
            return this;
        }
        /**
         * Queue service operation hint to the producer.
         * 
         * The option is a:
         * <code>org.apache.camel.component.azure.queue.QueueServiceOperations</code> type.
         * 
         * Group: producer
         */
        default QueueServiceEndpointProducerBuilder operation(
                QueueServiceOperations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Queue service operation hint to the producer.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.azure.queue.QueueServiceOperations</code> type.
         * 
         * Group: producer
         */
        default QueueServiceEndpointProducerBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Set a prefix which can be used for listing the queues.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default QueueServiceEndpointProducerBuilder queuePrefix(
                String queuePrefix) {
            doSetProperty("queuePrefix", queuePrefix);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Azure Storage Queue
     * Service component.
     */
    public interface AdvancedQueueServiceEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default QueueServiceEndpointProducerBuilder basic() {
            return (QueueServiceEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedQueueServiceEndpointProducerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedQueueServiceEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedQueueServiceEndpointProducerBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedQueueServiceEndpointProducerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Azure Storage Queue Service component.
     */
    public interface QueueServiceEndpointBuilder
            extends
                QueueServiceEndpointConsumerBuilder, QueueServiceEndpointProducerBuilder {
        default AdvancedQueueServiceEndpointBuilder advanced() {
            return (AdvancedQueueServiceEndpointBuilder) this;
        }
        /**
         * The queue service client.
         * 
         * The option is a:
         * <code>com.microsoft.azure.storage.queue.CloudQueue</code> type.
         * 
         * Group: common
         */
        default QueueServiceEndpointBuilder azureQueueClient(
                Object azureQueueClient) {
            doSetProperty("azureQueueClient", azureQueueClient);
            return this;
        }
        /**
         * The queue service client.
         * 
         * The option will be converted to a
         * <code>com.microsoft.azure.storage.queue.CloudQueue</code> type.
         * 
         * Group: common
         */
        default QueueServiceEndpointBuilder azureQueueClient(
                String azureQueueClient) {
            doSetProperty("azureQueueClient", azureQueueClient);
            return this;
        }
        /**
         * Set the storage credentials, required in most cases.
         * 
         * The option is a:
         * <code>com.microsoft.azure.storage.StorageCredentials</code> type.
         * 
         * Group: common
         */
        default QueueServiceEndpointBuilder credentials(Object credentials) {
            doSetProperty("credentials", credentials);
            return this;
        }
        /**
         * Set the storage credentials, required in most cases.
         * 
         * The option will be converted to a
         * <code>com.microsoft.azure.storage.StorageCredentials</code> type.
         * 
         * Group: common
         */
        default QueueServiceEndpointBuilder credentials(String credentials) {
            doSetProperty("credentials", credentials);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Azure Storage Queue Service
     * component.
     */
    public interface AdvancedQueueServiceEndpointBuilder
            extends
                AdvancedQueueServiceEndpointConsumerBuilder, AdvancedQueueServiceEndpointProducerBuilder {
        default QueueServiceEndpointBuilder basic() {
            return (QueueServiceEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedQueueServiceEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedQueueServiceEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedQueueServiceEndpointBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedQueueServiceEndpointBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.azure.queue.QueueServiceOperations</code> enum.
     */
    enum QueueServiceOperations {
        listQueues,
        createQueue,
        deleteQueue,
        addMessage,
        retrieveMessage,
        peekMessage,
        updateMessage,
        deleteMessage;
    }
    /**
     * Azure Storage Queue Service (camel-azure)
     * The azure-queue component is used for storing and retrieving messages
     * from Azure Storage Queue Service.
     * 
     * Category: cloud,queue,azure
     * Since: 2.19
     * Maven coordinates: org.apache.camel:camel-azure
     * 
     * Syntax: <code>azure-queue:containerAndQueueUri</code>
     * 
     * Path parameter: containerAndQueueUri (required)
     * Container Queue compact Uri
     */
    default QueueServiceEndpointBuilder azureQueue(String path) {
        class QueueServiceEndpointBuilderImpl extends AbstractEndpointBuilder implements QueueServiceEndpointBuilder, AdvancedQueueServiceEndpointBuilder {
            public QueueServiceEndpointBuilderImpl(String path) {
                super("azure-queue", path);
            }
        }
        return new QueueServiceEndpointBuilderImpl(path);
    }
}