package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items") // توحيد الـ Endpoint
public class DataController {

    @GetMapping("/{id}")
    public ResponseEntity<String> getItem(@PathVariable int id) {
        return ResponseEntity.ok("Fetching item with ID: " + id);
    }

    @PostMapping
    public ResponseEntity<String> createItem(@RequestBody String itemData) {
        return ResponseEntity.ok("Item created with data: " + itemData);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateItem(@PathVariable int id, @RequestBody String newData) {
        return ResponseEntity.ok("Item " + id + " updated with new data: " + newData);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteItem(@PathVariable int id) {
        return ResponseEntity.ok("Item " + id + " deleted");
    }
}
