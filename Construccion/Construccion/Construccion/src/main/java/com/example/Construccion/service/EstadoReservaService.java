package com.example.Construccion.service;

import com.example.Construccion.entity.EstadoReserva;
import com.example.Construccion.repository.EstadoReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EstadoReservaService {

    private final EstadoReservaRepository estadoReservaRepository;

    @Autowired
    public EstadoReservaService(EstadoReservaRepository estadoReservaRepository) {
        this.estadoReservaRepository = estadoReservaRepository;
    }

    public List<EstadoReserva> getAllEstadosReserva() {
        return estadoReservaRepository.findAllEstadosReserva();
    }

    public EstadoReserva getEstadoReservaById(int id) {
        return estadoReservaRepository.findEstadoReservaById(id);
    }

    @Transactional
    public EstadoReserva createEstadoReserva(EstadoReserva estadoReserva) {
        return estadoReservaRepository.save(estadoReserva);
    }

    @Transactional
    public EstadoReserva updateEstadoReserva(int id, EstadoReserva estadoReserva) {
        EstadoReserva existingEstadoReserva = estadoReservaRepository.findEstadoReservaById(id);
        if (existingEstadoReserva == null) {
            // Manejar la excepción o retornar null, según la lógica de tu aplicación
            return null;
        }
        existingEstadoReserva.setEstadoReserva(estadoReserva.getEstadoReserva());
        return estadoReservaRepository.save(existingEstadoReserva);
    }

    @Transactional
    public void deleteEstadoReserva(int id) {
        estadoReservaRepository.deleteEstadoReserva(id);
    }
}
