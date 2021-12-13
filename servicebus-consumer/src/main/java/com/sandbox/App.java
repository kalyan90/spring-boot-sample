package com.sandbox;

import java.util.function.Consumer;

import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusErrorContext;
import com.azure.messaging.servicebus.ServiceBusProcessorClient;
import com.azure.messaging.servicebus.ServiceBusReceivedMessage;
import com.azure.messaging.servicebus.ServiceBusReceivedMessageContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Sample code that processes a single message
        Consumer<ServiceBusReceivedMessageContext> processMessage = messageContext -> {
            try {
                ServiceBusReceivedMessage message = messageContext.getMessage();
                System.out.println(message.getMessageId());
                message.
                messageContext.complete();
            } catch (Exception ex) {
                messageContext.abandon();
            }
        };

        // Sample code that gets called if there's an error
        Consumer<ServiceBusErrorContext> processError = errorContext -> {
            System.err.println("Error occurred while receiving message: " + errorContext.getException());
        };

        // create the processor client via the builder and its sub-builder
        ServiceBusProcessorClient processorClient = new ServiceBusClientBuilder()
                                        .connectionString("Endpoint=sb://wow-u-aae-dx-sb-services.servicebus.windows.net/;SharedAccessKeyName=accountmanagementsvc_message_listener;SharedAccessKey=enyQej7acErdhnCawH7Oz1ztyt7AB5lQDCwPdhYN12c=;")
                                        .processor()
                                        .topicName("accountmanagement")
                                        .subscriptionName("kalyan-test")
                                        .processMessage(processMessage)
                                        .processError(processError)
                                        .disableAutoComplete()
                                        .buildProcessorClient();

        // Starts the processor in the background and returns immediately
        processorClient.start();
    }
}
