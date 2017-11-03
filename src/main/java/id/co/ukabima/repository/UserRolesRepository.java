package id.co.ukabima.repository;

import id.co.ukabima.model.security.UserRoleGranted;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRolesRepository extends PagingAndSortingRepository<UserRoleGranted, String> {
}
