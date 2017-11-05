package id.co.ukabima.service;

import id.co.ukabima.model.security.User;
import id.co.ukabima.repository.RoleRepository;
import id.co.ukabima.repository.UserRepository;
import id.co.ukabima.repository.UserRolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRolesRepository userRolesRepository;

    public User findByUsername(String username){
        return userRepository.findByUsername(username);
    }
}
