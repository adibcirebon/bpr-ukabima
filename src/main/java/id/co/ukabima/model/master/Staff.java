package id.co.ukabima.model.master;

import id.co.ukabima.model.security.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "staff", schema = "master")
public class Staff extends User {

    @Column(name = "nomor_ktp", nullable = false, length = 64)
    private String nomorKtp;
}
