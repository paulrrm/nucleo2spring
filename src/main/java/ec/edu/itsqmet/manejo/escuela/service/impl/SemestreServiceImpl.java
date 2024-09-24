package ec.edu.itsqmet.manejo.escuela.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import ec.edu.itsqmet.manejo.escuela.model.Semestre;
import ec.edu.itsqmet.manejo.escuela.repository.ISemestreRepository;
import ec.edu.itsqmet.manejo.escuela.service.ISemestreService;
@Service
@Component
public class SemestreServiceImpl implements ISemestreService{

    @Autowired
    ISemestreRepository iSemestreRepository;
    @Override
    public void create(Semestre semestre){
        
       
        iSemestreRepository.save(semestre);
    }
    @Override
    public List<Semestre> read(){
       
        return iSemestreRepository.findAll(); //.
    }
    @Override
    public void update(Semestre semestre){
        
       
        iSemestreRepository.save(semestre);
    }
    @Override
    public void delete(Integer id){
        
        
        iSemestreRepository.deleteById(id);
    }   

}
