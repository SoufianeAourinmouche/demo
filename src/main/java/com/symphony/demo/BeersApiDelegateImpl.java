package com.symphony.demo;

import com.symphony.demo.api.dto.Beer;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class BeersApiDelegateImpl implements com.symphony.demo.api.BeersApiDelegate {
    @Override
    public ResponseEntity<List<Beer>> listBeers(){
        return ResponseEntity.ok(
                Stream.of("0000", "ABC", "Kro").map(b -> new Beer().id(UUID.randomUUID()).name(b)).collect(Collectors.toList())
        );
    }

    public ResponseEntity<Beer> getBeer(String id){
        return ResponseEntity.ok(new Beer().id(UUID.randomUUID()).name("0000"));
    }
}
