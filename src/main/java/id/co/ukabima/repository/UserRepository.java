package id.co.ukabima.repository;

import id.co.ukabima.model.security.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, String> {

    User findByUsername(String username);
}
