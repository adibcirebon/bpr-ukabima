package id.co.ukabima.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import id.co.ukabima.model.master.Agama;

import java.util.List;

public interface AgamaRepository extends PagingAndSortingRepository<Agama, String> {
    List<Agama> findAll();
}
