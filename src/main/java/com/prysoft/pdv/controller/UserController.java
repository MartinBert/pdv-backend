package com.prysoft.pdv.controller;

import com.prysoft.pdv.config.Constants;
import com.prysoft.pdv.dto.UserFilter;
import com.prysoft.pdv.models.User;
import com.prysoft.pdv.service.UserService;
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
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping
    Page<User> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    User findById(@PathVariable long id) {
        return service.findById(id);
    }

    @GetMapping(value = "/getLogued")
    User getLogued(HttpServletRequest request) {
        String token = request.getHeader(Constants.HEADER_AUTHORIZACION_KEY).replace("Bearer ", "");
        Claims claims = Jwts.parser().setSigningKey(Constants.SECRET_KEY).parseClaimsJws(token).getBody();
        String username = claims.getSubject().split("/")[0];
        return service.findByUsername(username);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<User> save(@RequestBody User entity) {
        try {
            return new ResponseEntity<User>(service.saveOrUpdate(entity), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping
    User update(@RequestBody User entity) {
        return service.update(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<User> filter(@RequestBody UserFilter filterParam) {
        return service.filter(filterParam);
    }
}
