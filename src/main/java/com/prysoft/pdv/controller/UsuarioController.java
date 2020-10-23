package com.prysoft.pdv.controller;

import com.prysoft.pdv.config.Constants;
import com.prysoft.pdv.dto.UsuarioFilter;
import com.prysoft.pdv.models.Usuario;
import com.prysoft.pdv.service.UsuarioService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/{tenantid}/api/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService service;

    @GetMapping
    Page<Usuario> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Usuario findById(@PathVariable long id) {
        return service.findById(id);
    }

    @GetMapping(value = "/getLogued")
    Usuario getLogued(HttpServletRequest request){
        String token = request.getHeader(Constants.HEADER_AUTHORIZACION_KEY).replace("Bearer ","");
        Claims claims = Jwts.parser().setSigningKey(Constants.SECRET_KEY).parseClaimsJws(token).getBody();
        String username = claims.getSubject().split("/")[0];
        return service.findByUsername(username);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<Usuario> save(@RequestBody Usuario entity) {
        try {
            return new ResponseEntity<Usuario>(service.saveOrUpdate(entity),HttpStatus.OK);
        }
        catch (EntityNotFoundException e){

            return new ResponseEntity(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PutMapping
    Usuario update(@RequestBody Usuario entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Usuario> filter(@RequestBody UsuarioFilter filter) {
        return service.filter(filter);
    }

    @GetMapping (value = "/getBySucursal/{filterParam}/{id}/{page}/{size}")
    Page<Usuario> filterBySucursal(@PathVariable String filterParam, @PathVariable Long id, @PathVariable int page, @PathVariable int size) {
        return service.filterBySucursal(filterParam,id,page,size);
    }
}
