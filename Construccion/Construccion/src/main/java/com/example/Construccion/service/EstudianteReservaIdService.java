package com.example.Construccion.service;

import com.example.Construccion.entity.EstudianteReserva;
import com.example.Construccion.repository.EstudianteReservaIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteReservaIdService {

    private final EstudianteReservaIdRepository estudianteReservaIdRepository;

    @Autowired
    public EstudianteReservaIdService(EstudianteReservaIdRepository estudianteReservaIdRepository) {
        this.estudianteReservaIdRepository = estudianteReservaIdRepository;
    }

    public void insertEstudianteReserva(int idEstudiante, int idReserva) {
        estudianteReservaIdRepository.insertEstudianteReserva(idEstudiante, idReserva);
    }

    public void deleteEstudianteReserva(int idEstudiante, int idReserva) {
        estudianteReservaIdRepository.deleteEstudianteReserva(idEstudiante, idReserva);
    }

    public List<EstudianteReserva> findAllEstudiantesReserva() {
        return estudianteReservaIdRepository.findAllEstudiantesReserva();
    }

    public List<EstudianteReserva> findReservasByEstudiante(int idEstudiante) {
        return estudianteReservaIdRepository.findReservasByEstudiante(idEstudiante);
    }

    public List<EstudianteReserva> findEstudiantesByReserva(int idReserva) {
        return estudianteReservaIdRepository.findEstudiantesByReserva(idReserva);
    }
}