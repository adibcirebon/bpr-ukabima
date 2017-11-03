package id.co.ukabima.repository;

import id.co.ukabima.model.security.Role;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RoleResository extends PagingAndSortingRepository<Role, String> {
}
