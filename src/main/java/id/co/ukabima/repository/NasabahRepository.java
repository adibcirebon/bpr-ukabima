package id.co.ukabima.repository;

import id.co.ukabima.model.nasabah.Nasabah;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface NasabahRepository extends PagingAndSortingRepository<Nasabah, String> {
}
