package se.mbaeumer.githubhero.part4.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Repository {
    private String name;
    private User owner;
    private String url;
}
