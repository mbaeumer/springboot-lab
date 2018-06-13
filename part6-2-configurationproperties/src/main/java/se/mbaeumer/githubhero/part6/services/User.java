package se.mbaeumer.githubhero.part6.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String login;
    private int id;
    private String avatarUrl;
    private String url;
}
