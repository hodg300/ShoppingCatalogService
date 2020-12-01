package acs.data;
import javax.persistence.*;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="CATEGORIES")
public class CategoryEntity {

    @Id
    private String name;        // EMAIL PK VARCHAR(255)

    @NotEmpty(message="Description can not be empty")
    private String description ;    // FIRST VARCHAR(255)

//    @NotEmpty(message="Last name can not be empty")
//    private String lastName;    // LAST VARCHAR(255)
//
//    @Password
//    private String password;    // PASSWORD VARCHAR(255)
//
//    @NotNull
//    private Date birthdate;    // CREATED_TIME_STAMP TIMESTAMP
//
//    @Lob
//    @NotEmptyFields
//    @Convert(converter = acs.logic.utils.SetToJsonConverter.class)
//    public Set<String> roles;
//
//    @Formula("DATE_PART('YEAR', AGE(birthdate))::int")
//    private int age;    // calculated field by birth date
//
//    public CategoryEntity() {
//        this.roles = new HashSet<>();
//    }


    public CategoryEntity() {}

    public CategoryEntity(String name, String description) {
        super();
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
