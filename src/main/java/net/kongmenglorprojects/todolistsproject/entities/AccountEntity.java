package net.kongmenglorprojects.todolistsproject.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @JsonProperty
    private String fName;
    @JsonProperty
    private String lName;
    @Column(unique = true)
    private String email;
    @JsonIgnore
    private String password;
    @JsonProperty
    private Long bDate;
    @JsonProperty
    private String image;

    @OneToMany(cascade = CascadeType.ALL)
    private List<SocialMediaEntity> socialMedia = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL)
    private List<ListsEntity> toDoLists = new ArrayList<>();

    public AccountEntity() {}

    public AccountEntity(String fName, String lName, String email, String password, Long bDate) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.password = password;
        this.bDate = bDate;
    }

    public Long getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getbDate() {
        return bDate;
    }

    public void setbDate(Long bDate) {
        this.bDate = bDate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<SocialMediaEntity> getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(List<SocialMediaEntity> socialMedia) {
        this.socialMedia = socialMedia;
    }

    public List<ListsEntity> getToDoLists() {
        return toDoLists;
    }

    public void setToDoLists(List<ListsEntity> toDoLists) {
        this.toDoLists = toDoLists;
    }
}
