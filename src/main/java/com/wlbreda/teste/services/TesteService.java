package com.wlbreda.teste.services;

import com.wlbreda.teste.controllers.TesteController;
import com.wlbreda.teste.models.Param2INT;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
@RequestMapping("/control")
@Api(value = "API Controlador")
@CrossOrigin(origins = "*")
public class TesteService {

    @PostMapping
    @ApiOperation(value = "Compara dois valores inteiros")
    public ResponseEntity<String> compareParam(@RequestBody Param2INT param) {
        return ResponseEntity.status(HttpStatus.GONE).body(new TesteController().compareParam(param));
    }

    @GetMapping("/{str}")
    @ApiOperation(value = "Repassa o parâmetro textual")
    public ResponseEntity<String> getParam(@PathVariable(value = "str") String str) {
        return ResponseEntity.status(HttpStatus.GONE).body(new TesteController().getParam(str));
    }

}