package id.co.ukabima.service;

import id.co.ukabima.model.master.Agama;
import id.co.ukabima.repository.AgamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class AgamaService {

    @Autowired
    private AgamaRepository agamaRepository;

    @Transactional(readOnly = false)
    public void save(Agama agama) {
        this.agamaRepository.save(agama);
    }

    public List<Agama> findAll() {
        return this.agamaRepository.findAll();
    }
}
