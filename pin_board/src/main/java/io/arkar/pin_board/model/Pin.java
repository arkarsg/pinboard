package io.arkar.pin_board.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/*
 * @Data annotation from Lombok generates boilerplate code for Java
 * such as getters, setters, equals(), hashCode(), toString() methods
 */
@Data
/*
 * Automatically generates constructor with arguments for all NON-FINAL field
 * in a class and constructor with no arguments
 */
@AllArgsConstructor
@NoArgsConstructor
/*
 * Generates a toString method for the annotated class representing the state of
 * the object
 */
@ToString
/*
 * Indicates that a class is a domain object that should be persisted in a
 * MongoDB collection
 */
@Document(collection = "Pins")
public class Pin {
    @Id
    private String id;
    private String title;
    private String content;
    private Boolean published;
}
