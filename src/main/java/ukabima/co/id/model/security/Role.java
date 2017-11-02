package ukabima.co.id.model.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "roles", schema = "security")
public class Role {

    @Id
    @GenericGenerator(name = "gen_role", strategy = "uuid2")
    @GeneratedValue(generator = "gen_role")
    private String id;

    @Column(name = "role_name", nullable = false, length = 50, unique = true)
    private String name;
}
