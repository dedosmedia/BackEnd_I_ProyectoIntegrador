//package com.dh.clinica.controller;
//
//import com.dh.clinica.model.Odontologo;
//import com.dh.clinica.repository.impl.DomicilioDaoH2;
//import com.dh.clinica.repository.impl.PacienteDaoH2;
//import com.dh.clinica.model.Paciente;
//import com.dh.clinica.service.PacienteService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/pacientes")
//@CrossOrigin("*")
//public class PacienteController {
//
//    private PacienteService pacienteService = new PacienteService(new PacienteDaoH2(new DomicilioDaoH2()));
//
//    @PostMapping()
//    public ResponseEntity<Paciente> registrarPaciente(@RequestBody Paciente paciente) {
//
//        return ResponseEntity.ok(pacienteService.guardar(paciente));
//
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Paciente> buscar(@PathVariable Integer id) {
//        Paciente paciente = pacienteService.buscar(id).orElse(null);
//
//        return ResponseEntity.ok(paciente);
//    }
//
//    @PutMapping()
//    public ResponseEntity<Paciente> actualizar(@RequestBody Paciente paciente) {
//        ResponseEntity<Paciente> response = null;
//
//        if (paciente.getId() != null && pacienteService.buscar(paciente.getId()).isPresent())
//            response = ResponseEntity.ok(pacienteService.actualizar(paciente));
//        else
//            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//
//        return response;
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<String> eliminar(@PathVariable Integer id) {
//        ResponseEntity<String> response = null;
//
//        if (pacienteService.buscar(id).isPresent()) {
//            pacienteService.eliminar(id);
//            response = ResponseEntity.status(HttpStatus.NO_CONTENT).body("Eliminado");
//        } else {
//            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        }
//
//        return response;
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Paciente>> buscarTodos(){
//        return ResponseEntity.ok(pacienteService.buscarTodos());
//    }
//}
