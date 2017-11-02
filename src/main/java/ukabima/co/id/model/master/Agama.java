package ukabima.co.id.model.master;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "agama", schema = "master")
public class Agama {

    @Id
    @GenericGenerator(name = "gen_agama", strategy = "uuid2")
    @GeneratedValue(generator = "gen_agama")
    private String id;

    @Column(name = "agama", nullable = false, unique = true)
    private String nama;
}
