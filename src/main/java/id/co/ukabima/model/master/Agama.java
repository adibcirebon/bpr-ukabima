package id.co.ukabima.model.master;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
