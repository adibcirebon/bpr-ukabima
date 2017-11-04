package id.co.ukabima.model.nasabah;

import id.co.ukabima.model.security.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "nasabah", schema = "nasabah")
@EqualsAndHashCode(callSuper = false)
public class Nasabah extends User {

    @Column(name = "nomor_register", nullable = false, unique = true)
    private String cif;

    @Column(name = "nomor_ktp", nullable = false, length = 64)
    private String nomorKtp;

    @Column(name = "nama_panggilan", nullable = false, length = 20)
    private String namaPangilan;
}
