package id.co.ukabima.model.master;

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
@Table(name = "staff", schema = "master")
@EqualsAndHashCode(callSuper = false)
public class Staff extends User {

    @Column(name = "nomor_ktp", nullable = false, length = 64)
    private String nomorKtp;
}
