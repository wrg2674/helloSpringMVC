package kr.ac.hansung.cse.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Offer {
    private int id;
    @Size(min=2, max=100, message="Name must be between 2 and 100 chars")
    private String name;

    @NotEmpty(message="The email address cannot be empty")
    @Email(message="Please provide a valid email address")
    private String email;

    @Size(min=5, max=100, message="Text must be between 5 and 100 chars")
    private String text;
}
