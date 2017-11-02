package ukabima.co.id.model.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@ToString(exclude = "roles")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users", schema = "security")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GenericGenerator(name = "gen_user", strategy = "uuid2")
    @GeneratedValue(generator = "gen_user")
    private String id;

    @Column(name = "user_id", nullable = false, unique = true, length = 25)
    private String username;

    @Column(name = "passwd", nullable = false, unique = true)
    private String password;

    @Column(name = "nama_lengkap", nullable = false, length = 50)
    private String namaLengkap;

    @OneToMany(mappedBy = "user")
    private List<UserRoleGranted> roles = new ArrayList<>();

}
