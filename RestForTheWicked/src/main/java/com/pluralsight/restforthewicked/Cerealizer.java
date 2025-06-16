package com.pluralsight.restforthewicked;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class Cerealizer {
    CapnCrunch capn;

    @Autowired
    public Cerealizer(CapnCrunch capn) {
        this.capn = capn;
    }

//    @EventListener(ApplicationReadyEvent.class)
    public void demo() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        System.out.println("\n\nOriginal object: " + this.capn);

        String json = objectMapper.writeValueAsString(this.capn);

        System.out.println("\nSerialization (Cerealization)... object now can be represented as a SERIES of characters");
        characterPrint(json);

        CapnCrunch deserializedCapn = objectMapper.readValue(json, CapnCrunch.class);
        System.out.println("\nDeserialized object: " + deserializedCapn);
    }

    /**
     * Slowly print the characters in series to drive home what we mean by serialized.
     * @param json The string to print.
     */
    static void characterPrint(String json) {
        try {
            for (char c : json.toCharArray()) {
                if (c != '\n') {
                    System.out.print(c);
                    System.out.flush();
                    TimeUnit.MILLISECONDS.sleep(200);
                }
            }
            System.out.println();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Printing interrupted: " + e.getMessage());
        }
    }
}

