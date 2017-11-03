package id.co.ukabima.model.nasabah;

import id.co.ukabima.model.security.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "nasabah", schema = "nasabah")
public class Nasabah extends User {

    @Column(name = "nomor_register", nullable = false, unique = true)
    private String cif;

    @Column(name = "nomor_ktp", nullable = false, length = 64)
    private String nomorKtp;

    @Column(name = "nama_panggilan", nullable = false, length = 20)
    private String namaPangilan;
}
